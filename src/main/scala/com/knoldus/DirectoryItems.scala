package com.knoldus


import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import java.io.{File, FileNotFoundException}


class DirectoryItems {

  def getDirectoryItems(dir: List[File], itemList: List[String]): List[String] = {

    dir match {
      case Nil => itemList
      case item :: Nil => if (item.isFile) {
        item.getAbsolutePath :: itemList
      } else {
        getDirectoryItems(item.listFiles().toList, itemList)
      }
      case item :: rest => if (item.isFile) {
        getDirectoryItems(rest, item.getAbsolutePath :: itemList)
      } else {
        getDirectoryItems(dir.drop(1) ::: item.listFiles().toList, itemList)
      }
    }
  }

  def getDirectory(dirName: String): List[File] = {
    val dir = new File(dirName)
    if (dir.exists && dir.isDirectory) dir.listFiles.toList else throw new FileNotFoundException("Directory not found")
  }

  def getDirectoryItemsFromFuture(dirName: String): String = {


    val absolutePath = "/home/knoldus/Downloads/"
    val dir = getDirectory(absolutePath + dirName)

    val dirItems: Future[List[String]] = Future {
      getDirectoryItems(dir, List.empty[String])
    }
    val timeInMilliSecond = 3000

    dirItems.onComplete {
      case Success(items) => items.map(_.split(dirName + "/", 2)(1))
      case Failure(_) => throw new Exception("Failure in future")
    }
    Thread.sleep(timeInMilliSecond)
    dirItems.toString.split(",").map(_.split(dirName + "/", 2)(1)).mkString(",").split("\\)")(0)
  }

}
