package oop.abstractClass

abstract class C(val name:String) {

    init {
        println("My name is $name")
    }

    fun displayId(id:Int){
        println("My id is $id")

    }
    abstract fun displayJob(title:String)
}

class D(name:String):C(name){
    override fun displayJob(title: String) {
       println("I'm $title")
    }

}

fun main() {

    val obj1=D("Mohamed Ahmed")
    obj1.displayJob("Developer")
    obj1.displayId(23213)


}