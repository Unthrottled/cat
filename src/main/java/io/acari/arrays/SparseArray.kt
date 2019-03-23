package io.acari.arrays

/**
 * Forged in the flames of battle by alex.
 */
import java.util.*

fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> =
    queries.map { query ->
      strings.filter { stringo -> stringo == query }.count()
    }.toTypedArray()

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val stringsCount = scan.nextLine().trim().toInt()

  val strings = 0.until(stringsCount).map { scan.nextLine() }.toTypedArray()

  val queriesCount = scan.nextLine().trim().toInt()

  val queries = 0.until(queriesCount).map { scan.nextLine() }.toTypedArray()

  val queryResults = matchingStrings(strings, queries).joinToString("\n")

  println(queryResults)
}
