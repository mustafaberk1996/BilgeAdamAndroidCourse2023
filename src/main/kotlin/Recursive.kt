fun main() {

val result = recursive(5)
    println(result)
    val number = 10
    print("$number! = ")
    println(factorialCalculation(number))

    val result2=fact(4)
    println(result2)
    //5!=5.4.3.2.1

}

fun factorialCalculation(x:Int): Int{
    if(x>1){
        print("$x.")
        return x * factorialCalculation(x-1)
    } else {
        print("1 = ")
        return x
    }
}
fun fact(y:Int):Int{
    return if(y==1) 1 else y*fact(y-1)
}

private fun recursive(x:Int):Int{
return    if(x==0) 0
          else recursive(x-1)
}

