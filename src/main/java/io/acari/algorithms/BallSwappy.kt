package io.acari.algorithms

import java.util.*

fun organizingContainers(container: Array<Array<Int>>): String {
  return "Lol nope"
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val q = scan.nextLine().trim().toInt()

  for (qItr in 1..q) {
    val n = scan.nextLine().trim().toInt()

    val container = Array(n) { Array(n, { 0 }) }

    for (i in 0 until n) {
      container[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = organizingContainers(container)

    println(result)
  }
}
