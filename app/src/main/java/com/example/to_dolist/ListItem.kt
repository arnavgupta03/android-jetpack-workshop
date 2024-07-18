package com.example.to_dolist

data class ListItem(
    val title: String,
    val description: String,
    val completed: Boolean,
)

object ListItems {
    var taskList: List<ListItem> = emptyList()
}