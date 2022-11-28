package Function

fun main() {


    employeeData("mohamed",22,1)
}

fun employeeData(name:String,age:Int,hiringDateDay:Int,job:String="Developer") //job is default
{
    println("Hello $name your age is $age you are with us form ${hiringDateDay}th this month and you are $job ")
}