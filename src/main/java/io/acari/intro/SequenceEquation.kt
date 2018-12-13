package io.acari.intro

import java.util.*

fun permutationEquation(p: Array<Int>): Array<Int> {
  return p
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val n = scan.nextLine().trim().toInt()

  val p = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

  val result = permutationEquation(p)

  println(result.joinToString("\n"))
}