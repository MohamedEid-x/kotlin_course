package Extension
/*
1.How to create extension
 */

// Tpo create an extension : add type of input.exName(){ exBody}

fun String.initials():String{
    val value=this.split(' ')
    val firstInitial=value[0].substring(0,1)
    val lastInitial=value[1].substring(0,1)
    return "$firstInitial$lastInitial"
}

fun Int.isAdult():Boolean{
    return this>=18
}

fun Person.fullName()=this.name

fun String.wordLength()=println(this.length)

