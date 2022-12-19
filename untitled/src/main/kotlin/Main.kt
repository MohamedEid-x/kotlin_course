


fun main(args: Array<String>) {
    var flag:Boolean=false
    println("Enter The First Number")
    val first:Int= readln().toInt()
    println("Enter The Second Number")
    val second:Int= readln().toInt()
    println("Enter The Third Number")
    val third:Int= readln().toInt()

    if (first >=second && first <= third){
        flag=true
        println(flag)
    } else {flag=false
    print(flag)
    }
    //another way
    println(first in third downTo second ||first in second downTo third)

    // another way
    val (num1,num2,num3)=IntArray(3){ readln().toInt() }
    println(num1 in num2..num3||num1 in num3.. num2)


}
