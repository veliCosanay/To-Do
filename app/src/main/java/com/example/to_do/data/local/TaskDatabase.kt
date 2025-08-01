package com.example.to_do.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.to_do.data.local.dao.TaskDao
import com.example.to_do.data.local.entity.Task

@Database(
    entities = [Task::class],
    version = 1
)
abstract class TaskDatabase: RoomDatabase() {

    abstract val dao: TaskDao
}