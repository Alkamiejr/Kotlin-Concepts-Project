package structured

fun main(args: Array<String>) {
    var a:String
    var b:String
    var c:Int
    var d:Double

    a="100"
    b="200"
    var total:Double

    println(a+b)
    c=a.toInt()
    c=a.toInt()
    d=b.toDouble()
    total=c+d
    println("%.4f".format(total))
    println(c+d)
    println(c.toString()+d.toString())
}