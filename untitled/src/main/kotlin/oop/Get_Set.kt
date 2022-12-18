package oop
/*
Encapsulation term means the class its contains the getter and setter
 */
class Get_Set {
    var name:String=""
    var email:String=""


    //Setter
    fun SetName(E_name:String){
        this.name=E_name
    }
    fun SetEmail(E_email:String){
        this.email=E_email
    }

    //Getter
    fun GetName():String{
        return this.name
    }
    fun GetEmail():String{
        return this.email
    }


    //another way for setter and getter

    private var name2:String=""

    var setAndGetName: String
        get() = this.name2
        set(value) {
            this.name2=value
        }


    fun printData():String{
        return this.setAndGetName
    }



}

fun main() {
    val obj=Get_Set()
    obj.SetName("Ahmed")
    obj.SetEmail("Mohamed@hhjs.com")
    println(obj.GetName())
    println(obj.GetEmail())
println("______________________________________________________________")
    // setter and getter by another way
    val x=Get_Set()
    x.setAndGetName="Ali"
    println(x.setAndGetName)
  println(  x.printData())



}