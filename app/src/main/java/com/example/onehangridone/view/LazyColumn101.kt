package com.example.onehangridone.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyColumn101(
    listPlayer: MutableList<String>,
    countPlayer: Int


) {

    var onClick by remember {
        mutableStateOf(false)
    }
    var countNum by remember {
        mutableStateOf("0")
    }
    var result by remember {
        mutableStateOf(0)
    }



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
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
if (onClick == false){
    onClick = true
}else{
    onClick = false
}


                        },
                    contentAlignment = Alignment.Center
                ) {

                    if (onClick == true) {
                        Row {
                            Box(modifier = Modifier.weight(1f)) {
                                TextField(value = countNum,
                                    modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                                    onValueChange = {
                                        countNum = it
                                    })
                            }
                            Box(modifier = Modifier.weight(1f)) {
                                Button(onClick = { result = SummaNumbers(
                                    num1 = countNum.toInt(),
                                    num2 = result
                                )

                                onClick = false
                                }) {
                                    "+"
                                }
                            }
                        }


                    } else {
                        Text(
                            text = result.toString(),
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center,
                        )

                    }


                }

            }

        }

    }
}



fun SummaNumbers(
    num1: Int,
    num2: Int
): Int {
   val result: Int = num1 + num2
    return result

}