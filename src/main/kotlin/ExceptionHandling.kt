import java.lang.Exception

val cars = listOf("BMV","Mercedes","Renault","Toyota")

fun main() {

//    if (cars.size >= 10){
//        val car = cars[9]
//        println(car)
//    }else{
//        println("liste uzunlugu yeterli degil")
//    }

    try {
        val car = cars[9]
        println(car)
    }catch (exception:Exception){
        //println(exception.printStackTrace())
        if (exception is ArrayIndexOutOfBoundsException){
            println("index out of hatasi tespit edildi")
        }else{
            println("farkli bir hata var!!!")
        }

        println("Bir hata olustu. Hatanin Turu: $exception, Hata Mesaji: ${exception.message}")
    }








}