package oop

import com.sun.jdi.connect.Connector.SelectedArgument

abstract class FirstClass(open var name:String,open var age:Int) {
    abstract fun motto()
    abstract fun mission()
}
class SecondClass(override var name: String,override var  age:Int):FirstClass(name, age){
    override fun motto() {
        println("Education is the key to success")
    }

    override fun mission() {
        println("to educate the world")
    }

}
class ThirdClass(override var name:String,override var age:Int):FirstClass(name,age){
    override fun motto() {
        println("Success and hardwork")
    }

    override fun mission() {
        println("to empower children")
    }
}

fun main() {
    var xyz=ThirdClass("aaaa",77)
    xyz.motto()
    xyz.mission()
}
        /*
        from Auth class,on register and login methods respectively
        validate any user's email and password ,if the user has an email
        and password of your liking ,calculate the BMI of the same user from
        the a Child class called Bmicalc
        ensure all credentials are provided by the user through the scanner
        */
