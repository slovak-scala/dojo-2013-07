package dojo

import org.scalatest.FlatSpec
import org.scalatest.matchers.{MustMatchers, ShouldMatchers}

/**
 * FizzBuzz Specification
 */
class FizzBuzzSpec extends FlatSpec with ShouldMatchers with MustMatchers {

  behavior of "FizzBuzz"

  it should "pre 7 vrati 7" in {
    assert( FizzBuzz.hra(7) == "Wizz")
  }
  it should "pre 3 vrati Fizz" in {
    assert( FizzBuzz.hra(3) === "Fizz")
  }

  it should "pre 5 vrati Buzz" in {
    assert( FizzBuzz.hra(5) === "Buzz")
  }

  it should "pre 15 vrati FizzBuzz" in {
    assert( FizzBuzz.hra(15) === "FizzBuzz")
  }

  it should "pre 1 vrati 1" in {
    assert( FizzBuzz.hra(1) === "1")
  }

  it should "pre 30 vrati FizzBuzz" in {
    assert( FizzBuzz.hra(30) === "FizzBuzz")
  }

  it should "pre 21 vrati FizzWizz" in {
    assert( FizzBuzz.hra(21) === "FizzWizz")
  }

  it should "pre vsetky nasobky 3 vrati Fizz" in {
    for(x <- (0 to 100 by 3) if x % 5 != 0 && x % 7 != 0)
      assert( FizzBuzz.hra(x) === "Fizz")
  }

  it should "pre prve cisla vrati spravny string" in {
    assert (FizzBuzz.cyklus(15) === "1,2,Fizz,4,Buzz,Fizz,Wizz,8,Fizz,Buzz,11,Fizz,13,Wizz,FizzBuzz")
  }
}