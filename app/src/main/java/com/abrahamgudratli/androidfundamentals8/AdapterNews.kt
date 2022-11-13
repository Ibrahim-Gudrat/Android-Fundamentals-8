package com.abrahamgudratli.androidfundamentals8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_sample.view.*

class AdapterNews(var news: List<ItemNews>) : RecyclerView.Adapter<AdapterNews.ViewHolderHome>() {

    inner class ViewHolderHome(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderHome {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_sample, parent, false)
        return ViewHolderHome(view)
    }

    override fun onBindViewHolder(holder: ViewHolderHome, position: Int) {
        holder.itemView.apply {
            tvNewsTitle.text = news[position].title
            tvNewsDescription.text = news[position].description
            ivNewsPoster.setImageResource(news[position].poster)
        }
    }

    override fun getItemCount(): Int {
        return news.size
    }

}