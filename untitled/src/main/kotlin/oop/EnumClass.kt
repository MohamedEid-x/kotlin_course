package oop

/*
1. How to create Enum class
2. How to use Enum class as a parameter
3. How to use Enum constructor parameter
4. How to create abstract class inside an enum class
5. How to iterate over enum class value
 */

fun main() {

    println(Days.Monday)
    println(Days.Saturday)

    val employee1=workSheet("Ali")
    employee1.printData(Days.Friday)
println("_________________________________3______________________________________")
    println(values.GOLD)  // calling the member inside the enum class
    println(values.PALTINUM.followers)// show the value of the specific item
    println(values.SILVER.point)
println("_________________________________4______________________________________")

    println(AccountType.HIGH)
    println(AccountType.HIGH.toPrintData())


    //5. How to iterate over enum class value
println("_________________________________5______________________________________")
    // this will print all data inside the enum class by this for loop
    for (i in AccountType.values() ){
        println(i)
    }
    println("__________________")
    // using forEach
    AccountType.values().forEach { println(it) }



}


    //  1. How to create Enum class
enum class Days{ // values can't change anymore
    Saturday,
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,

}

    // 2. How to use Enum class as a parameter
class workSheet(var name:String){
   fun printData(Day:Days){
       if(Day==Days.Saturday ){//using enum class as a function parameter
           println("your vacation is $Day")
       }else{println("It's work day")}
   }
    

    

}
   //3. How to use Enum constructor parameter
enum class values(val point:Int,val followers:Int) // how to use Enum Constructor parameter
{
    // When you use enum class parameter all value inside the class must have the parameter value also
    BRONZE(10,10000),
    SILVER(100,100000),
    GOLD(1000,1000000),
    PALTINUM(10000,1000000000)

}

    //4. How to create abstract class inside an enum class 

enum class AccountType(val IsUsingCalls:Boolean,val members:Int) {
    LOW(false, 200) {
        override fun toPrintData(): String {
            return "Using calls $IsUsingCalls and it has $members members"
        }
    },
    MEDIUM(true, 450) {
        override fun toPrintData(): String {
            return "Using calls $IsUsingCalls and it has $members members"
        }
    },
    HIGH(true, 1000) {
        override fun toPrintData(): String {
            return "Using calls $IsUsingCalls and it has $members members"
        }
    };


    // create abstract function
    // Remember that abstract function doesn't hava body

    abstract fun toPrintData():String
}