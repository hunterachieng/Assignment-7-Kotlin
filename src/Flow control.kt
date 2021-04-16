fun main(){
    oddNumbers()
    println(namesArray(arrayOf("Hunter","Victorine","Brenda","Jane")))
    robot(3)
    robot(10)
    robot(16)
    number()
}
fun oddNumbers() {

    for (number in 1..100) {
        if (number%2!==0){
            println(number)
        }
       }
}
fun namesArray(studentNames:Array<String>):Int{
    var names = 0
    for (name in studentNames) {
                    if(name.length> 5){// to find the numbers of items that fit the condition
                        names++
                    }
    }
return names
}
fun robot(age:Int){
    if(age < 6){
        println("Glass of milk")
    }
    else if (age >= 6 && age < 15){
        println("Bottle of Fanta Orange")
    }else{
        println("Bottle of Coca Cola")
    }

}
fun number(){

    for (digit in 1..100){
        if (digit%3 == 0 && digit%5 == 0){
            println("FizzBuzz")
            }
            else if (digit%3== 0){
                println("Fizz")
            }else if (digit%5 == 0){
                println("Buzz") }
        else{
            println(digit)
        }

    }
}