package oop
import java.util.Scanner

class Validate (override var email:String,
                override var password:String,
                override var height: Double,
                override var weight: Double):Auth(email, password, height, weight) {

  fun validateUser(){
      println("User validated")
  }
}

fun main(args: Array<String>) {
    var userOne = Validate("purity@gamil","purity@123",1.9,100.0)
    userOne.register()
    var chukua = Scanner(System.`in`)
    println("Enter email")
    var email = chukua.next()
    println("Enter password")
    var password = chukua.next()
    println("Enter weight")
    var weight = chukua.nextDouble()
    println("Enter height")
    var height = chukua.nextDouble()
    login(email, password, height, weight)




}
fun login(email: String,password: String,weight: Double,height: Double) {
    if (email.equals("purity@gmail.com") && password.equals("purity@123")) {
        bmiCalc(height,weight)

    } else {
        println("Wrong username or password")
    }
}
fun bmiCalc (weight: Double,height: Double){
    var weight :Double
    var height: Double


}
