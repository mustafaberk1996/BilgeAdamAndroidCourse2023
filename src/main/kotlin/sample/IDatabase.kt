package sample

import User

interface IDatabase {
    fun insert(user: User)
    fun delete()
    fun update()
    fun getAll():List<User>
}