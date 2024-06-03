package com.example.onehangridone.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onehangridone.AccountСalc


@Composable
fun LazyColumn101(
    listPlayer: MutableList<String>,
    countPlayer: Int

){



    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp)

    ) {

        items(listPlayer.size) {

            Row {
                Box(
                    modifier = Modifier.weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = listPlayer[it],
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight(600),
                        textAlign = TextAlign.Center
                    )
                }

                Box(
                    modifier = Modifier.weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = countPlayer.toString(),
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight(600),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.clickable {

                        }
                    )
                    AccountСalc(
                        countClick = countPlayer,
                        click = false,
                        textValue = countPlayer.toString()
                    )
                }

            }

        }

    }
}


