package EnumClass

fun main() {


//"Erkek","Kadin"
//
//    0,1
//

    val dataFromDatabase = User(1, "Oguz", 1)

    val books = listOf(
        Book(1, "Lord of the Rings, Two Tower", 4),
        Book(2, "Suc ve Ceza", 0),
        Book(3, "Olasiliksiz", 0),
        Book(4, "Desem ki", 1),
        Book(5, "Elif ve Dis Politika", 2),
        Book(6, "Ali Koc ve Digerleri", 3)
    )


    //https://www.bilgeadam.com/api/v2/users?gender=1



    if (dataFromDatabase.gender == Gender.Man.genderNumber) println("${dataFromDatabase.name} bir erkek")
    else println("${dataFromDatabase.name} bir kadin")


}

private class User(val id: Int, val name: String, val gender: Int)
private class Book(val id: Int, val name: String, val bookType: Int)

private enum class Gender(val genderNumber: Int) {
    Woman(0),
    Man(1)
}

private enum class BookType(val typeNumber: Int) {
    Roman(0),
    Poem(1),
    Politic(2),
    Economic(3),
    Fantastic(4)
}