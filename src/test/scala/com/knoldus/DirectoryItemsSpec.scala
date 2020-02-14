package com.knoldus

import java.io.File
import java.io.FileNotFoundException
import java.io.IOException


import org.scalatest.BeforeAndAfterAll
import org.scalatest.FlatSpec

class DirectoryItemsSpec extends FlatSpec with BeforeAndAfterAll {

  var directoryItems: DirectoryItems = _

  override def beforeAll(): Unit = {
    directoryItems = new DirectoryItems
  }

  override def afterAll(): Unit = {
    if (directoryItems != null) {
      directoryItems = null
    }
  }

  "getDirectory method " should "return the directory from the path specified" in {
    val dirName = "/home/knoldus/Downloads/sample"
    val expectedDir = new File(dirName).listFiles.toList
    val actualDir = directoryItems.getDirectory(dirName)
    assert(expectedDir == actualDir)
  }
  "getDirectory method " should "will throw exception as path specified in incorrect" in {
    val dirName = "/home/knoldus/Downloads/sampledemo"
    try {
      directoryItems.getDirectory(dirName)
    } catch {
      case exception: FileNotFoundException => assert(exception.getMessage == "Directory not found")
    }
  }
  "getDirectoryItems method " should "return the list of items in directory from the path specified" in {
    val dirName = "/home/knoldus/Downloads/sample"
    val expectedDir = List("sample1/sam/1.scala", "sample1/1.scala", "ConvertCurrencies.scala")
    val actualDir = directoryItems.getDirectoryItems(new File(dirName).listFiles.toList, List.empty[String])
    assert(expectedDir == actualDir.map(_.split(dirName + "/", 2)(1)))
  }
  "getDirectoryItems method " should " throw exception as its a failure of future " in {
    val dirName = "/home/knoldus/Downloads/sample"
    try {
      directoryItems.getDirectoryItems(new File(dirName).listFiles.toList, List.empty[String])
    } catch {
      case exception: Exception => assert(exception.getMessage == "Failure in future")
    }
  }

  "getDirectoryItemsFromFuture method " should " return string of future of success of list" in {
    val dirName = "sample"
    val expected = "sample1/sam/1.scala,sample1/1.scala,ConvertCurrencies.scala"
    val actual = directoryItems.getDirectoryItemsFromFuture(dirName)
    assert(expected == actual)

  }
}
