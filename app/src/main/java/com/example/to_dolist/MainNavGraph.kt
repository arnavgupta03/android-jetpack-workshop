package com.example.to_dolist

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Destinations.LIST_ROUTE,
    navigationActions: MainNavigationActions = remember(navController) {
        MainNavigationActions(navController)
    }
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        composable(
            Destinations.LIST_ROUTE,
        ) {
            ListScreen(
                modifier = modifier,
                navActions = navigationActions,
            )
        }

        composable(
            Destinations.ADD_ITEM_ROUTE,
        ) {

        }
    }
}