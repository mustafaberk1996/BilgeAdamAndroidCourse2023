var user:Int? = null

fun main() {


    user = 450

    user?.let {user->
        println("kullanicimiz: $user")
    }

    findDoubleOr(45).also {
        println("sonuc $it")
    }




}