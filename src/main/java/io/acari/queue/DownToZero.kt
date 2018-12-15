package io.acari.queue

import java.util.*

fun downToZero(n: Int): Int {
return n
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val q = scan.nextLine().trim().toInt()

  for (qItr in 1..q) {
    val n = scan.nextLine().trim().toInt()

    val result = downToZero(n)

    println(result)
  }
}
