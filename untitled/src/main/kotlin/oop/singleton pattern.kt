package oop

fun main() {
    println(favoritFood.name) //The Singleton pattern
    edit()
    println(favoritFood.name)
    favoritFood.list.add("chicken")
    favoritFood.list.add("meet")
    println(favoritFood.list)




}
fun edit(){
    favoritFood.name="Salad"
}

object favoritFood{

    var name="Unknown"
    var list= mutableListOf<String>()

}

/*

The Singleton pattern can be useful in several cases, and Kotlin makes it easy to declare singletons:

object DataProviderManager {
    fun registerDataProvider(provider: DataProvider) {
        // ...
    }

    val allDataProviders: Collection<DataProvider>
        get() = // ...
}
This is called an object declaration, and it always has a name following the object keyword. Just like a variable declaration, an object declaration is not an expression, and it cannot be used on the right-hand side of an assignment statement.

The initialization of an object declaration is thread-safe and done on first access.
 */