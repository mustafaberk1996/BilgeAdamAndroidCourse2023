class User {
    lateinit var name:String
    lateinit var surname:String
    var age:Int = -1
    var salary:Double = 0.0
}

class Car{
    lateinit var brand:String
    var wheelCount:Int = 0
    lateinit var color:String
    lateinit var model:String

    fun print(){
        println("Marka: $brand Model: $model Renk: $color Tekerlek Sayisi: $wheelCount")
    }
}

class Animal(val legCount:Int, val type:String, val color:String, val isBreathing:Boolean, val canFly:Boolean){

    lateinit var name:String

    fun calculateSpeed():Int{
        var value = if (isBreathing) 1000 else 500
        value+= if (color == "SARI") 300 else 100
        value+= if (canFly) 1500 else 400
        return value
    }
}

fun main() {

    val animal = Animal(legCount = 4,type ="KEDI",color ="SARI", isBreathing = true, canFly = false)
    val animaType = animal.type
    animal.name = "Tekir"
    println("${animal.type} hayvani ${animal.calculateSpeed()} kadar hizli hareket eder.")



    val user:User = User()
    user.name = "Tolga"
    user.surname = "Unal"
    user.age = 30
    user.salary = 11.402

    println("Ad: ${user.name} Soyad: ${user.surname} Yas: ${user.age} Maas: ${user.salary}")

    val car = Car()
    car.brand = "Mercedes"
    car.model = "CLA"
    car.color = "Green"
    car.wheelCount = 4

    car.print()


}