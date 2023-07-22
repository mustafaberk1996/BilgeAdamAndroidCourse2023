package cinemaProject

import java.util.Date

data class Ticket(
    val id: Int,
    val chairNo: Int, val saloon: Saloon,
    val type: TicketType, val owner: User,
    val event:Event
) {

    init {

        if (saloon.chairCount < 1) {
            println("Merhaba ${owner.name} ${owner.surname} salonumuz doludur bilet alinamadi")
        } else {//en az 1 koltuk var bosta

            val totalPrice = event.price
            val messagePrefix = getMessagePrefix(type)

            if (isChairAvailable(chairNo)) {//kesinlikle bilet alinacak
                when (type) {
                    TicketType.STUDENT -> event.price /= 2 //yuzde 50 indirim yapiliyor
                    TicketType.TEACHER -> event.price *= 0.7
                    TicketType.DOCTOR -> event.price *= 0.2
                    TicketType.FREE -> event.price = 0.0
                    TicketType.VIP -> event.price *= 2
                    else -> {
                        //for normal users
                    }
                }
                val discountText = getDiscountText(type, totalPrice, event.price)
                val eventTypeText = getEventTypeText(event)

                println("$messagePrefix ${owner.name} ${owner.surname} $eventTypeText biletininiz hazir iyi seyirler bilet ucretiniz: ${event.price}. $discountText")
                Database.tickets.add(this)
                saloon.chairCount--
            } else {
                println("Merhaba ${owner.name} maalesef ${event.name} icin $chairNo No'lu koltuk dolu, Lutfen farkli bir koltuk secimi yapiniz.")
            }
        }
    }

    private fun getEventTypeText(event: Event): String = if (event is Movie) "Sinema" else "Tiyatro"


    private fun getDiscountText(type: TicketType, totalPrice: Double, price: Double) = when (type) {
        TicketType.STUDENT, TicketType.TEACHER, TicketType.DOCTOR -> "Indiriminiz: (${totalPrice - price})"
        else -> ""

    }

    private fun getMessagePrefix(type: TicketType): String {
        return when (type) {
            TicketType.STUDENT -> "Sn Ogrenci"
            TicketType.TEACHER -> "Sn Ogretmen"
            TicketType.DOCTOR -> "Sn Dr."
            TicketType.FREE, TicketType.VIP, TicketType.NORMAL -> "Sn"
        }
    }

    private fun isChairAvailable(chairNo: Int): Boolean =
        Database.tickets.firstOrNull { it.chairNo == chairNo && it.saloon.id == saloon.id } == null

}

enum class TicketType {
    STUDENT,
    NORMAL,
    VIP,
    TEACHER,
    DOCTOR,
    FREE,
}

