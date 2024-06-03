package com.example.onehangridone


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.Modifier

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.onehangridone.ui.theme.OneHangridOneTheme
import com.example.onehangridone.view.LazyColumn101
import com.example.onehangridone.viewes.HeaderApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OneHangridOneTheme {

                val listP = listOf<String>("Миша", "Юля", "Рустик", "Наташа", "Диана")

                val listPlayer = remember {
                    mutableListOf<String>()
                }

                var playerState by remember {
                    mutableStateOf("")
                }

                val countPlayer by remember {
                    mutableStateOf(0)
                }

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {


                    Box(modifier = Modifier.fillMaxSize()) {
                        Column {

                            HeaderApp()


                            LazyColumn101(
                                listPlayer = listPlayer,
                                countPlayer = countPlayer
                            )


                            Row(
                                modifier = Modifier.padding(
                                    start = 20.dp,
                                    end = 20.dp,
                                    bottom = 20.dp
                                ),
                                horizontalArrangement = Arrangement.Center
                            ) {
                                AddPlayer(
                                    addPlayer = {
                                        listPlayer.add(playerState)
                                        playerState = ""
                                    }
                                )
                                Box(modifier = Modifier.padding(start = 10.dp))
                                AppTextField(textValue = playerState, addText = {
                                    playerState = it
                                })
                            }
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun AddPlayer(
    addPlayer: () -> Unit
) {

    Button(
        onClick = {
            addPlayer()
        }, modifier = Modifier
            .height(64.dp)
            .width(150.dp)
    ) {
        Text(text = "Добавить игрока", textAlign = TextAlign.Center)

    }
}


@Composable
fun AppTextField(
    textValue: String,
    addText: (String) -> Unit
) {
    TextField(
        value = textValue,
        onValueChange = { addText(it) }
    )

}

@Composable
fun AccountСalc(
    countClick: Int,
    click: Boolean,
    textValue: String

) {

    var text = textValue

    if (click == false) {
        countClick
    } else {
        TextField(value = textValue, onValueChange = {
            text = it
        })


    }


}