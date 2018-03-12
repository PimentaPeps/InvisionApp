package br.com.invisionapp.mvvm.repository.api

import io.reactivex.Observable
import br.com.invisionapp.mvvm.repository.data.User
import retrofit2.http.GET

interface UserApi {

    @GET("https://invisionapp-f2994.firebaseio.com/.json")
    fun getUsers(): Observable<List<User>>
}
