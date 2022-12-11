package OOP
                  //primary constructor
class Constructor(var firstName:String,var lastName:String,var IsGraduated:Boolean) {
      /*The primary constructor cannot contain any code. Initialization code
      can be placed in initializer blocks prefixed with the init keyword. */
        var fullName= "$firstName $lastName"
      var age:Int
      init { /*initializer block
               Used to initialize variables in the classes
               high priority to execute
               */
          age=33
          println("Age = $age")
          println("Welcome from init")
          println("This Is The Full Name $fullName ")
      }

//second constructor
constructor(firstName:String,lastName: String):this(firstName,lastName,true){
    println("2nd")
}
//Third constructor
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