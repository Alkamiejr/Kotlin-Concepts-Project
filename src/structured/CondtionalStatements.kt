package structured
fun main(args: Array<String>) {

//WHEN STATEMENTS
    var bettingNumber=3
    when(bettingNumber){
        1->{
            println("Oooops!!! You have lost!!!")
        }
        2->{
            println("Ooops!!! You have lost!!!")
        }
        3->{
            println("Congratulations!!! You won!!!")
        }
        else->{
            println("Enter a number from 1 - 3 to bet")
        }

    }
}