package oop.inheritance

fun main() {

    val obj1=B()
    obj1.name="Mohamed"
    obj1.age=34
    obj1.job="Developer"
    println(obj1.printInfo())
    println(obj1.printJob())


    val obj2=C()
    obj2.name="Ahmed"
    obj2.age=23
    obj2.job="CEO"
    obj2.email="Ahmed33o@hotmail.com"
    println(obj2.printInfo())
    println(obj2.printJob())
    println(obj2.printEmail())
}