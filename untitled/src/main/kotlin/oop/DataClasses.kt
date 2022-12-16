package oop
/*
It is not unusual to create classes whose main purpose is to hold data.
 In such classes, some standard functionality and some utility functions are often mechanically derivable from the data.
  In Kotlin, these are called data classes and are marked with data:

data class User(val name: String, val age: Int)
The compiler automatically derives the following members from all properties declared in the primary constructor:

1.equals()/hashCode() pair

2.toString() of the form "User(name=John, age=42)"

3.componentN() functions corresponding to the properties in their order of declaration.

4.copy() function (see below).

To ensure consistency and meaningful behavior of the generated code,
data classes have to fulfill the following requirements:

1.The primary constructor needs to have at least one parameter.

2.All primary constructor parameters need to be marked as val or var.

3.Data classes cannot be abstract, open, sealed, or inner.

Additionally, the generation of data class members follows these rules with regard to the members' inheritance:

If there are explicit implementations of equals(), hashCode(), or toString() in the data class body or final implementations in a superclass, then these functions are not generated, and the existing implementations are used.

If a supertype has componentN() functions that are open and return compatible types, the corresponding functions are generated for the data class and override those of the supertype. If the functions of the supertype cannot be overridden due to incompatible signatures or due to their being final, an error is reported.

Providing explicit implementations for the componentN() and copy() functions is not allowed.
 */

// -------TODO-------
/*
1.How to create data class and create an instance object form it
2.How to pass a default value to data class constructor
3.How to use componentN() functions
4.How to destruct an object into a number of variables
5.How to use copy() function
 */

fun main() {
    val dc1=personInfo("Mohamed",22)
    val dc2=personInfo("Ahmed",33)
    println(dc1==dc2)
    println(dc1.printInfo())
    println(dc2.printInfo())

    val dc3=DefaultValue()
    println(dc3.component1()) //3.How to use componentN() functions
    println(dc3.component2())//component means the variable inside constructor (1 to first element etc..)

    val (name,age)=personInfo("messi",35) //4.How to destruct an object into a number of variables
    println(name) // you can change this variables name to any name
    println(age)

    val obj=Shifts(22,"SAT","PM")
    println(obj)
    val copy= obj.copy(date=30,day="SUN",shift="AM")
    println(copy)




}
//1.How to create data class and create an instance object form it

data class personInfo(val name:String,val Age:Int){

    fun printInfo():String{
        return "My name is $name and my age is $Age"
    }
}
//2.How to pass a default value to data class constructor
data class DefaultValue(val name :String="Ali",val Age:Int=34)

data class Shifts(val date:Int,val day:String,val shift:String)
