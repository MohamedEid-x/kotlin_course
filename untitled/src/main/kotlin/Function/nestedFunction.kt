package Function
/*
* if you used the nested functions to invoke the all function you must invoke the child fun inside its parent bady
*
 */
fun main() {
    sayHi("mohamed")

}


// nested function>> how to create function inside anther function
fun sayHi(name:String) //parent
{
    println("Hi $name")
        fun sayBye()
        { //child
            println("Bye $name")
            fun comeAgain()
            {
                println("come again $name")
            }
        }
    sayBye() // to use the child fun you must invoke it in the parent body and if you invoke the parent fun automatically the child fun invoked


}

