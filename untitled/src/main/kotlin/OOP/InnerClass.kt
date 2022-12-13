package OOP

fun main() {

    // also in the invoking way instead of using the outer class.nested class use the object.inner class
    val obj=outerClass()
    obj.firstName
    obj.lastName
    obj.innerClass() // invoking the inner class
    obj.innerClass().Account("@tre.md") // invoking the function inside the inner class




}


class outerClass{
    // inner class allowed to use variable which found in the outer class "use inner keyword before the class keyword"
    val  firstName:String="Mohamed"
    val lastName:String="Ahmed"
    fun printFullName(){
        println("Your Full Name Is $firstName $lastName")
    }

    inner class innerClass{

        fun Account(postfix:String){
            println("${firstName}_$lastName $postfix") // using the variable in the outer class in the inner class normally
        }

    }


}