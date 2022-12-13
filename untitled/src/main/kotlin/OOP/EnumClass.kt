package OOP

fun main() {

    println(Days.Monday)
    println(Days.Saturday)

    val employee1=workSheet("Ali")
    employee1.printData(Days.Friday)

}



enum class Days{ // values can't change anymore
    Saturday,
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,

}

class workSheet(var name:String){
   fun printData(Day:Days){
       if(Day==Days.Saturday ){//using enum class as a function parameter
           println("your vacation is $Day")
       }else{println("It's work day")}
   }
}