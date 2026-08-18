fun main() {
    val favoriteNumbers = intArrayOf(1, 2, 3, 69)
    val helloWorld = "Hello World!"

    val evenNumbers = favoriteNumbers.filter { it % 2 == 0 }
    val lettersOnly = helloWorld.filter { it.isLetter() }

    val stringsList = listOf(
        "Hello World!",
        "Bye bye!",
        "How's it going?"
    )
    val integers = listOf(1, 2, 3, 4, 5)

    val filteredStrings = stringsList.myFilter { currentString ->
        currentString.length > 10
    }

    val filteredNumbers = integers.myFilter { it < 3 }

    println(filteredStrings)
    println(filteredNumbers)

}

fun makeNetworkCall(): Result<Int, String> {
    return Result.Failure("Something went wrong")
}

fun <T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (element in this) {
        if (predicate(element)) {
            result.add(element)
        }
    }
    return result.toList()
}

sealed interface Result<out D, out E> {
    data class Success<D>(val data: D): Result<D, Nothing>
    data class Failure<E>(val error: E): Result<Nothing, E>
}