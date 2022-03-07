package structured

fun main(args: Array<String>) {
    //if statements
    var age=10
    if (age<18){
        println("sorry you are under age")
    }
    else{
        println("welcome to the party")
    }
    var marks=10
    if (marks<4){
        println("E")
    }
    else if (marks<5){
        println("D")
    }
    else if (marks<6){
        println("C")
    }
    else if (marks<7){
        println("B")
    }
    else{
        println("A")
    }
    //when statements
    var bettingNumber=0
    when(bettingNumber){
        1->{
            println("Oops!! you have lost")
        }
        2->{
            println("Oops!!You have lost!!")
        }
        3->{
            println("Congrats you have won")
        }
        else->{
            println("Enter a number from 1-3 to bet")
        }
    }

}