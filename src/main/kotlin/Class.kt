class User() {
    var id: Int = 0
    lateinit var name:String
    lateinit var surname:String
    lateinit var email: String
    lateinit var password: String
    var age:Int = -1
    var salary:Double = 0.0

    constructor(id:Int, name:String, surname:String, email:String, password:String) : this(){
        this.id = id
        this.email = email
        this.password = password
        this.name = name
        this.surname = surname
    }


    fun print(){
        println("$id $name, $surname, $email, $password")
    }
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