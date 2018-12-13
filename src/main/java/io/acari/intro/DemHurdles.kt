package io.acari.intro

import java.util.*

fun hurdleRace(k: Int, height: Array<Int>): Int =
    k

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val nk = scan.nextLine().split(" ")

  val n = nk[0].trim().toInt()

  val k = nk[1].trim().toInt()

  val height = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

  val result = hurdleRace(k, height)

  println(result)
}