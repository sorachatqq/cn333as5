package com.example.mynotes.database

import android.content.Context
import androidx.room.*

@Database(entities = [NoteDbModel::class, ColorDbModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
    abstract fun colorDao(): ColorDao

    companion object {
        private const val DATABASE_NAME = "note-maker-database"
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            var instance = INSTANCE
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DATABASE_NAME
                ).build()

                INSTANCE = instance
            }

            return instance
        }
    }
}