package com.example.CleanArchitecture.data.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [NoteEntity::class], version = 1, exportSchema = false)
abstract class NoteDataBase :RoomDatabase() {
    abstract fun doNoteDao(): NoteDao
}