fun main() {



    val age = 40


    if (age > 10){
        println("Yasiniz 10'dan buyuk")
    }else{
        println("Yasiniz 10'a esit veya kucuk")
    }

    val isActive = false

    if (isActive){
        println("kullanici suan da musait durumda")
    }
    else{
        println("kullanici suan da musait durumda degil")
    }

    if (!isActive){
        println("arka plan rengini gri yap")
    }else{
        println("arka plan rengini yesil yap")
    }


    if (age==100){
        println("yasiniz 100")
    }else if(age > 20){
        println("yasiniz 20'den buyuk")
    }else if (age < 90){
        println("yasiniz 90'dan kucuk")
    }else{
        println("yasiniz yukaridaki kosullardan baska.")
    }

    if (isActive && age > 20){
        println("isActive: $isActive, age: $age")
    }else{
        println("isActive false veya age 20 den buyuk degil")
    }

    if (isActive || age > 20){
        println("isActive true veya age 20 den buyuk")
    }else{
        println("isActive false yada age 20 den buyuk degil")
    }

    // && ancak ve ancak tum kosullar saglaniyorsa
    // || kosullardan en az 1'i kosulu sagliyorsa


    val result = 0

    when (result) {
        0 -> { println("Berabere") }
        1 -> println("1. Takim Kazandi")
        2 -> println("2. Takim Kazandi")
        else-> println("mac yarida kaldi")

    }





}