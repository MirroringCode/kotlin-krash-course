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

    println(rect1 == rect2) // compare basing if they are the same instance / by reference

}

fun sumAreas(vararg shapes: Shape): Double {
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}

interface Shape {
    val area: Float
    val circumference: Float
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