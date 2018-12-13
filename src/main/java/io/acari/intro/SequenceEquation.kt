package io.acari.intro

import java.util.*
import java.util.stream.Collectors

fun permutationEquation(p: Array<Int>): List<Int> {
  val copy = p.mapIndexed { index, i -> Pair(index+1, i) }.stream()
      .collect(Collectors.toMap(
      { pair: Pair<Int, Int> -> pair.second },
      { pair -> pair.first },
      { a, _ -> a }))

  return 1.rangeTo(p.size).map { copy[copy[it]] ?: 0 }
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val n = scan.nextLine().trim().toInt()

  val p = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

  val result = permutationEquation(p)

  println(result.joinToString("\n"))
}