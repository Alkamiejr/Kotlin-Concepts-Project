package oop

interface FirstInterface {
    var age:Int
    fun rice():String
    fun greeting(){
        println("Good Morning class")
    }

}
class FourthClass:FirstInterface{
    override var age: Int=100
    override fun rice():String="i love rce"


}

fun main() {
    var myObj=FourthClass()
    println(myObj.rice())
    myObj.greeting()
}