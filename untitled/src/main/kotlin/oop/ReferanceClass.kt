package oop

class ReferanceClass() {

    var firstName: String = ""
    var lastName: String = ""


    fun printFullName() {
        println("$firstName $lastName")
    }

    fun printNameWithPrefix(prefix:String){
        println("$prefix $firstName")
    }

    // Reference class created in the OOP package
}