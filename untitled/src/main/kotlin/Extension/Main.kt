package Extension

fun main() {

    fun main() {

        val name="Mohamed Eid "
        println(name.initials())

    }

       val age:Int=14
      println(  age.isAdult())

    val obj= Person("Mohamed Eid",43)
    println(obj.name.initials())
    println(obj.fullName())


    val name1:String="Mohamed"
    name1.wordLength()


}

class Person(val name:String,val age:Int)