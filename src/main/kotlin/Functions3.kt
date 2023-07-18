fun main() {
    val countryCodes = listOf<Int>(10,24,52,523,2363,325,235,24)
    //findDoubleOrSingleInWhile(40)
    findDoubleOrSingleInWhile(countryCodes)
}

fun findDoubleOrSingleInWhile(codes: List<Int>) {
    codes.forEach {code->
        findDoubleOrSingleAndWrite(code)
    }
}

fun findDoubleOrSingleInWhile(number: Int) {
    var count = 0
    while (count < number){
        findDoubleOrSingleAndWrite(count)
        count++
    }
    println("en son count degeri: $count")
}

fun findDoubleOrSingleAndWrite(count:Int){
    if (count % 2 == 0) println("$count cifttir")
    else println("$count tektir")
}
