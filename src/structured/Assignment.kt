package structured
import java.util.Scanner
fun main(args: Array<String>) {
    var chukua = Scanner(System.`in`)
    println("Enter username")
    var username = chukua.next()
    println("Enter password")
    var password = chukua.next()
    println("Enter weight")
    var weight = chukua.nextDouble()
    println("Enter height")
    var height = chukua.nextDouble()
    login(username,password,height,weight)

}

fun login(username:String,password:String,weight: Double,height: Double) {
    if (username.equals("eMobilis") && password.equals("eMobilis@123")) {
        bmi(height,weight)

    } else {
        println("Wrong username or password")
    }
}
fun bmi (weight: Double,height: Double){
    var bmi=weight/(height*height)
    if (bmi<18.5){
        println("Underweight")
    }else if (bmi<25){
        println("Normal weight")
    }else if (bmi<30){
        println("Overweight")
    }else{
        println("Obese")
    }
}












