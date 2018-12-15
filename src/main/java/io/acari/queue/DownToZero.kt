package io.acari.queue

import java.lang.Math.*
import java.util.*
import kotlin.collections.HashMap
import kotlin.math.ceil

fun downToZero(n: Int, memory: MutableMap<Int, Int>): Int {
  return findOptimalReductions(n, memory)
}

fun findOptimalReductions(n: Int, memory: MutableMap<Int, Int>): Int {
  return if (n == 1 || n == 0) {
    n
  } else if (memory.containsKey(n)) {
    memory[n]!!
  } else {
    val findOptimalReductions1 = findOptimalReductions(n - 1, memory)
    val others = 2.rangeTo(ceil(n / 2.toDouble()).toInt())
        .filter { n % it == 0 }
        .map {
          findOptimalReductions(max(it, n / it), memory) }
        .min() ?: Int.MAX_VALUE
    memory[n] = min(findOptimalReductions1, others) + 1
    memory[n]!!
  }
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val q = scan.nextLine().trim().toInt()
  val memory = HashMap<Int, Int>()
  for (qItr in 1..q) {
    val n = scan.nextLine().trim().toInt()

    val result = downToZero(n, memory)

    println(result)
  }
}
