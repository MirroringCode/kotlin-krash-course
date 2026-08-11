fun main() {

    println("Enter a string:")
    val input = readln()

    val favoriteNumbers = intArrayOf(21, 34, 56, 78)
    val evenNumbers = favoriteNumbers.filter { it % 2 == 0}

/*    val lettersonly = input.filter {
        it.isLetter()
    }*/

    val lambda: (Char) -> Boolean = {
        it.isLetter()
    }

    println(evenNumbers)
    print(lettersonly)

}
