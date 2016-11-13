/**
  * EECS 293
  * Created by Daniel on 11/12/2016.
  * dbg28@case.edu
  */
object ArabicToRomanConverter extends App{
    val arabicToRomanMap = Map{
      1000 -> "M"
      900 -> "CM"
      500 -> "D"
      400 -> "CD"
      100 -> 'C
      90 -> "XC"
      50 -> 'L'
      40 -> "XL"
      10 -> "X"
      9 -> "IX"
      5 -> "V"
      4 ->"IV"
      1 ->"I"
    }
}
