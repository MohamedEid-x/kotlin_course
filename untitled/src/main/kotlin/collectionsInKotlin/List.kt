package collectionsInKotlin

fun main() {
// Returns a new read-only list of given elements
    val usersList= listOf(1,3,3,4,4,4) // Read-only list
    usersList.forEach { println(it) }

    val users= listOf(
        user("Mohamed","Eid"),  //its class created in the array.kt file
        user("Ahmed","Said")
    )
    val first= users[0]
    val first2= users.first() //Returns the first element matching the given predicate.
    val last2= users.last() // Returns the last element.
    println(last2)
    println(first)
    println("_________________________")
    println(first2)
    println("_________________________")
    println("Enter your name")
//    //val name:String?= readLine()
//    val stuff= if (name==null) emptyList() else listOf(name)
//    //emptyList() return an empty list
//    println(stuff)


 //____________________________________________mutable list of _____________________________________________________________________
    val data= mutableListOf(1,3,3,4,5,4,3) // mutable list that accept add and delete items
    data.forEach{println(it)}
    println("================================")
    data.add(30) //add item to list
    data.forEach{println(it)}
    data.add(2,30) //add item with specific index
    data.forEach{println(it)}
    data.remove(30)//remove mention item
    data.forEach{println(it)}
    data.removeAt(2)// remove mention index
    println("____________________________________________filter in list___________________________________________________________________")

//____________________________________________ filter in list  _____________________________________________________________________
val names= listOf("Mohamed","Ahmed","Ali")
    val filter= names.filter { it!="Mohamed" }//Returns a list containing only elements matching the given predicate.
    val filter2=names.filter { it=="Mohamed" }
    println(filter)
    println(filter2)
    val ages= listOf(33,45,44,32,67,42,34,65,11,23,12,3,37)
    val filter3=ages.filter { it>=16 }
    println(filter3)
    val filter4=ages.filter(::isChild) // calling function that checking the value
    println(filter4)
/*
In Kotlin, the :: operator is used to refer to a function by its name. It is similar to the .
operator in that it is used to access a member of a class or object,
 but the :: operator specifically refers to a function.
 */
    println("____________________________________________find item in list___________________________________________________________________")

//____________________________________________ find item in list _____________________________________________________________________
 val notFoundItem=names.find { it=="Samy" } //return null (not found )
    val foundItem=names.find { it=="Mohamed" }//return item  ( found )
    println(foundItem) // if its found print it and when not return null
    println(foundItem?.length)// must add safe calling ? because its possible be null

//    val c =names.first{it=="samy"} // when found return item when not an error will appear to avoid this error use firstOrNull
//    println(c)
    val x= names.first{it=="Mohamed"}
    println(x)
    val u= names.firstOrNull{it=="samy"}//Returns the first element matching the given predicate, or null if element was not found.
    println(u)// null appear item no found

    println("____________________________________________filterNot in list___________________________________________________________________")

//____________________________________________ filterNot in list _____________________________________________________________________
    val g=names.filterNot { it.contains('a') } //Returns a list containing all elements not matching the given predicate.
    println(g)
println("____________________________________________flatten in list___________________________________________________________________")

//____________________________________________ flatten in list _____________________________________________________________________
 val group1= listOf("ahmed","Ali","Asaad")    // also can use it with arrayOf() not only list
 val group2= listOf("Mohamed","Mary","May")
 val group3= listOf("Samy","Sally","said")
        val allGroup= listOf(group1,group2,group3)
        println(allGroup.flatten())//Returns a single list of all elements from all collections in the given collection.

println("____________________________________________combine multiple immutable list___________________________________________________________________")

//____________________________________________ combine multiple immutable list _____________________________________________________________________
  val result=group1.plus(group2).plus(group3) //Returns a list containing all elements of the original collection and then all elements of the given elements collection.
    println(result)
    println(result.minus(group3)) //Returns a list containing all elements of the original collection except the elements contained in the given elements collection.
    println(result.minus("Mohamed"))//Returns a list containing all elements of the original collection without the first occurrence of the given element.

println("____________________________________________Map operator with list___________________________________________________________________")

//____________________________________________Map operator with list _____________________________________________________________________
/* substring() :Returns the substring of this string starting at the startIndex and ending right before the endIndex.
map:Returns a list containing the results of applying the given transform function to each element in the original collection.
 */
    val xx= names.map { it.substring(0,3).uppercase() }
    println(xx)
    val items2= listOf("Mohamed Eid","Ahmed Ali","May Mohamed")
    val result2=items2.map {
        val words=it.split(' ')//Splits this char sequence to a list of strings around occurrences of the specified delimiters.
         words[0].substring(0,1)+words[1].substring(0,1)
    }
    println(result2)
    val xmx= names.map { it.substring(0,3).uppercase() }.reversed() //Returns a list with elements in reversed order.
    println(xmx)

println("____________________________________________Map VS flatmap___________________________________________________________________")

//____________________________________________Map VS flatmap _____________________________________________________________________

/*
>>UnionOperator:Returns a list containing the results of applying the given transform function to each element in the original collection.
>>flatmap:Returns a single list of all elements yielded from results of transform function being invoked on each element of original collection.
 */

    val group4= listOf("ahmed","Ali","Asaad")
    val group5= listOf("Mohamed","Mary","May")
    val group6= listOf("Samy","Sally","said")
    val allGroup2= listOf(group4,group5,group6)
    println(allGroup2.map {it})
    println(allGroup2.flatMap { it })
}
fun isChild(age:Int):Boolean{
    return age>=18
}