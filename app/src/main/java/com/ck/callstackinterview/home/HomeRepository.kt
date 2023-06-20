package com.ck.callstackinterview.home

import com.ck.callstackinterview.model.ArtItem

class HomeRepository {

    suspend fun fetchArt(): List<ArtItem>? {
        // Fetch the art calling the RemoteDataSource
        return null
    }
}