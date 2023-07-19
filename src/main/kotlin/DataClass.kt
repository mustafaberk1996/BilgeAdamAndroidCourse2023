data class DataClass(val p:String,val d:Int, val t:Double){
    fun print(){
        println("$p $d $t")
    }
}
data class DataClass1(val p:String,val d:Int, val t:Double)
data class DataClass2(val p:String,val d:Int, val t:Double)

fun main() {


    val data = DataClass("telephone",134,13.2)
    data.print()


}
