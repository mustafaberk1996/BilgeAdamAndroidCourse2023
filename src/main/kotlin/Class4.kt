class Dog(val bark:Boolean,val name:String,val legCount:Int){

    init {
        println("$bark $name $legCount")
    }
}

fun main() {
    val dog = Dog(true, "Karabas",4)
}