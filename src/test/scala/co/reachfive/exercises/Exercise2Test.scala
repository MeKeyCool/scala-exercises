package co.reachfive.exercises

import org.scalatest.{Matchers, FunSuite}

/*
 * Remove consecutive duplicates
 */
class Exercise2Test extends FunSuite with Matchers {

  test("that list without duplicates is returned untouched") {
    Exercise2.compress(List('a', 'b', 'a', 'c', 'b')) should equal(List('a', 'b', 'a', 'c', 'b'))
  }

  test("that compress consecutive duplicates") {
    val duplicates = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    Exercise2.compress(duplicates) should equal(List('a', 'b', 'c', 'a', 'd', 'e'))
  }
}
