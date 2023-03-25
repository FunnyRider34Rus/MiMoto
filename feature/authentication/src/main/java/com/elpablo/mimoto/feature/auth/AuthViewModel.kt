package com.elpablo.mimoto.feature.auth

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(): ViewModel(), AuthEvent {

    private val _viewState = MutableStateFlow(AuthViewState())
    val viewState: StateFlow<AuthViewState> = _viewState


    fun onEvent(event: AuthEvent) {
        when(event) {
            is AuthEvent.CheckBoxClick -> {
                _viewState.value = _viewState.value.copy(isCheck = !_viewState.value.isCheck)
            }

            is AuthEvent.ButtonClick -> {

            }
        }
    }
}