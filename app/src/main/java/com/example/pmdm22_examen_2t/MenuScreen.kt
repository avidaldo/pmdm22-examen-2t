package com.example.pmdm22_examen_2t

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.pmdm22_examen_2t.ui.navigation.Screens

@Composable
fun MenuScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = { navController.navigate(route = Screens.Ejemplo01.route) }) {
            Text(text = "Ejercicio 1")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejemplo01vm.route) }) {
            Text(text = "Ejercicio 1 con VM")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejemplo02.route) }) {
            Text(text = "Ejercicio 2")
        }
    }

}