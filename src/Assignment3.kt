fun main() {
    print("Enter a number: ")
    val num = readLine()!!.toInt()

    var isPrime = true

    if (num <= 1) {
        isPrime = false
    } else {
        for (i in 2..num / 2) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
    }

    if (isPrime) {
        println("$num is a prime number.")
    } else {
        println("$num is not a prime number.")
    }
}
