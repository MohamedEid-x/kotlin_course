package OOP

class ReferanceClass {

    var firstName: String = ""
    var lastName: String = ""


    fun printFullName() {
        println("$firstName $lastName")
    }

    fun printNameWithPrefix(prefix:String){
        println("$prefix $firstName")
    }
}