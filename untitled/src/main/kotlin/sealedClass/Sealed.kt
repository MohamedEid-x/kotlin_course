package sealedClass

sealed class Sealed
data class Manger(val name:String,val age:Int, val team:Int):Sealed()
class SeniorDev(val name:String,val age:Int,val projects:Int):Sealed()
object JuniorDev:Sealed()
