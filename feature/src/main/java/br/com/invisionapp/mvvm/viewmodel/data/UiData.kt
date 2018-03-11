package br.com.invisionapp.mvvm.viewmodel.data

import br.com.invisionapp.mvvm.repository.data.User

data class UsersList(val users: List<User>, val message: String, val error: Throwable? = null)
