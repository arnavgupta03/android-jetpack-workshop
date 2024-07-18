package com.example.to_dolist

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController

@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    navActions: MainNavigationActions,
) {
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
                        text = "Things To Do",
                        fontSize = TextUnit(36f, TextUnitType.Sp),
                    )
                }
                Column {
                    Button(onClick = {
                        /*
                            TODO: Navigate to Add Item
                         */
                    }) {
                        Text(
                            text = "+ Add Task",
                            fontSize = TextUnit(16f, TextUnitType.Sp),
                        )
                    }
                }
            }
            Row(
                modifier = modifier.fillMaxSize(),
            ) {
                /*
                    TODO: Display list of to-do items
                 */
            }
        }
    }
}

@Preview
@Composable
fun PreviewListScreen() {
    Task.taskList = listOf(
        ListItem(
            title = "Task 1",
            description = """
                This is a task with this description.
                The description is quite long and has some text that needs to be printed.
            """.trimIndent(),
            completed = true,
        ),
        ListItem(
            title = "Task 2",
            description = """
                This is another task with this description.
                The description is also quite long and has some text that needs to be printed.
            """.trimIndent(),
            completed = false,
        ),
    )

    ListScreen(
        navActions = MainNavigationActions(rememberNavController())
    )
}