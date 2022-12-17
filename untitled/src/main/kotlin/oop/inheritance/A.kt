package oop.inheritance
/*
>> By default, Kotlin classes are final – they can't be inherited.
To make a class inheritable, mark it with the open keyword: open class Base // Class is open for inheritance

>> To declare an explicit supertype, place the type after a colon in the class header:

open class Base(p: Int)

class Derived(p: Int) : Base(p)
 */
// super class for B
open class A{
    var name:String=""
    var age:Int= 0

   open fun printInfo():String{
        return "$name your age is $age"
    }

}