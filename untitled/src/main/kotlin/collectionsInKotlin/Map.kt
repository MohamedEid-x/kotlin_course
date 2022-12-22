package collectionsInKotlin

import kotlin.random.Random

fun main() {

    // How to create Map
    val data= mapOf(
        1 to "Mohamed",
        2 to "ALi",
        3 to "Khaled",
        4 to "Sara",
        5 to "Yara"
    )
    //Returns the value corresponding to the given key, or null if such a key is not present in the map.
    val result=data[1]
    println(result)

    //Returns true if the map contains the specified key.
    val result1=data.containsKey(1)
    println(result1)

    //Returns true if the map maps one or more keys to the specified value.
    val result2=data.containsValue("Mohamed")
    println(result2)

    //Returns a read-only Set of all key/value pairs in this map.
    val result3=data.entries
    println(result3)

    //Returns a read-only Set of all keys in this map.
    val result4=data.keys
    println(result4)

   // Returns a read-only Collection of all values in this map. Note that this collection may contain duplicate values.
    val result5=data.values
    println(result5)
//____________________________________________________Mutable Map______________________________________________________________
println("____________________________________________________Mutable Map______________________________________________________________")
    val numbers = mutableMapOf("one" to 1, "two" to 2, "three" to 3)

// Get the size of the map
    val size = numbers.size

// Check if the map is empty
    val isEmpty = numbers.isEmpty()

// Get the keys in the map
    val keys = numbers.keys

// Get the values in the map
    val values = numbers.values

// Get the value associated with a key
    val value = numbers.get("one")

// Put a new key-value pair in the map
    numbers.put("four", 4)

// Remove a key-value pair from the map
    numbers.remove("one")

// Remove a key-value pair with a specific value
    numbers.remove("two", 2)

// Check if the map contains a key
    val containsKey = numbers.containsKey("two")

// Perform an action for each key-value pair in the map
    numbers.forEach { entry ->
        println("${entry.key}: ${entry.value}")
    }


    val randomSequence = generateSequence { Random.nextInt() }
    println(randomSequence)





}