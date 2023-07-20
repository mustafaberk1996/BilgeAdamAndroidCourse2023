package cinemaProject

data class Saloon(val id:Int,val name:String, var chairCount:Int, val type:SaloonType, val supportIMax:Boolean = false){

}

enum class SaloonType{
    CINEMA,
    THEATRE,
    MUSICAL
}
