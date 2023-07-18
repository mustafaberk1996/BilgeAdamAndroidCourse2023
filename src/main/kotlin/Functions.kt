fun main() {

//    doPrint()
//    findSingleNumbers()
//
//    doPrint("Merhaba Bilge Adam")

    sum(3,4)

}

fun doPrint(message:String){
    println("mesajiniz: $message")
}

fun doPrint(){
    println("Bilge Adam Akademi")
}

fun sum(a:Int, b:Int) {
//    var sonuc = a + b
//    println("$a degeri ve $b degerinin toplami: $sonuc")
    println("$a degeri ve $b degerinin toplami = ${a+b}")
}

fun findSingleNumbers(){
    var count = 0
    while (count < 10){
        if (count % 2 != 0){
            println("$count bir tek sayidir")
        }
        count++
    }
}