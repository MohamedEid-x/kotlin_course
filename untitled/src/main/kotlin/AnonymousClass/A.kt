package AnonymousClass
/*
Object expressions create objects of anonymous classes, that is,
classes that aren't explicitly declared with the class declaration.
 Such classes are useful for one-time use. You can define them from scratch,
 inherit from existing classes, or implement interfaces. Instances of anonymous classes are also called anonymous
 objects because they are defined by an expression, not a name.

Creating anonymous objects from scratch
Object expressions start with the object keyword.

If you just need an object that doesn't have any nontrivial supertypes, write its members in curly braces after objec
 */

fun main() {

    // Anonymous class for one use, or you don't need to create a class
    val helloWorld=object {
        val hello = "Hello"
        val world = "World"

        override fun toString() = "$hello $world"

        val firstName = "Mohamed"
        val secondName = "Ahmed"
        fun fullName() = "$firstName $secondName"
    }
    println(helloWorld)
    println(helloWorld.fullName())
    }
