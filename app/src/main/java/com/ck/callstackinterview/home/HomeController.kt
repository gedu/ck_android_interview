package com.ck.callstackinterview.home

import androidx.lifecycle.ViewModel
import com.ck.callstackinterview.model.ArtItem

class HomeController: ViewModel() {

    companion object {
        var artResult = mutableListOf<ArtItem>()
    }

    fun fetchArt() {
        // Fetch the art using the HomeRepository

        // To the result list switch places, from 0 to 3, use the switchPlaces from below

        // then store it into `artResult`
    }

    private fun MutableList<ArtItem>.switchPlaces(from: Int, to: Int) {
        this.add(to, this.removeAt(from))
    }
}