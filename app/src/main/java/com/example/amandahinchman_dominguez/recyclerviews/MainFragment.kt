package com.example.amandahinchman_dominguez.recyclerviews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_main.*

// VO POJO == setter / getter || HashMap
data class Hero(val superhero: String, val power: Int, val gender: String)

class MainFragment : Fragment() {

    private val heroes = listOf(
        Hero("Superman", 100, "M"),
        Hero("Spiderman", 90, "M"),
        Hero("Wonderwoman", 89, "F"),
        Hero("Thor", 92, "M"),
        Hero("Batman", 70, "M"),
        Hero("Iron Man", 95, "M"),
        Hero("Black Panther", 80, "M")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_main, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list_recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ListAdapter(heroes)
        }
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }
}