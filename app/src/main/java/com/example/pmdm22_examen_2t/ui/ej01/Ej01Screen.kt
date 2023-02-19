package com.example.pmdm22_examen_2t.ui.ej01

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.pmdm22_examen_2t.R


@Composable
fun Ej01Screen() {

    var numCounters by rememberSaveable { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.title)) },
                actions = {
                    if (numCounters != 0) {
                        IconButton(onClick = { numCounters = 0 }) {
                            Icon(
                                imageVector = Icons.Filled.Refresh,
                                contentDescription = ""
                            )
                        }

                    }
                })
        }
    ) { paddingValues ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(15.dp)
        ) {
            if (numCounters == 0) {
                ShowBlock(onUpdateNumCounters = { numCounters = it })
            }
            else {
                ListOfCounters(numCounters)
            }
        }

    }
}

