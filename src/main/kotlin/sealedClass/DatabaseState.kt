package sealedClass

import java.lang.Exception
import java.lang.NullPointerException


data class Data(val id:Int, val name:String, val isActive:Boolean = false)

sealed class DatabaseState {
    object Loading:DatabaseState()
    object Deleted:DatabaseState()
    data class Insert(val data:Data):DatabaseState()
    data class Update(val data: Data):DatabaseState()
    data class All(val datas:List<Data>):DatabaseState()
    data class Error(val exception: Exception):DatabaseState()
}

fun main() {

    val data = Data(1,"Deneme")

    when (val state =  insertData(data)) {
        is DatabaseState.Insert -> {
            println("data eklendi: ${state.data}")
        }

        is DatabaseState.Error -> {
            println("bir hata olustu: ${state.exception}")
        }

        is DatabaseState.Deleted -> {
            println("data silindi")
        }

        else -> {
            println("baska bir database islemi")
        }
    }

}

fun insertData(data:Data):DatabaseState {

    val state:DatabaseState = try {
            Thread.sleep(2000)
            throw NullPointerException()
            DatabaseState.Insert(data)
        }catch (e:Exception){
             DatabaseState.Error(e)
        }

    return state

}
