package com.udea.spaceexplorer.infrastructure.retrofitService

import com.example.jetsnack.model.Snack
import retrofit2.http.GET

interface RetrofitService {
    @GET("snacks/all")
    suspend fun getSnacks(
    ) : List<Snack>
}