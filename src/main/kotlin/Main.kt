
fun main() {


    val user:String = "Berk"
    val user1 = "Mustafa"
    val count:Int = 1
    val universe = "Bilge Adam"
    val computerCount = 1234

    println("${user.calculate("t")}")

    //Boolean, Float, Double, Char, Short, Int, String,Array, List, MutableList
    val isActive = true
    val active = false
    val online = true

    val meter:Float = 1.3f
    val meter2:Double = 12.4
    val character:Char = '1'

    //immutable list - ekleme veya cikarma islemleri yapilamaz
    val fruits = listOf("Elma","Armut","Muz","Kiraz","Portakal") //liste tanimlama
    val carBrands:List<String> = listOf("BMV","Mercedes","Honda","Renault","Haci Murat")
    val prices = listOf(12.000,5.500,45.000,1.200)

    println(fruits)
    val itemOne = fruits[0]//verilen index degerini geri dondurur


    //mutable list --> mutable list'lerde ekleme veya cikarma islemi yapabiliriz

    val soldiers = mutableListOf("Mustafa","Oguz","Tolga","Salih","Metin")
    println(soldiers)

    soldiers.add("Seyfullah")//listeye ekleme islemi yapar
    soldiers.add("Emrah")
    soldiers.add("Emre")

    println(soldiers)

    soldiers.removeAt(0)//index numarasina gore listeden silme/cikarma islemi yapan metot
    soldiers.remove("Seyfullah")//liste elemanina gore silme/cikarma islemi yapan metot
    println(soldiers)//listeyi yazdirir


    val isAdded = soldiers.add("Suleyman")
    println("Suleyman eklendi mi: $isAdded, index:${soldiers.indexOf("Suleyman")}")

    val removedItem = soldiers.removeAt(6)
    println("silinen elemanin ismi: $removedItem")

   val removed = soldiers.remove("Metin")
    println("Metin silindi mi: $removed")










//    println("Merhaba Dunya")
//    print("Merhaba ")
//    print("Dunya")

//    println("Hosgeldiniz: $user1")






}