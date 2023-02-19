package com.example.pmdm22_examen_2t.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pmdm22_examen_2t.MenuScreen
import com.example.pmdm22_examen_2t.ui.ej01.Ej01Screen
import com.example.pmdm22_examen_2t.ui.ej01vm.Ej01vmScreen
import com.example.pmdm22_examen_2t.ui.ej02.Ej02Screen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.MainScreen.route) {
        composable(route = Screens.MainScreen.route) { MenuScreen(navController) }
        composable(route = Screens.Ejemplo01.route) { Ej01Screen() }
        composable(route = Screens.Ejemplo01vm.route) { Ej01vmScreen() }
        composable(route = Screens.Ejemplo02.route) { Ej02Screen() }
    }
}



