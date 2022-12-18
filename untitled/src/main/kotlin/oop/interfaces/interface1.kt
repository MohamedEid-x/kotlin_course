package oop.interfaces

/*
1.How to create an interface
2.How to create an abstract fun or normal fun inside the interface(fun with body or not)
3.How to implement interface
3.How to use multi inheritance with interface
 */
//Remember that you can extend only one class to another class, but also you can implement more than one interface
// you can implement more than one interface to another one
interface interface1:interface2,interface3,interface4,interface5 { // implement more than one interface
    //2.How to create an abstract fun or normal fun inside the interface(fun with body or not)

    fun foo()// automatically consider this fun without body abstract fun
    fun bar(){} //this an optional fun

}
open class Demo{}
class Test:Demo(),interface1,interface2,interface3{ // extend only one class and more than one interface
    override fun foo() {
        TODO("Not yet implemented")
    }
}