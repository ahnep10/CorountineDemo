package com.example.corountinedemo.ui.main

import com.example.corountinedemo.data.Task

data class TasksUiState(
    val isLoading: Boolean = false,
    val tasks: List<Task> = emptyList(),
    val announcement: String = "",
    val errorMessage: String? = null,
    val tapCount: Int = 0
)