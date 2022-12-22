fun main() {


    println("Enter the numbers you need ")
    val numbers= Array<Int>(5){ readln().toInt() }
    numbers.forEach { println(it) }


}