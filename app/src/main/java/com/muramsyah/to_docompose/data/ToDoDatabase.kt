package com.muramsyah.to_docompose.data

import androidx.room.Database
import com.muramsyah.to_docompose.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase {
    abstract fun todoDao(): TodoDao
}