package com.ck.callstackinterview.datasource.remote.model

import com.google.gson.annotations.SerializedName

class ArtSerial(
    @SerializedName("id") val id: Int,
    @SerializedName("artist_id") val artistId: Int,
    @SerializedName("title") val title: String,
    @SerializedName("inscriptions") val inscriptions: String,
)