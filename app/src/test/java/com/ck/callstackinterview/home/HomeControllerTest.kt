package com.ck.callstackinterview.home

import com.ck.callstackinterview.BaseTest
import com.ck.callstackinterview.model.ArtItem
import org.junit.Test

class HomeControllerTest: BaseTest() {

    // Add tests cases to the Home Controller
    @Test
    fun `Add meaningful name`() {
        // Get an instance of HomeController
        // Assert the artResult values must be in the right order
    }

    fun getMockedArts(): List<ArtItem> {
        return listOf(
            ArtItem(id = 1, artistId = 1, title = "Title 1", inscriptions = "Great art"),
            ArtItem(id = 2, artistId = 2, title = "Title 2", inscriptions = "Great art"),
            ArtItem(id = 3, artistId = 1, title = "Title 3", inscriptions = "Great art"),
            ArtItem(id = 4, artistId = 3, title = "Title 4", inscriptions = "Great art"),
            ArtItem(id = 5, artistId = 2, title = "Title 5", inscriptions = "Great art"),
        )
    }
}

