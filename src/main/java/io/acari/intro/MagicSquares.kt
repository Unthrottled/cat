package io.acari.intro

import java.util.*
import java.util.stream.Collectors

fun formingMagicSquare(s: Array<Array<Int>>): Int {
  val sums = listOf<(Array<Array<Int>>) -> List<Int>>(
      {
        it.map { column -> column.sum() }
      },
      {
        0.until(s.size).map { row ->
          0.until(s.size).map { col -> s[row][col] }.sum()
        }
      },
      {
        listOf(
            0.until(s.size).map { row -> s[row][row] }.sum(),
            (s.size - 1).downTo(0)
                .map { row -> s[(s.size - 1) - row][row] }.sum()
        )
      }
  ).flatMap { it(s) }
      .stream().collect(Collectors.groupingBy { i: Int -> i })

  return 0
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val s = Array<Array<Int>>(3, { Array<Int>(3, { 0 }) })

  for (i in 0 until 3) {
    s[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
  }

  val result = formingMagicSquare(s)

  println(result)
}