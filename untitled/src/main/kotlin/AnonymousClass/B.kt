package AnonymousClass

// inherit from another class and implement an interface

fun main() {
    val testObj=object :Test("Mohamed"),Age{
        override fun printAge(): String {
            return "My age is 34 "
        }


    }
    println(testObj.printName())
    println(testObj.printAge())

}

interface Age{
    fun printAge():String
}
open class Test(val name:String){
    open fun printName():String {
        return "My name is $name"
    }
}