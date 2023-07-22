package cinemaProject

import java.util.*

object Database {

    val tickets = mutableListOf<Ticket>()
    val actors = mutableListOf(

        Actor(1, "Mustafa", Date(), Gender.MALE, Countries.AFGHANISTAN),
        Actor(2, "Mustafa", Date(), Gender.MALE, Countries.AFGHANISTAN),
        Actor(3, "Mustafa", Date(), Gender.MALE, Countries.ALBANIA),
        Actor(4, "Mustafa", Date(), Gender.MALE, Countries.ANDORRA),
        Actor(5, "Mustafa", Date(), Gender.MALE, Countries.AFGHANISTAN),
        Actor(1, "Mustafa", Date(), Gender.MALE, Countries.AFGHANISTAN),
        Actor(1, "Mustafa", Date(), Gender.MALE, Countries.AFGHANISTAN),
        Actor(1, "Mustafa", Date(), Gender.MALE, Countries.AFGHANISTAN)

    )
}