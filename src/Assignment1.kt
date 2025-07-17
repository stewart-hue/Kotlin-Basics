//Assignment
//
//1. Kotlin program to check leap year
//2.Kotlin program to generate a multiplication table
//3.Kotlin program to check whether a number is prime or not

fun main() {
    println("Enter a year: ")
    val year = readLine()!!.toInt()

    val isLeap = if (year % 4 == 0) {
        if (year % 100 == 0){
            year % 400 == 0
        }else{
            true
        }

    }else {
        false
    }
        if (isLeap){
            println("$year is a leap year")
        }else{
            println("$year is not a leap year")
        }
    }
//readLine() reads one line of input from the user as a String.
//
//!! means “I know this is not null.” (Force unwrap. Be careful!)
//
//.toInt() converts the input to an integer.

//% is the modulus operator.
//fun defines a function.
//
//val declares a read-only variable.
//
//readLine() takes user input.
//
//% is the modulo operator.
//
//if can be used as an expression (it returns a value).
//
//println() prints text with a new line.
//
//!! means “I know this is not null.”