//2.Kotlin program to generate a multiplication table


fun main() {
    println("Enter a number")
    val num = readLine()!!.toInt()

    println("Multiplication Table of $num")
    for (i in 1..10) {
        println("$num x $i = $ {num * i}")
    }
}

//for (i in 1..10) means i goes from 1 to 10.
//It prints num x i = result
//
//${num * i} does the multiplication.
//String Templates — $num and ${num * i} put variables and expressions