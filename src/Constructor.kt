class Employee (var name: String, var position :String, var salary: Double, var Status: String){

    fun work(){
        println("Employee is working")
    }

}

fun main() {
    var employee1 = Employee("Martha","CEO",560000.00, "Married")
    println(employee1.name +" "+ employee1.position + " "+ employee1.salary +" "+employee1.Status)

    var employee2 = Employee("Job","HR",160000.00, "Married")
    println(employee2.name +" "+ employee2.position + " "+ employee2.salary +" "+employee2.Status)

    var employee3 = Employee("Stephen","Technical Officer",160000.00, "Single")
    println(employee3.name +" "+ employee3.position + " "+ employee3.salary +" "+employee3.Status)

    var employee4 = Employee("Ann","Receptionist",80000.00, "Married")
    println(employee4.name +" "+ employee4.position + " "+ employee4.salary +" "+employee4.Status)

    var employee5 = Employee("Benjamin","Marketing",90000.00, "Single")
    println(employee5.name +" "+ employee5.position + " "+ employee5.salary +" "+employee5.Status)



}