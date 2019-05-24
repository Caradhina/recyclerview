package com.example.amandahinchman_dominguez.recyclerviews

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ListAdapter(private val list: List<Hero>)
    : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie: Hero = list[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = list.size

}

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {

    private var mNameView: TextView? = null
    private var mPowerView: TextView? = null
    private var mGenderView: TextView? = null

    init {
        mNameView = itemView.findViewById(R.id.list_name)
        mPowerView = itemView.findViewById(R.id.list_power)
        mGenderView = itemView.findViewById(R.id.list_gender)
    }

    fun bind(hero: Hero) {
        mNameView?.text = hero.superhero
        mPowerView?.text = hero.power.toString()
        mGenderView?.text = hero.gender
    }

}
