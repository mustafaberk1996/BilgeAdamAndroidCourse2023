package cinemaProject

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

    val ticketA = Ticket(1, "Opphenheimer", 140.0, Date(), 1, saloonA, TicketType.STUDENT, userEmre)
    val ticketB = Ticket(2, "Romeo & Julliet", 90.0, Date(), 2, saloonB, TicketType.VIP, userMeltem)
    val ticketC = Ticket(3, "Opphenheimer", 140.0, Date(), 3, saloonA, TicketType.NORMAL, userDuygu)
    val ticketD = Ticket(4, "Opphenheimer", 140.0, Date(), 5, saloonA, TicketType.DOCTOR, userOguz)
    val ticketE = Ticket(5, "Opphenheimer", 140.0, Date(), 6, saloonA, TicketType.TEACHER, userHaluk)
    val ticketF = Ticket(6, "Opphenheimer", 140.0, Date(), 3, saloonA, TicketType.NORMAL, userEmre)



}