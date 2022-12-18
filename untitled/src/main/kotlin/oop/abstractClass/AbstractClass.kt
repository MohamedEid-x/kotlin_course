package oop.abstractClass
/*
1.How to create an abstract class
2.How to implement an abstract class (class C)
 */


abstract class A (val name:String,val age:Int){

    abstract fun printName() // all functions inside the abstract class without implementation
    abstract fun printAge()
}

class B:A("Mohamed",33){
    //when you make an inheritance from the abstract class you must override all methods inside
    override fun printAge() {
        println(name)
    }

    override fun printName() {
        println(age)
    }
}

fun main() {

    val obj= B()
    obj.printName()
    obj.printAge()
}
