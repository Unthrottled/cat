package io.acari.arrays

import java.util.*

/**
 * Forged in the flames of battle by alex.
 */
fun solve(a: Array<Int>, queries: Array<Array<Int>>): Array<Int> =
    queries
        .map {
          if(it[0] == 1){
            val left = it[1] - 1
            val right = it[2] - 1
            val jumps = (right - left) / 2
            0.rangeTo(jumps).forEach {
              val index = 2*it + left
              val temp = a[index]
              a[index] = a[index + 1]
              a[index + 1] = temp
            }
          }
          it
        }
        .filter { it[0] == 2 }
        .map { a.copyOfRange(it[1]-1,it[2]).sum() }
        .toTypedArray()

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val nq = scan.nextLine().split(" ")

  val n = nq[0].trim().toInt()

  val q = nq[1].trim().toInt()

  val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

  val queries = 0.until(q)
      .map {
        scan.nextLine().split(" ")
            .map { it.trim().toInt() }
            .toTypedArray()
      }.toTypedArray()

  val result = solve(a, queries)

  println(result.joinToString("\n"))
}
