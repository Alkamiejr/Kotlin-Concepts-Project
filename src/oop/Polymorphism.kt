package oop

open class ClassOne{
    fun ugali(){
        println("i love ugali")
    }
    fun githeri(){
        println("i love githeri")
    }

}
 open class ClassTwo:ClassOne(){

}
class ClassThree:ClassTwo(){

}
fun main(args: Array<String>) {
    var myObj=ClassThree()
    myObj.githeri()
}