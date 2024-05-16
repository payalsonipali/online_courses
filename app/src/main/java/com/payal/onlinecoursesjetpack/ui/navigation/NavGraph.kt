package com.payal.onlinecoursesjetpack.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.payal.onlinecoursesjetpack.ui.screens.HomeScreen
import com.payal.onlinecoursesjetpack.ui.screens.MyCoursesScreen
import com.payal.onlinecoursesjetpack.ui.screens.ProfileScreen
import com.payal.onlinecoursesjetpack.ui.screens.SelectedCoursesScreen
import com.payal.onlinecoursesjetpack.ui.screens.WatchListScreen
import com.payal.onlinecoursesjetpack.ui.theme.Grey70

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = "Home",
      ) {
        composable(route = home) {
            HomeScreen(navHostController)
        }
        composable(route = my_course) {
            MyCoursesScreen()
        }
        composable(route = watch_list) {
            WatchListScreen()
        }
        composable(route = profile) {
            ProfileScreen()
        }
        composable(route = selectedCoursesScreen) {
            SelectedCoursesScreen(navHostController)
        }
    }
}