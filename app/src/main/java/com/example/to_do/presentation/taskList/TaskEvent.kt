package com.example.to_do.presentation.taskList

sealed interface TaskEvent {

    object saveTask: TaskEvent
}