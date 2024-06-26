package com.example.onehangridone.view.calculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
    fun CalculatorView(
        text: String,
        namePlayer: String
    ){

        var textState by remember {
            mutableStateOf(text)
        }




        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


                TextField(value = textState, onValueChange = {
                    textState =it
                },
                    label = { Text(text = namePlayer)}
                )



            Spacer(modifier = Modifier.height(12.dp))
            
            Row (
                horizontalArrangement = Arrangement.Center,

            ){
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                    contentAlignment = Alignment.Center,
                    ){
                    Button(onClick = { /*TODO*/ }

                    ) {
                        Text(text = "Прибавить")
                    }
                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                    contentAlignment = Alignment.Center
                    ){
                    Button(onClick = { /*TODO*/ }
                        ) {
                        Text(text = "Вычесть")
                    }
                }
            }
        }



    }