fun main() {


    println("How many numbers will you enter")
    val amountOfNumbers = readln().toIntOrNull() ?: 0;
//    var i = 0

    val numbers = mutableListOf<Int>()
    var sum = 0

    for (i in 0 until amountOfNumbers) {
        println("Please enter number #${i + 1}")
        val number = readln().toIntOrNull() ?: continue
        numbers.add(number)
        sum += number
    }


    for (number in numbers) {
        println(number)
    }







/*    var sum = 0
    var i = 0;
    var numbers = intArrayOf();*/
/*    while (i < amountOfNumbers) {
        println("Please enter number #${i + 1}")
        val number = readln().toIntOrNull() ?: 0;

        sum += number
        numbers += number;
        i++
    }*/

    println("Numbers : ${numbers}")
    println("The total sum is $sum")


}