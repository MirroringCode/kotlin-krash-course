fun main() {


    println("Enter a string:")
    val input = readln()
    val reversed = reversed(input)
    println(reversed)

/*    if (input == reversed(input)) {
        println("that's a palindrome")
    }*/

    if (input == reversed) {
        println("that's a palindrome")
    }

    println(reversed(reversed))


}

fun reversed(stringToReverse: String): String {
    val finalString = buildString {
        for (i in stringToReverse.lastIndex downTo 0) {
            append(stringToReverse[i])
        }
    }

    return finalString
}