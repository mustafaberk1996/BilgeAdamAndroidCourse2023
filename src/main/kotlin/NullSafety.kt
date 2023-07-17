
var name: String? = null
var age:Int? = null
var flowers:List<String>? = null
val motocycleBrands = mutableListOf("Honda","Yamaha","Yuki","Kawazaki","Kuba")
fun main() {
    name = "Bilge"
    name?.let {
        println(it)
    }

    flowers = listOf("Papatya","Gul","zambak")

    val size = flowers?.size
    size?.let {
        println("ciceklerin sayisi: $size")
    }










}