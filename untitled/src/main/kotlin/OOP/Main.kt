package OOP

fun main() {
    // invoking class
    val user= ReferanceClass()
    //calling attributes
    user.firstName="Mohamed"
    user.lastName="Eid"
    user.printFullName() //calling function
println("______________________________________________________________________________________________________________")
    val user2=ReferanceClass()
    user2.firstName="Ahmed"
    user2.printNameWithPrefix("MR,") //calling function with parameter
println("______________________________________________________________________________________________________________")
//using constructor

    val user3=Constructor("mohamed","Eid",true)// using primary constructor
    user3.printFullName()
    println("___________________________________________")
    val user4=Constructor("Ahmed","Said") // 2nd constructor
    user4.printName()
    println("___________________________________________")
    val user5=Constructor("Ali") //2nd & 3rd constructor
    user5.printNameWithPrefix("Mr,")

}



