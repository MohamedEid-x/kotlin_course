package OOP

import java.lang.reflect.Field

class B(var firstName:String,var lastName:String) {

    var fullName="$firstName $lastName"
    // to override on the fullName property use get() keyword & field
    get() = "Full Name Is $field"
        set(value) {
            if(value.startsWith("M")){
                println("Hello $firstName")
            }else{
                println("welcome $firstName")
            }
        }

}

fun main() {

    val obj=B("mohamed","Ahmed")
    println(obj.fullName)
    obj.fullName="Ahmed"
    println(obj.fullName)

}