package com.foreknowledge.rssnewsreader

import android.app.Application
import com.foreknowledge.rssnewsreader.model.News

class GlobalApplication : Application() {
    companion object {
        var newsList = listOf<News>()
    }
}