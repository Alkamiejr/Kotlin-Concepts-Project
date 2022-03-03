package oop

open class Auth (open var email:String, open var password:String,
                 open var weight:Double, open var height:Double) {
    fun login(){
        println("You can login")
    }
    fun register(){
        println("You can register")
    }
}