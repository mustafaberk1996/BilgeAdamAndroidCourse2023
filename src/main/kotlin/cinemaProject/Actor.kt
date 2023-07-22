package cinemaProject

import java.util.*

class Actor(val id:Int, val name:String, val birtDay: Date, val gender:Gender,val country:Countries) {
}

enum class Gender{
    MALE,
    FEMALE
}