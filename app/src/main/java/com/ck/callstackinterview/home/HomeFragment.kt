package com.ck.callstackinterview.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ck.callstackinterview.R

/**
 * WELCOME to v0.0.3
 *
 * You are a step closer to be part of Callstack. I will help you to go through this test
 *
 * Points to do:
 *
 * 1) Do the fetchArt flow
 * 2) Add some tests cases to the HomeController
 *
 * Done! No need to show on the device or run it.
 *
 * Note: There are comments so you know what to do :)
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Call fetchArt
    }
}