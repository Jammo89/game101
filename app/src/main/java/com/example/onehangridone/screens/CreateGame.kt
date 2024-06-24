package com.example.onehangridone.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onehangridone.view.AddPlayer
import com.example.onehangridone.view.AppTextField
import com.example.onehangridone.view.LazyColumn101
import com.example.onehangridone.view.calculator.CalculatorView
import com.example.onehangridone.viewes.HeaderApp

@Composable
fun CreateGame() {


                val listPlayer = remember {
                    mutableListOf<String>()
                }

                var count by remember {
                    mutableStateOf(0)
                }

                var playerNameState by remember {
                    mutableStateOf("")
                }






                    Box(modifier = Modifier.fillMaxSize()) {
                        Column {

                            HeaderApp()


                            LazyColumn101(
                                listPlayer = listPlayer,
                                count = count,
                                calculateCount = {

                                }

                            )


                            Row(
                                modifier = Modifier.padding(
                                    start = 20.dp,
                                    end = 20.dp,
                                    bottom = 20.dp
                                ),
                                horizontalArrangement = Arrangement.Center
                            ) {


                                if (listPlayer.size <= 5){
                                    AddPlayer(
                                        text = "Добавить игрока",
                                        addPlayer = {
                                            listPlayer.add(playerNameState)
                                            playerNameState = ""
                                        }
                                    )
                                    Box(modifier = Modifier.padding(start = 10.dp))
                                    AppTextField(textValue = playerNameState, addText = {
                                        playerNameState = it
                                    })
                                }else{
                                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

                                        Text(text = "Игра началась!!!", fontSize = 22.sp, fontWeight = FontWeight.Medium)
                                    }

                                }

                            }
                            Box(contentAlignment = Alignment.Center){

                              for (i in listPlayer){
                                  if (i != null){
                                      CalculatorView(text = "", namePlayer = i)
                                  }
                                  else{
                                      CalculatorView(text = "", namePlayer = "")
                                  }
                              }


                            }

                        }
                    }
                }
