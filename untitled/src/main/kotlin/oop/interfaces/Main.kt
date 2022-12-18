package oop.interfaces

class Main:interface1 {
    override fun foo() { // this method is must override because its abstract
     println("Bar")
    }

    override fun bar() { //it's optional to override or not
        super.bar()
    }
}

fun main() { /* as you can't create an instance form abstract class or interface you can do this
 (inherit this interface in the normal class and create an object from this class as well as you can use all methods inside the interface  )
 */
    val x=Main()
    x.foo()
    x.bar()
}