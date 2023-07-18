class Station constructor(val name:String, count:Int = 0){
    var isAvailableToPark = false

    constructor(name: String, oilType: String) : this(name) {

    }

    constructor(name:String, vehicle: Vehicle, count:Int = 0):this(name, count){
        isAvailableToPark = vehicle.fuelType != FuelType.GAS
        println("${vehicle.brand} araci $name istasyonuna park edebilir: $isAvailableToPark")
    }
}

class Tree{
    constructor()
    constructor(name:String){

    }
}

fun main() {

    val vehicleDoblo = Vehicle("Fiat", "Doblo", 2007, true, FuelType.ELECTRIC)
    val vehicleTesla = Vehicle("Tesla", "Y", 2022, false, FuelType.DIESEL)
    val vehicleTofas = Vehicle("Tofas", "CLA", 1990, true, FuelType.GAS)

    val station = Station("BP", vehicleDoblo)
    val station2 = Station("Shell", vehicleTesla)
    val station3 = Station("Opet", vehicleTofas)


}
