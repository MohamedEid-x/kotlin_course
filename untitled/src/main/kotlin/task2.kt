fun main() {
//    var counter:Int=1
//    val words= Array(5){ readln() }.joinToString(separator = " ")
//    println(words)

//    val a= List(5){ readln() }
//    a.forEach { print("$it ") }

    val b= mutableListOf<String>().also { lst-> repeat(5){lst.add(readln())} }.joinToString(" ")
    println(b)
}