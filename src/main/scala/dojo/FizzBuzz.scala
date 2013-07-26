package dojo

/**
 * FizzBuzz game kata from [[http://codingdojo.org/cgi-bin/wiki.pl?KataFizzBuzz]]
 *
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number
 * and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
 *
 * Sample output:
 * {{{
 * 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16 ... etc up to 100
 * }}}
 *
 * Variations, new requirements:
 * 1. A number is Wizz if it is divisible by 7
 * 2. Write everything immutable, no vars, no for loops
 * 3. A number is Fizz if it is divisible by 3 or if it has a 3 in it
 * 4. A number is Buzz if it is divisible by 5 or if it has a 5 in it
 * 5. Write a program using PartialFunctions
 *
 * Happy coding :)
 */
object FizzBuzz {
  def cyklus(i: Int): String = (for(x <- 1 to i) yield hra(x)).mkString(",")

  val delitele:Seq[Int => Option[String]] = Seq(
    del(_:Int,3,"Fizz"),
    del(_:Int,5,"Buzz"),
    del(_:Int,7,"Wizz")
  )

  def del(delenec:Int,delitel:Int,vysl:String):Option[String] = if(delenec % delitel == 0) Some(vysl) else None

  def hra(i: Int):String = {
    delitele.map( fn => fn(i) ).collect{ case Some(s) => s} match {
      case Nil => i.toString
      case l => l.mkString
    }
  }

  def main(args: Array[String]) = {
    // do something
  }
}