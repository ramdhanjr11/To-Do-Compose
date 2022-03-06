package com.muramsyah.to_docompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.muramsyah.to_docompose.navigation.destination.listComposable
import com.muramsyah.to_docompose.navigation.destination.taskComposable
import com.muramsyah.to_docompose.util.Constants.LIST_SCREEN
import com.muramsyah.to_docompose.util.SearchAppBarState
import com.muramsyah.to_docompose.viewmodels.SharedViewModel

@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(navController = navController, startDestination = LIST_SCREEN) {
        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}