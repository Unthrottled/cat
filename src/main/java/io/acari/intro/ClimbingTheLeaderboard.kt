package io.acari.intro

import java.util.*
import java.util.stream.Collectors

fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
  val ranks = scores.toList().stream().collect(Collectors.toCollection { TreeSet<Int>() }).toList()
  return alice.map { Collections.binarySearch(ranks, it) }
      .map { if(it < 0)
        ranks.size + 1 - Math.abs(it + 1)
      else
        ranks.size - it
      }
      .toTypedArray()
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val scoresCount = scan.nextLine().trim().toInt()

  val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

  val aliceCount = scan.nextLine().trim().toInt()

  val alice = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

  val result = climbingLeaderboard(scores, alice)

  println(result.joinToString("\n"))
}
