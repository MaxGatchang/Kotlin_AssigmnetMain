import java.lang.Math.sqrt

fun main (args: Array<String>) {
    //1. Solve the equation x2+10x+25 = 0  - x = (-b+-Sqrt(b2-4ac))/2a
    //Below is the solution for the above question
    val a = 1.0
    val b = 10.0
    val c = 25.0
    val discriminant = b * b - 4 * a * c

    when {
        discriminant > 0 -> {
            val x1 = (-b + sqrt(discriminant)) / (2 * a)
            val x2 = (-b - sqrt(discriminant)) / (2 * a)
            println("Two distinct real roots:")
            println("x1 = $x1")
            println("x2 = $x2")
        }
        discriminant == 0.0 -> {
            val x = -b / (2 * a)
            println("One real root (repeated):")
            println("x = $x")
        }
        else -> {
            val realPart = -b / (2 * a)
            val imaginaryPart = sqrt(-discriminant) / (2 * a)
            println("Two complex roots:")
            println("x1 = $realPart + ${imaginaryPart}i")
            println("x2 = $realPart - ${imaginaryPart}i")
        }
    }

}