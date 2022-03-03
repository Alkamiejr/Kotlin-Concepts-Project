package oop

abstract class FirstClass(open var name:String, open var age:Int) {
    abstract fun motto()
    abstract fun mission()
}

class SecondClass(override var name: String, override var age: Int):FirstClass(name, age){
    override fun motto() {
        println("Education is the key to success")
    }

    override fun mission() {
        println("To educate the world")
    }

}
class ThirdClass(override var name: String, override var age: Int):FirstClass(name, age) {
    override fun motto() {
        println("Success is a result of hard work")
    }

    override fun mission() {
        println("To nature the world through education")
    }
}

fun main(args: Array<String>) {
    var xyz = ThirdClass("king", 100)
    xyz.motto()
}
//From Auth class, on register and login methods respectively,
//validate any user's email and password. If the user has email
//and password of your liking, proceed to calculate the BMI of
//the same user from a child class called Bmical.
//Ensure all credentials are provided by the user through the scanner














