import java.util.Scanner


fun main() {
//    val scanner = Scanner(System.in)
      val Scanner = Scanner(System.`in`)
    print("Enter the first number: ")
    val num1 = Scanner.nextDouble()

    print("Enter an operator (+, -, *, /, %): ")
       val operator = Scanner.next()[0]
    print("Enter the second number: ")
    val num2 = Scanner.nextDouble()

    val result = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> {
            if (num2 != 0.0) num1 / num2
            else {
                println("Error: Cannot divide by zero.")
                return
            }
        }

        '%' -> {
            if (num2 != 0.0) num1 % num2
            else {
                println("Error: Cannot mod by zero.")
                return
            }
        }

        else -> {
            println("Invalid operator.")
            return
        }
    }

    println("Result: $num1 $operator $num2 = $result")
}