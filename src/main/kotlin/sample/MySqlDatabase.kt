package sample

import Database
import User

class MySqlDataBase:IDatabase {
    override fun insert(user: User) {
        Database.users.add(user)

        getAll().forEach { it.print() }

    }

    override fun delete() {
        TODO("Not yet implemented")
    }

    override fun update() {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<User> = Database.users
}