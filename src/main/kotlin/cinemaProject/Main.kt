package cinemaProject

import java.time.LocalDate
import java.util.*


fun main() {
    println()
    println()

    val userOguz = User(1, "Oguz","SinemaSever")
    val userMeltem = User(2, "Meltem","Tatar")
    val userHaluk = User(3, "Haluk","Tatar")
    val userDuygu = User(4, "Duygu","Tatar")
    val userEmre = User(5, "Emre","Tatar")

    val saloonA = Saloon(1,"A",10,SaloonType.CINEMA,true)
    val saloonB = Saloon(2,"B",50,SaloonType.THEATRE)

 
    val movie = Movie(1,"Opphenheimer",140.0,LocalDate.of(2023,7,21),Database.actors, duration = 135523234)
    val theatre = Theatre(1, "Romeo & Julliet",100.0,LocalDate.of(2023,9,10),Database.actors, stageCount = 6)


    val ticketA = Ticket(1,  1, saloonA, TicketType.STUDENT, userEmre, movie)
    val ticketB = Ticket(2,  2, saloonB, TicketType.VIP, userMeltem, theatre)
    val ticketC = Ticket(3,  3, saloonA, TicketType.NORMAL, userDuygu, movie)
    val ticketD = Ticket(4,  5, saloonA, TicketType.DOCTOR, userOguz,movie)
    val ticketE = Ticket(5,  6, saloonA, TicketType.TEACHER, userHaluk,movie)
    val ticketF = Ticket(6,  3, saloonA, TicketType.NORMAL, userEmre,movie)


}