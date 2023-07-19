import javax.xml.crypto.Data

fun main() {
    val updatedUser = User(2,"Esra","Cinar","esra@hotmail.com","54321")

    val mySqlDataBase = MySqlDataBase()
    //val firebaseDatabase = FirebaseDatabase()

    saveUser("Mustafa","Berk","mustafa@gmail.com","12345", mySqlDataBase)
    //deleteUser("2", mySqlDataBase)
    //deleteUser("55", mySqlDataBase)
    //updateUser(updatedUser, mySqlDataBase)
}

class MySqlDataBase:IDatabase{
    override fun insert(name: String, surname: String, email: String, password: String) {

        val lastUser = Database.users.lastOrNull()
        var user: User =  User(1,name,surname,email, password)

        lastUser?.let { user = User(lastUser.id+1,name,surname,email, password) }
        val result = Database.users.add(user)

//        user.name = name
//        user.surname = surname

        if (result) println("eklenen kullanici ${user.name} adli ${user.id} idli kullanici eklendi")
        else println("kullanici kayit islemi basarisiz")

        getAll().forEach {
            it.print()
        }
    }

    override fun delete(id: Int) {
        val user = Database.users.find { it.id == id }
        //1. Yontem
//        if(user != null){
//            if(Database.users.remove(user)) println("User deleted successfully")
//            else print("User cannot be deleted")
//        }
//        else println("no user with given id user cannot be deleted")

        //2. Yontem
        user?.let {
            if (Database.users.remove(it)) println("User deleted successfully")
            else print("User cannot be deleted")
        }?: run {
            println("user null so the user cannot be deleted!")
        }

        getAll().forEach {
            it.print()
        }
    }

    override fun update(user: User) {
       Database.users.find { it.id == user.id }?.let {
           it.name = user.name
           it.surname = user.surname
           it.email = user.email
           it.password = user.password
       }?: kotlin.run {
           println("kullanici bulunamadi")
       }
        //Database.users.find { it.id == user.id }?.print()
        Database.users.forEach { it.print() }

    }

    override fun getAll(): List<User> {
       return Database.users
    }

}

class FirebaseDatabase:IDatabase{
    override fun insert(name: String, surname: String, email: String, password: String) {
        println("$email kullanicisi Firebase veritabanina kayit oldu")
    }

    override fun delete(id: Int) {
        TODO("Not yet implemented")
    }

    override fun update(user: User) {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<User> {
        TODO("Not yet implemented")
    }

}

interface IDatabase{
    fun insert(name:String, surname:String, email:String, password: String)
    fun delete(id:Int)
    fun update(user:User)
    fun getAll():List<User>
}

fun saveUser(name:String, surname:String,email: String, password: String, dataBase: IDatabase) {
    dataBase.insert(name, surname,email, password)
}
fun deleteUser(id:Int, database:IDatabase){
    database.delete(id)
}
fun updateUser(user:User,database: IDatabase){
    database.update(user)
}

