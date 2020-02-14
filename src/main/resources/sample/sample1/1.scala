package com.knoldus

class ConvertCurrencies {
  def convertRupeesIntoAnotherCurrencies(rupees: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase match {
      case "dollar" => rupees / 71.22
      case "euro" => rupees / 78.39
      case "poundsterling" => rupees / 92.53
      case "yen" => rupees / 0.65
      case "ringgit" => rupees / 17.44
      case "sgd" => rupees / 52.43
      case "aud" => rupees / 48.07
      case "cad" => rupees / 54.03
      case _ => throw new Exception("invalid currency")
    }
  }

  def convertDollarIntoAnotherCurrencies(dollar: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase match {
      case "rupees" => dollar * 71.22
      case "euro" => dollar * 0.91
      case "poundsterling" => dollar * 10.78
      case "yen" => dollar * 109.73
      case "ringgit" => dollar * 4.14
      case "sgd" => dollar * 1.34
      case "aud" => dollar * 1.50
      case "cad" => dollar * 1.33
      case _ => throw new Exception("invalid currency")
    }
  }

  def convertEuroIntoAnotherCurrencies(euro: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase() match {
      case "dollar" => euro * 1.09
      case "rupees" => euro * 78.28
      case "poundsterling" => euro * 0.85
      case "yen" => euro * 120.11
      case "ringgit" => euro * 4.53
      case "sgd" => euro * 1.52
      case "aud" => euro * 1.64
      case "cad" => euro * 1.46
      case _ => throw new Exception("invalid currency")
    }
  }

  def convertPoundSterlingIntoAnotherCurrencies(poundSterling: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase() match {
      case "dollar" => poundSterling * 1.29
      case "euro" => poundSterling * 1.18
      case "rupees" => poundSterling * 92.20
      case "yen" => poundSterling * 141.47
      case "ringgit" => poundSterling * 5.34
      case "sgd" => poundSterling * 1.79
      case "aud" => poundSterling * 1.93
      case "cad" => poundSterling * 1.71
      case _ => throw new Exception("invalid currency")
    }
  }

  def convertYenIntoAnotherCurrencies(yen: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase() match {
      case "dollar" => yen * 0.0091
      case "euro" =>  yen *  0.0083
      case "poundsterling" =>  yen *  0.0071
      case "rupees" =>  yen *  0.65
      case "ringgit" =>  yen *  0.038
      case "sgd" =>  yen * 0.013
      case "aud" =>  yen *  0.014
      case "cad" =>  yen *  0.012
      case _ => throw new Exception("invalid currency")
    }
  }

  def convertRinggitIntoAnotherCurrencies(ringgit: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase() match {
      case "dollar" => ringgit * 0.24
      case "euro" => ringgit * 0.22
      case "poundsterling" =>ringgit * 0.19
      case "yen" => ringgit * 26.49
      case "rupees" => ringgit * 17.27
      case "sgd" => ringgit *0.34
      case "aud" => ringgit * 0.36
      case "cad" => ringgit * 0.32
      case _ => throw new Exception("invalid currency")
    }
  }

  def convertSgdIntoAnotherCurrencies(sgd: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase() match {
      case "dollar" => sgd * 0.72
      case "euro" => sgd * 0.66
      case "poundsterling" => sgd * 0.56
      case "yen" => sgd *  78.96
      case "ringgit" => sgd * 2.98
      case "rupees" => sgd * 51.46
      case "aud" => sgd * 1.08
      case "cad" => sgd *  0.96
      case _ => throw new Exception("invalid currency")
    }
  }

  def convertAudIntoAnotherCurrencies(aud: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase() match {
      case "dollar" => aud * 0.67
      case "euro" =>  aud *0.61
      case "poundsterling" =>  aud * 0.52
      case "yen" =>  aud * 73.24
      case "ringgit" =>  aud * 2.76
      case "sgd" =>  aud * 0.93
      case "rupees" =>  aud * 47.22
      case "cad" =>  aud * 0.89
      case _ => throw new Exception("invalid currency")
    }
  }

  def convertCadIntoAnotherCurrencies(cad: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase() match {
      case "dollar" => cad * 0.75
      case "euro" => cad * 0.69
      case "poundsterling" =>cad * 0.58
      case "yen" => cad * 82.45
      case "ringgit" =>cad * 3.11
      case "sgd" => cad * 1.04
      case "aud" => cad * 1.13
      case "rupees" => cad * 53.73
      case _ => throw new Exception("invalid currency")
    }
  }



}