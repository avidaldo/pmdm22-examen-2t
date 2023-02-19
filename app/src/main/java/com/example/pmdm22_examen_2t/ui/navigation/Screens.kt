package com.example.pmdm22_examen_2t.ui.navigation

sealed class Screens(val route: String){
    object MainScreen: Screens("initial_screen")

    object Ejemplo01: Screens("ej01")
    object Ejemplo01vm: Screens("ej01vm")

    object Ejemplo02: Screens("ej02")

}
