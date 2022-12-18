package sealedClass

fun main() {

    val employee:Sealed = SeniorDev("Mohamed",34,20)

    val message= when(employee){
        is Manger->{ "Welcom ${employee.name} you have${employee.team} team member"}
        is SeniorDev->{"welcom ${employee.name}"}
         JuniorDev->{"welcom"}
            }
    println(message)

}