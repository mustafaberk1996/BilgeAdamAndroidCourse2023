import java.text.Collator
import java.util.*

fun main() {
    val input:String = "Merhaba Dunya"
    val length = input.calculate("b")
    //println(length)

    val count = 123
    //count.findDoubleOrSingle()
    //findDoubleOrSingle1(count)

    val fruits = listOf("Elma", "Armut", "Kiraz", "Muz", "çilek", "Ananas", "Kivi", "Karpuz")
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
    val turkishComparator = compareBy<String>{ it.normalizeTurkishCharacters() }
    val sortedList = if(ascending) this.sortedWith(turkishComparator)
    else this.sortedWith(turkishComparator.reversed())

    println(sortedList.joinToString(","))
    // this.forEach { print("$it, ") }

    // val collator = Collator.getInstance(Locale("tr","TR"))

    /*println("")
    if (ascending) this.sortedWith(collator).forEach { print("$it, ") }
    else this.sortedWith(collator).reversed().forEach { print("$it, ") }*/
    //if (ascending) this.sorted().forEach { print("$it, ") }
    //else this.sortedDescending().forEach { print("$it, ") }
}

fun String.normalizeTurkishCharacters():String {
    return this.replace("ç","c")
        .replace("Ç","C")
}