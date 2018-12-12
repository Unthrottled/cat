package io.acari.intro

import java.util.*
import java.util.stream.Collectors

fun migratoryBirds(arr: Array<Int>): Int {
  return arr.map { it }
      .stream()
      .collect(Collectors.toMap({ a: Int -> a }, { 1 }, { a, b -> a+b }))
      .entries
      .stream()
      .collect(Collectors.toCollection {
        TreeSet<MutableMap.MutableEntry<Int, Int>> { a, b ->
          val countDiff: Int = a.value - b.value
          if (countDiff == 0) {
            b.key - a.key
          } else {
            countDiff
          }
        }
      }).last().key
}

fun main(args: Array<String>) {
  val arrCount = readLine()!!.trim().toInt()

  val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

  val result = migratoryBirds(arr)

  println(result)
}
