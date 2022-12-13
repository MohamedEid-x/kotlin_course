package OOP

fun main() {
     val obj=FirstClass.NastedTwo("Amin","Ali") // to invoke the second class you must write the "first.nested"
    println(obj.fullData(22))

}

class FirstClass{

        class NastedTwo(var first:String,var last:String){
            val Total:String="$first $last"
            fun fullData( Age:Int):String{
                return "$Total's $Age years old"
            }

        }


}