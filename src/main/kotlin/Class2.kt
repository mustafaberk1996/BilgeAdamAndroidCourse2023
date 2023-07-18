class Vehicle(val brand: String, val model: String, val modelYear: Int, val isManuel: Boolean = true, val fuelType:FuelType) {

}


enum class FuelType{
    GASOLINE,
    DIESEL,
    ELECTRIC,
    HYBRID,
    GAS
}

fun main() {

    val vehicleDoblo = Vehicle("Fiat", "Doblo", 2007, true, FuelType.ELECTRIC)
    val vehicleTesla = Vehicle("Tesla","Y",2022,false,FuelType.DIESEL)

    if (vehicleDoblo.modelYear > vehicleTesla.modelYear) println("${vehicleDoblo.brand} alinir")
    else println("${vehicleTesla.brand} alinir")

    if (vehicleDoblo.fuelType == vehicleTesla.fuelType) println("Doblo kendini baya gelistirmis")
    else println("Doblo gelistiricilerinin biraz daha calismasi lazim")







}