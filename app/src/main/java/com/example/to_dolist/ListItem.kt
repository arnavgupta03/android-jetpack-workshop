package com.example.to_dolist

data class ListItem(
    val title: String,
    val description: String,
    var completed: Boolean,
)

object Task {
    var taskList: List<ListItem> = emptyList()
}