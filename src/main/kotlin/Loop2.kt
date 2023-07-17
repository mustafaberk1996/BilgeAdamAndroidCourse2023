

val fruits = listOf("Elma","Armut","Muz","Kiraz","Portakal")

fun main() {


    fruits.forEach {fruit->

        if (fruit.length >= 4 && fruit.contains("i")){
            println(fruit)
        }

        if (fruit.startsWith("e",true)){
            print("$fruit, ")
        }
    }



}