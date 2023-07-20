package sealedClass

import kotlin.collections.List
import User
import java.lang.Exception

sealed class UIState {
    object Idle : UIState()
    object Loading : UIState()
    data class Result(val users:List<User>): UIState()
    data class Error(val exception: Exception): UIState()
}
