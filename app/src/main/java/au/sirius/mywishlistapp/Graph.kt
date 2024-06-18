package au.sirius.mywishlistapp

import android.content.Context
import androidx.room.Room
import au.sirius.mywishlistapp.data.WishDatabase
import au.sirius.mywishlistapp.data.WishRepository

object Graph{

    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){

        database = Room.databaseBuilder(context = context,WishDatabase::class.java,"wishlist.db").build()

    }
}