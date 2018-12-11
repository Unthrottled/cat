package io.acari.intro

import java.lang.RuntimeException
import java.util.stream.Stream

fun birthday(chocolateSquares: List<Int>, birthDay: Int, birthMonth: Int): Int {
  return Stream.iterate(0){it+1}
      .limit(chocolateSquares.size.toLong())
      .map { it.toLong() }
      .map { chocolateSquares.stream()
          .skip(it)
          .mapToInt{it}
          .limit(birthMonth.toLong())
          .sum()
      }
      .filter { it == birthDay }
      .count().toInt()
}

fun main(args: Array<String>) {
  val n = readLine()!!.trim().toInt()

  val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toList()
  val dm = readLine()!!.trimEnd().split(" ")

  val d = dm[0].toInt()

  val m = dm[1].toInt()

  val result = birthday(s, d, m)

  println(result)
}