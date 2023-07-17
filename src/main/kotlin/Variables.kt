fun main(){


    val name = "Mustafa"
    val surname = "Berk"
    var age:Int = 26
    val id:String = "123567755858"

    println("Isim: $name, Yasi: $age, ID:$id")

    val sum = age + 10
    val fullName = "$name $surname"

    println("Toplam: $sum, Uzun Ad: $fullName")

    val computers = listOf("Apple","Vaio","Thinkpad")
    println(computers)

    val motocycleBrands = mutableListOf("Honda","Yamaha","Yuki","Kawazaki","Kuba")
    println(motocycleBrands)
    val removedMotocycleBrand =  motocycleBrands.removeAt(0)
    println("Silinen Motor Markasi: $removedMotocycleBrand")
    println("1. siradaki motor markasi: ${motocycleBrands[0]} ")








}