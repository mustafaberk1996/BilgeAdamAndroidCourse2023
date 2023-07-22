package cinemaProject

import java.time.LocalDate
import java.util.*

class Movie(id:Int, name:String,price:Double,date: LocalDate,actors:List<Actor>,val duration:Long): Event(id, name,price,date,actors) {

}