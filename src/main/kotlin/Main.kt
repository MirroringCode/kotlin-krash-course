fun main() {

    println("Enter a string:")
    val input = readln()

    val favoriteNumbers = intArrayOf(21, 34, 56, 78)
    val evenNumbers = favoriteNumbers.map {
        it * it
    }


    val lambda: (Char) -> Boolean = {
        it.isLetter()
    }

    val lettersOnly = input.myFilter {
        isLetter()
    }

//    val lettersOnly = input.filter(lambda)

/*    val lettersOnly = input.filter { currentCharacter ->
        currentCharacter.isLetter();
    }*/

    println(evenNumbers)
    print(lettersOnly)

}

fun String.myFilter(predicate: Char.() -> Boolean): String {
    return buildString {
        for(char in this@myFilter) {
            if(char.predicate()) {
                append(char)
            }
        }
    }
}
