import scala.annotation.tailrec
import scala.collection.immutable.ListMap

/**
  * Created by Daniel on 11/12/2016.
  * dbg28@case.edu
  *
  * Converts an input integer to its corresponding Arabic Numeral
  */
object ArabicToRomanConverter extends App{
  // Map of directly convertible Numeral - Arabic equivalents
    val arabicToRomanMap = ListMap (
      1000 -> "M", 900 -> "CM", 500 -> "D", 400 -> "CD", 100 -> "C", 90 -> "XC",
        50 -> 'L',  40 -> "XL",  10 -> "X",   9 -> "IX",   5 -> "V", 4 -> "IV" , 1 -> "I" )


  /**
    * Converts an integer to its roman numeral equivalent
    * @param toConvert the input int
    * @param roman roman numeral equivalent
    * @return
    */
  @tailrec
  def convert(toConvert: Int, roman: String = ""): String = {
    if (0 == toConvert) roman
    else{ convert(toConvert - maxContained(toConvert), roman + arabicToRomanMap(maxContained(toConvert)))
    }
  }

  /**
    * Finds the largest integer that has a direct roman numeral equivalent, smaller than or equal to input
    * @param arabic the integer to find a roman numeral for
    * @return the largest int with a roman numeral equivalent <= standard
    */
  def maxContained(arabic: Int): Int = {
    for(key <- arabicToRomanMap.keys)
        if(arabic >= key) return key
    1 // If not found, we can always count by '1's
  }

  for(i <- 1 to 100){
    println(s"$i equals ${convert(i)} in Roman Numerals")
  }


}
