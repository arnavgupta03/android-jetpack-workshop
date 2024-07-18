package com.example.to_dolist

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController

@Composable
fun AddItemScreen(
    modifier: Modifier = Modifier,
    navActions: MainNavigationActions,
) {
    var title by remember {
        mutableStateOf("")
    }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.background,
    ) {
        Column(
            modifier = modifier.padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .height(72.dp)
                    .background(MaterialTheme.colorScheme.surfaceDim),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column {
                    Text(
                        text = "Add Task",
                        fontSize = TextUnit(36f, TextUnitType.Sp),
                    )
                }
            }
            Row(
                modifier = modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
            ) {
                Column(
                    modifier = modifier.padding(top = 16.dp),
                ) {
                    // Task item title
                    Row {
                        Column {
                            Row {
                                Text(
                                    text = "Task Name",
                                    fontSize = TextUnit(20f, TextUnitType.Sp),
                                )
                            }
                            Row {
                                OutlinedTextField(
                                    value = title,
                                    onValueChange = { t -> title = t },
                                    label = { Text("Title") },
                                )
                            }
                        }
                    }

                    /*
                        TODO: add task item description
                     */

                    /*
                        TODO: add button to submit item
                     */
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewAddItemScreen() {
    AddItemScreen(
        navActions = MainNavigationActions(rememberNavController()),
    )
}