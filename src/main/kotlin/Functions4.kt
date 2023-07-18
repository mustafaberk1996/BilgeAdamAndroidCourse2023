fun main() {
    val fruits = listOf("Elma", "Armut", "Kiraz", "Muz", "Cilek", "Ananas", "Kivi", "Karpuz")
    //filter(fruits)
    val filteredList = filterSecond(fruits)
    println("filterSecond()-->Filtrelenen meyve sayisi: ${filteredList.size}, $filteredList")
    val filteredList2 = filterThird(fruits)
    println("filterThird()-->Filtrelenen meyve sayisi: ${filteredList2.size}, $filteredList2")


}

fun filterThird(fruits: List<String>) = fruits.filter { it.contains("a",true) && it.length > 4 }

fun filterSecond(fruits: List<String>):List<String>{
    val filteredList = mutableListOf<String>()

    fruits.forEach {fruit->
        if (fruit.contains("a",true) && fruit.length > 4){
            filteredList.add(fruit)
        }
    }

    return filteredList
}

fun filter(fruits: List<String>) {
    fruits.forEach {
        if (it.contains("a",true) && it.length > 4){
            println("${it.toLowerCase()} meyvesi a harfini iceriyor ve 4 ten buyuk")
        }
    }
}

