package com.foreknowledge.rssnewsreader

import android.app.Application
import com.foreknowledge.rssnewsreader.adapter.NewsRecyclerAdapter
import com.foreknowledge.rssnewsreader.model.News

class NewsApplication : Application() {
    companion object {
        var newsList = mutableListOf<News>()
        var mainRecyclerAdapter: NewsRecyclerAdapter? = null
    }
}