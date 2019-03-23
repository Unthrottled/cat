package io.acari.arrays

/**
 * Forged in the flames of battle by alex.
 */

import java.util.*


fun main(args: Array<String>) {
  val scanner = Scanner(System.`in`)

  val input = scanner.nextLine().split(" ")

  val numberItems = input[0].trim().toInt()

  val numberRotations = input[1].trim().toInt()

  val arrayToRotate = scanner.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

  val startingIndex = numberRotations % numberItems

  val rotatedArray = startingIndex.until(startingIndex + numberItems)
      .map { it % numberItems }
      .map { arrayToRotate[it] }
      .joinToString(" ")

  println(rotatedArray)
}
