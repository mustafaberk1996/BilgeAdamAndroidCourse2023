open class Human:IHuman{
    lateinit var id:String
    lateinit var name:String
    val birthYear:Int = -1
    lateinit var eyeColor:String
    var health:Int = 0

    fun breathe(){

    }

    fun eat(){
        health++
    }

    fun smoke(){
        health--
    }

    fun born(){

    }

    override fun walk() {
        ///
    }

    override fun sleep() {
        //
    }

    override fun speak(content: String) {
        //
    }
}
class Employee : Human(){
    lateinit var job:String
    var salary:Double = 0.0
    lateinit var company:String
    lateinit var department:String
}

fun main() {
    val employee = Employee()
    employee.id = "12345"
    employee.name = "Kaan"
    employee.salary = 11.404
    employee.job = "Android Developer"
    employee.eyeColor = "Yesil"
    employee.company = "Bilge Adam"
    employee.department = "IT"


    employee.eat()
    employee.eat()
    employee.smoke()

    println("${employee.name}'in sagligi: ${employee.health}")

}