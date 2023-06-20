package com.ck.callstackinterview.datasource.remote

import com.ck.callstackinterview.datasource.remote.services.ArtService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RemoteDataSource {
    companion object {
        const val BASE_URL = "https://api.artic.edu/api/v1/"
    }

    suspend fun fetchArt() = withContext(Dispatchers.IO) {
        getArtService(getRetrofit(getHttpClientBuilder())).getArt()
    }

}

private fun getHttpClientBuilder() = OkHttpClient.Builder()

private fun getRetrofit(okHttpClient: OkHttpClient.Builder): Retrofit {
    return Retrofit.Builder()
        .baseUrl(RemoteDataSource.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient.build())
        .build()
}

private fun getArtService(retrofit: Retrofit) = retrofit.create(ArtService::class.java)