package oop

fun main() {
    val obj =Info("Ahmed","Mohamed")
    obj.favoraitCity="Alex"
  println(obj.toString())


}


class Info (var firstName:String, var lastName:String){
   lateinit var favoraitCity:String // use lateinit to postpone initialize the variable to another time
// if this variable still empty after use lateinit the "UninitializedPropertyAccessException" will appear
   fun fullName():String="$firstName $lastName"

    override fun toString(): String {
        return fullName() + "'s favorite is :$favoraitCity"
    }
}

/*
Normally, properties declared as having a non-null type must be initialized in the constructor.
However, it is often the case that doing so is not convenient.
For example, properties can be initialized through dependency injection, or in the setup method of a unit test.
In these cases, you cannot supply a non-null initializer in the constructor,
but you still want to avoid null checks when referencing the property inside the body of a class.
 */