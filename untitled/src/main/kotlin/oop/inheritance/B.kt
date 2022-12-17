package oop.inheritance
//subclass for A
// superclass for C
open class B:A() {

    var job:String=""


    fun printJob():String{
        return "$job"
    }
     fun allInfo():String{
        return super.printInfo() // super mean the item in the super class
    }

}