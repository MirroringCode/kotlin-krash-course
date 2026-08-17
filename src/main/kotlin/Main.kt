import kotlin.math.PI
import kotlin.math.sqrt

fun main() {

    val rect1 = Rectangle(
        width = 5f,
        height = 7f
    )

    val rect2 = rect1.copy(
        height = 10f
    )

    val circle = Circle(radius = 5f)
    println(circle.area)

    println(rect2)

    println(rect1 == rect2) // compare basing if they are the same instance / by referenc

    printShapes(rect1, circle)

    println(greetMe(Country.GERMANY))

    for (country in Country.entries) {
        println(country.code)
    }
}

enum class Country(val code: String) {
    GERMANY("DE"),
    FRANCE("FR"),
    USA("US")
}

fun greetMe(country: Country): String {
    return when(country) {
        Country.GERMANY -> "hh"
        Country.FRANCE -> "h2"
        Country.USA -> "h3"
    }
}

fun sumAreas(vararg shapes: Shape): Double {
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}

/*abstract class Shape {
    abstract val area: Float
    abstract val circumference: Float
}*/

/*open class Shape {
    var counter = 0

    open val area: Float
    open val circumference: Float

    fun inc() {
        counter++
    }
}*/

/*interface Shape {
    val area: Float
    val circumference: Float
}*/

sealed interface Shape {
    val area: Float
    val circumference: Float
}

fun printShapes(vararg shapes: Shape) {
    for (shape in shapes) {
/*        when(shape) {
            is Circle -> println("That's a circle")
            is Rectangle -> println("That's a rectangle")
        }*/
        val output = when(shape) {
            is Circle -> "That's a circle"
            is Rectangle -> "That's a rectangle"
            is FixSizeSquare -> "That's a fix size square"
        }
        println(output)
    }
}

data object FixSizeSquare: Shape {
    override val area = 16f
    override val circumference = 16f
}


data class Rectangle(
    val width: Float,
    val height: Float
): Shape {

    val diagonal = sqrt(width * width + height * height)

    override val area = width * height

    override val circumference = 2 * width + 2 * height
/*    override val circumference: Float
        get() = 2 * width + 2 * height*/
}

data class Circle(val radius: Float): Shape {
    override val area = radius * radius * PI.toFloat()

    override val circumference = 2 * radius * PI.toFloat()


    val diameter = 2 * radius
}