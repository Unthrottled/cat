package io.acari.intro

import java.lang.RuntimeException
import java.util.*
import java.util.stream.Collectors

fun birthdayCakeCandles(candleHeights: List<Int>): Int {
  return candleHeights.stream().
      collect(Collectors.toMap({ a: Int-> a}, {1}, { a, b -> a+ b}))
      .entries.stream()
      .max{ a, b->a.key - b.key }
      .map { it.value }
      .orElseThrow { RuntimeException("I was told there was cake") }
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val arCount = scan.nextLine().trim().toInt()

  val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toList()

  val result = birthdayCakeCandles(ar)

  println(result)
}