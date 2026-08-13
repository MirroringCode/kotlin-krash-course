fun main() {

    println("Enter a string:")
    val input = readln()

    val favoriteNumbers = intArrayOf(21, 34, 56, 78)
    val evenNumbers = favoriteNumbers.filter { it % 2 == 0}



    val lambda: (Char) -> Boolean = {
        it.isLetter()
    }

    val lettersOnly = input.filter {
        it.isLetter()
    }

//    val lettersOnly = input.filter(lambda)

/*    val lettersOnly = input.filter { currentCharacter ->
        currentCharacter.isLetter();
    }*/

    println(evenNumbers)
    print(lettersOnly)

}
