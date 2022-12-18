package oop
/*
1.How to create class with Generic type
 */

class Names<T>(val list:List<T>){
    fun item():List<T>{ //<T>  most common or <E> , but you can add anything
        return list
    }
}

fun main() {
    // create instance with String type
    val objString:List<String> = listOf("Mohamed","Ahmed","ALi")
    val result=Names(objString)
    println(result.item())


    val objInt:List<Int> =listOf(1,2,3,4,6,7,8,3)
    val result2=Names(objInt)
    println(result2.item())
}