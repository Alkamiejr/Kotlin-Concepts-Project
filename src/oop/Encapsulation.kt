package oop

class Flowers{
    private var name:String=""
    private var color:String=""
    private var price:Double=0.0

    fun setName(name:String){
        this.name=name
    }
    fun setColor(color:String){
        this.color=color
    }
    fun setPrice(price:Double){
        this.price=price
    }
    fun getFlowerName():String{
        return this.name
    }
    fun getFlowerColor():String{
        return this.color
    }
    fun getFlowerPrice():Double{
        return this.price
    }

}

fun main(args: Array<String>) {
    var flower=Flowers()
    flower.setName("Rose")
    flower.setColor("Red")
    flower.setPrice(100.00)
    println(flower.getFlowerName())
}