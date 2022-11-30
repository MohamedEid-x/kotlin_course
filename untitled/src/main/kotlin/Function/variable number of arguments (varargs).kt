package Function

fun main() {

showBookData("programming Data","ahmed ","said","jack")

}

fun showBookData(title:String,vararg authors:String )//use vararg to add more than one item , you can add one or more items
{
    println("$title -Authors:")
    authors.forEach { println(it) } // handle with vararg as array
}