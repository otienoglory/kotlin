fun main(args: Array<String>) {
    //IF STATEMENT
    var age = 20
    if (age < 18) {
        println("Sorry,you are under age")
    } else {
        println("Welcome to the party")
    }

    var weight = 100
    var height = 1.9
     var bmi = weight / (height * height)

    if(bmi<=18){
     println("underweight")
    }else if(bmi<= 29){
    println("Normal weight")
    }else if (bmi <= 34){
        println("Overweight")
     }else{
    println("obese")
    }


}




























