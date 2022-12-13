package OOP

fun main() {
     val obj=FirstClass.NastedTwo("Amin","Ali") // to invoke the second class you must write the "first.nested"
    println(obj.fullData(22))

    val obj2=FirstClass.NestedThree() // this is the third class you can invoke the class by the same way
    obj2.Thx("Mohamed")

}

class FirstClass{

        class NastedTwo(var first:String,var last:String){
            val Total:String="$first $last"
            fun fullData( Age:Int):String{
                return "$Total's $Age years old"
            }

        }

        class NestedThree(){
            fun Thx(first: String){
                println("Thanks $first")

            }
        }


}