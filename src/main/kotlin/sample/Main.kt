package sample

import User
import singleton.ValidationSingleton


fun main() {

    val mySqlDatabase = MySqlDataBase()

    //val user = User(1,"Mustafa","Berk","m@gmail.com","1234")
    saveUser(ValidationSingleton.sampleUser, mySqlDatabase)
}


fun saveUser(user:User, database:IDatabase){
    database.insert(user)
}