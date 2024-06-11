package com.example.onehangridone.view


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text


@Composable
fun LazyColumn101(
    listPlayer: MutableList<String>,
    count: Int,
    calculateCount:()->Unit
) {

var player by remember {
    mutableStateOf("")
}
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp)

    ) {

        items(listPlayer.size)
        {

 player = listPlayer[it]

            CardPlayer(
                count = count, name = player , calculateCount = {calculateCount() }
            )

        }

    }
}
















