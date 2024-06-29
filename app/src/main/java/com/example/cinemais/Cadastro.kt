package com.example.cinemais

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinemais.ui.theme.CinemaisTheme

class Cadastro : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CinemaisTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    cadastro()
                }
            }
        }
    }
}

@Composable
fun Botao() {
    Button(
        onClick = { /* Ação a ser executada ao clicar */ }, // Defina a ação aqui
        modifier = Modifier
            .padding(16.dp) // Adiciona espaçamento
            .width(250.dp)
            .height(50.dp), // Define a altura do botão

        ) {
        Text("Comprar Ingressos") // Texto do botão
    }
}

@Composable
fun botao1() {
    Button(
        onClick = { /* Ação a ser executada ao clicar */ }, // Defina a ação aqui
        modifier = Modifier
            .padding(16.dp) // Adiciona espaçamento
            .width(250.dp)
            .height(50.dp), // Define a altura do botão

        ) {
        Text("Entrar") // Texto do botão
    }
}

@Composable
fun cadastro(){
    Column(
        modifier = Modifier
            .background(
                Color.Black
            )
            .fillMaxSize()
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
        ){

            Spacer(modifier = Modifier.width(70.dp))

            Column(
                modifier = Modifier
            ) {
                Spacer(modifier = Modifier.height(15.dp))


            Text(text = "CineMais",
                Modifier,

                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 50.sp,

            )
        }

            Column (
                modifier = Modifier

            ){


                Image(
                    painter = painterResource(id = R.drawable.filme), // Caminho correto da imagem
                    contentDescription = null, // Descrição da imagem (opcional)
                    modifier = Modifier
                        .size(100.dp)
                        // Tamanho da imagem (250x355 pixels)
                        .padding(0.dp) // Adiciona espaçamento em torno da imagem
                )
            }
        }

        Row(
            modifier = Modifier
                .padding(60.dp)
        ){}

     Column (
         modifier = Modifier
             .fillMaxWidth()
             .size(600.dp, 600.dp),

     ){

         Column(
             modifier = Modifier

                 .fillMaxWidth()
                 .size(350.dp, 500.dp),

             ) {


             Row(
                 modifier = Modifier
                     .fillMaxWidth(),
                 Arrangement.Center
             ) {
                 Text(
                     text = "Log in",
                     Modifier,

                     color = Color.White,
                     fontWeight = FontWeight.Bold,
                     fontSize = 50.sp,


                     )
             }

             Row(
                 modifier = Modifier
                     .fillMaxWidth(),
                    Arrangement.Center
             ){
                 var text1 by remember { mutableStateOf("")  }
                     OutlinedTextField(
                         value = text1,
                         onValueChange = {text1 = it},
                         label = {Text("Email:", color = Color.White)}
                     )

             }
             Row(
                 modifier = Modifier
                     .fillMaxWidth(),
                 Arrangement.Center
             ){
                 var text2 by remember { mutableStateOf("")  }
                 OutlinedTextField(
                     value = text2,
                     onValueChange = {text2 = it},
                     label = {Text("Senha:", color = Color.White)}
                 )

             }
             Row (
                 modifier= Modifier
                     .fillMaxWidth(),
                 Arrangement.Center


             ){
                 botao1()
             }
         }
     }
    }

}
@Composable
@Preview()
fun cadastroPreview(){
    CinemaisTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            cadastro()
        }
    }
}
