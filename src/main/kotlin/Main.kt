fun main() {


    println("Enter a string:")
    val input = readln()
    reversed(input)
}

fun reversed(stringToReverse: String) {
    val finalString = buildString {
        for (i in stringToReverse.lastIndex downTo 0) {
            append(stringToReverse[i])
        }
    }

    println(finalString)
}