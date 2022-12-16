package oop

class A {
    /*
    If you need to write a function that can be called without having a class instance but
     that needs access to the internals of a class (such as a factory method),
     you can write it as a member of an object declaration inside that class.

Even more specifically, if you declare a companion object inside your class,
 you can access its members using only the class name as a qualifier.
     */
        companion object{
            var firstName="Mohamed"
            var lastName= "Ahmed"
        fun fullName()="$firstName $lastName"
        fun fullNameLength():Int{
            return fullName().length

        }

        }

}

fun main() {
        // you can invoke class without instance from it
    println(A.firstName)
    println(A.lastName)
    println(A.fullName())
    println(A.fullNameLength())

    val name= A.fullName()
}

/*Names of constants (properties marked with const,
 or top-level or object val properties with no custom get function that hold deeply immutable data)
 should use uppercase underscore-separated (screaming snake case) names:

const val MAX_COUNT = 8
val USER_NAME_FIELD = "UserName"

 */