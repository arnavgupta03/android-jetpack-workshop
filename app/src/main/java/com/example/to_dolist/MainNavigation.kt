package com.example.to_dolist

import androidx.navigation.NavController

private object Screens {
    const val LIST_SCREEN = "list"
    const val ADD_ITEM_SCREEN = "addItem"
}

object Destinations {
    const val LIST_ROUTE = Screens.LIST_SCREEN
    const val ADD_ITEM_ROUTE = Screens.ADD_ITEM_SCREEN
}

class MainNavigationActions(private val navController: NavController) {
    fun navigateToList() {
        navController.navigate(Destinations.LIST_ROUTE)
    }

    fun navigateToAddItem() {
        navController.navigate(Destinations.ADD_ITEM_ROUTE)
    }
}