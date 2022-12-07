package nullSafety

fun main() {

    //Then!! operator

    var Name:String?="Mohamed Eid"
     Name=null
    println(Name?.length)//used the safe call operator because its possibly find null

    //But if you sure this variable never contains null you can use the !! operator
    Name="Mohamed Eid "
    println(Name!!.length)

}