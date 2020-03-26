package com.foreknowledge.rssnewsreader.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foreknowledge.rssnewsreader.databinding.ItemNewsBinding
import com.foreknowledge.rssnewsreader.holder.NewsHolder
import com.foreknowledge.rssnewsreader.model.News

class NewsRecyclerAdapter(private var newsList: List<News>) : RecyclerView.Adapter<NewsHolder>() {

    override fun getItemId(position: Int) = newsList[position].hashCode().toLong()

    override fun getItemCount(): Int = newsList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder
        = NewsHolder(ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: NewsHolder, position: Int) = holder.bind(newsList[position])

}