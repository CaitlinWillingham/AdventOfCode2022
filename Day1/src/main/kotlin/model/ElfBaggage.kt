package model

import java.util.function.BinaryOperator

class ElfBaggage (var index: Int) {
    val calories = mutableListOf<Int>()
    fun sum(): Int {
        return this.calories.stream().reduce(0
        ) { a: Int, b: Int -> Integer.sum(a, b) }
    }

    override fun toString(): String {
        return "ElfBaggage(index=$index, calories=$calories, sum=${sum()})"
    }

}