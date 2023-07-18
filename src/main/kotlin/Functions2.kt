fun main() {

//    println("Toplam Deger: ${sumSecond(10, 24)}")
//    println("Toplam Deger: ${sumAnother(100, 124)}")
//    println(findDoubleOrSingle(7))

    val result = findDoubleOr(45)
    println(result)

    println(findDoubleOr(40))
    println(findDoubleOr(42))
    println(findDoubleOr(43))
    println(findDoubleOr(44))
    println(findDoubleOr(46))


}

fun findDoubleOr(number1: Int):String =
    if (number1 % 2 == 0) "$number1 cift bir sayidir" else "$number1 tek bir sayidir"

fun sumSecond(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun sumAnother(number1: Int, number2: Int): Int = number1 + number2

fun findDoubleOrSingle(number: Int): Boolean = number % 2 == 0
