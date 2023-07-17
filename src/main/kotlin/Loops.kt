fun main() {

    println("0 dan 10 a dogru artan dongu")
    var oneLoop:String = ""
    for (i in 0..10){
        oneLoop += "$i, "
    }
    print(oneLoop.removeSuffix(", "))

    println("\n10 dan 0 a dogru azalan dongu")
    var secondLoop = ""
    for (i in 10 downTo 0){
        secondLoop += "$i, "
    }
        print(secondLoop.removeSuffix(", "))

}