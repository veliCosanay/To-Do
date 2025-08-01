package com.example.to_do.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val taskName: String,
    val taskDescription: String,
    val dueDate: Date,
    val isDone: Boolean
)
