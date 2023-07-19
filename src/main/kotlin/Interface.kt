interface IHuman {
    fun walk()
    fun sleep()
    fun speak(content: String)
}

class Human2:IHuman{

    override fun walk() {
        println("human is walking")
    }

    override fun sleep() {
        println("human is sleeping")
    }

    override fun speak(content: String) {
        println("human spoke:$content")
    }

}

fun main() {
    val human2 = Human2()

    human2.sleep()
    human2.walk()
    human2.speak("Merhaba arkadaslar, nasilsiniz")
}