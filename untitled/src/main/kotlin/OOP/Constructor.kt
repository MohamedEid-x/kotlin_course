package OOP
                  //primary constructor
class Constructor(var firstName:String,var lastName:String,var IsGraduated:Boolean) {
constructor(firstName:String,lastName: String):this(firstName,lastName,true){
    println("2nd")
}
constructor(firstName: String):this(firstName,""){
    println("3rd")
}
      fun printFullName() {
          println("$firstName $lastName graduated $IsGraduated")
      }
      fun printName(){println("$firstName $lastName")}

      fun printNameWithPrefix(prefix:String){
          println("$prefix $firstName")
      }


}