package Lazyproperties

/*
1.Lazy only use with the immutable variables which start with val
2.It works with delegation term
2.Initialization only happen when you use the item in first time only
4.When you call this item again there's no initialization again its only give the memory adders
 */

fun main() {



    val obj:Test by lazy {
        Test("Mohamed")
    }
    println(obj) // will initialize in this time only
    println(obj)//just gives only the memory address
    println(obj)



}

class Test(val name:String){
    init {
        println("Hi $name")
    }

}