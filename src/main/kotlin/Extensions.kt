
fun main() {
    val input:String = "Merhaba Dunya"
    val length = input.calculate("b")
    //println(length)

    val count = 123
    //count.findDoubleOrSingle()
    //findDoubleOrSingle1(count)

    val fruits = listOf("Elma", "Armut", "Kiraz", "Muz", "Cilek", "Ananas", "Kivi", "Karpuz")
    fruits.sortSpecial(false)
    fruits.sortSpecial(true)

}

fun String.calculate(letter:String):Int{
    var count = 0
    this.toCharArray().forEach {
        if (it.toString() == letter) count++
    }
    return count
}

fun Int.findDoubleOrSingle():Boolean = this % 2 == 0
fun findDoubleOrSingle1(number:Int):Boolean = number % 2 == 0

fun List<String>.sortSpecial(ascending:Boolean = true){
    this.forEach { print("$it, ") }

    println("")
    if (ascending) this.sorted().forEach { print("$it, ") }
    else this.sortedDescending().forEach { print("$it, ") }

    println()
}