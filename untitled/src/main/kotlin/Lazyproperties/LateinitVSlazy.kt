package Lazyproperties

/*
>> lateinit works with var but lazy not
>> lateinit variable can initialize more times but lazy only one time only
with lateinit you can use Set and Get but lazy not
 */

fun main() {

    val obj=MyInfo()
   // obj.setName("Mohamed")
    println(obj.getName())

}




class MyInfo(){
    lateinit var myName:String

    fun setName(name:String){
        myName=name
    }
    fun getName()=if (::myName.isInitialized) myName else "Not Initialized"
}