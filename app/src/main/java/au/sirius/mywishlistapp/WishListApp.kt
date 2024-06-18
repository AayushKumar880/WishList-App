package au.sirius.mywishlistapp

import android.app.Application
import android.content.Context

class WishListApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}