package collectionsInKotlin

fun main() {
    //union():Returns a set containing all distinct elements from both collections.
    // how to use union() operator

    val amEmployee= listOf(
        Employee("Mohamed "),
        Employee("Mohamed"),
        Employee("Ahmed "),
        Employee("ALi "),
        Employee("Mahdi ")
        )

    val pmEmployee= listOf(
        Employee("Sara "),
        Employee("yara"),
        Employee("said "),
        Employee("Mahdi"),
        Employee("Mahdi"),
        Employee("Mahdi"),
        Employee("Mahdi"),
        Employee("Mahdi"),
        Employee("Wala"))

    val allEmployee=amEmployee.union(pmEmployee)
    println(allEmployee)

}
data class Employee(val name:String )