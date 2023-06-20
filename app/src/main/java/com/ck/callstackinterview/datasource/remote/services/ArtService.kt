package com.ck.callstackinterview.datasource.remote.services

import com.ck.callstackinterview.datasource.remote.model.ArtSerial
import retrofit2.Response
import retrofit2.http.GET

interface ArtService {
    @GET("artworks?limit=5")
    suspend fun getArt(): Response<List<ArtSerial>>
}