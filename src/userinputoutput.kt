import  java.util.Scanner

fun main() {
    var read = Scanner (System.`in`)
    println("ENTER YOUR FULLNAME : ")
     var fullname = readln()
    println("FULLNAME :$fullname")




   print("HOW OLD ARE YOU (IN YEARS?) :")
    var age = read.nextInt()
    println("Age :$age")

    println("Enter weight(in Kg :")
    var weight = read.nextDouble()
    println("Weight : $weight")



    println()

    println("Summary of your information")
    println("Fullname :$fullname")
    println("Age :$age years old")
    println("Weight :$weight kg")
    println("---------Thank You--------")






}