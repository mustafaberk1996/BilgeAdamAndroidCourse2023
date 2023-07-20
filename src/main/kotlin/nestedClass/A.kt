package nestedClass

class A {
    lateinit var name:String
    var age:Int = 0
    var birthYear = 0

    class B {
        lateinit var surname:String
        var count:Int = 0
        fun some() = ""
    }
}

fun main() {

    val a = A()
    println(a.age)


    val b = A.B()
    println("${b.count} ${b.surname}")
    b.some()



}