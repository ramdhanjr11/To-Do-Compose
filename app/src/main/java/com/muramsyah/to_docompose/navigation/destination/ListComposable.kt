package com.muramsyah.to_docompose.navigation.destination

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.muramsyah.to_docompose.ui.screens.ListScreen
import com.muramsyah.to_docompose.util.Constants.LIST_ARGUMENT_KEY
import com.muramsyah.to_docompose.util.Constants.LIST_SCREEN
import com.muramsyah.to_docompose.util.SearchAppBarState
import com.muramsyah.to_docompose.viewmodels.SharedViewModel

@ExperimentalMaterialApi
fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY){
            type = NavType.StringType
        })
    ) {
        ListScreen(
            navigateToTaskScreen = navigateToTaskScreen,
            sharedViewModel = sharedViewModel
        )
    }
}