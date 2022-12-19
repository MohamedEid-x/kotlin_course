package SAM
/*
An interface with only one abstract method is called a functional interface,
or a Single Abstract Method (SAM) interface.
The functional interface can have several non-abstract members but only one abstract member.
 */
 // Functional (SAM) interfaces

                // creation
 fun interface  TestInterFace{
     fun printName():String  //abstract method

     fun printAge(Age:Int):Int{ // normal method
         return Age
     }
 }


fun main() {

    val testObj=object:TestInterFace{
        override fun printName(): String {
           return "Mohamed Eid "
        }

        override fun printAge(Age: Int): Int {
            return super.printAge(Age)
        }
    }
    println(testObj.printAge(44))
    println(testObj.printName())

/*
For functional interfaces,
you can use SAM conversions that help make your code
more concise and readable by using lambda expressions.
 */

    val obj= MyInter() { name:String, Age:Int->name+""+Age } // with lambda expression
}
fun interface MyInter{
    fun printInfo(name:String,Age: Int):String
}