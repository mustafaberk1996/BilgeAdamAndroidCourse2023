package sealedClass

import Database
import java.lang.Exception


fun main() {


    val state = getUsers()
    when(state){
        UIState.Idle-> {}
        UIState.Loading-> {}
        is UIState.Error-> {
            state.exception.printStackTrace()
        }
        is UIState.Result-> {
            state.users.forEach {
                it.print()
            }
        }
    }

}

fun getUsers():UIState {

    val state:UIState = try {
        //network request
        Thread.sleep(3000)
        UIState.Result(Database.users)
    }catch (e:Exception){
        UIState.Error(e)
    }

    return state

}
