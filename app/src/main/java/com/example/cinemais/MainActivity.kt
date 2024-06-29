package com.example.cinemais

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinemais.ui.theme.CinemaisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CinemaisTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun botao() {
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
fun App() {

//Criação das variaveis de imagem
val Menu = painterResource(R.drawable.menu)
val Lupa = painterResource(R.drawable.lupa)

    //Inicio da Coluna Principal
        Column (
            Modifier
                .background(Color.White)
                .fillMaxWidth()
                .fillMaxHeight()

                ){

            //Linha da NavBar
                    Row(
                        Modifier
                            .background(Color.Black)
                            .height(100.dp)
                            .fillMaxWidth(),

                        ){
                            //espaçamento da Row verticalmente
                            Spacer(modifier = Modifier.width(20.dp))

                                 //Coluna da Imagem do Menu
                                 Column {

                             //Espaçamento Horizontal da Coluna da imagem do Menu (Altura)
                            Spacer(modifier = Modifier.height(25.dp))

                                //Adicionando a imagem do Menu na tela
                                 Image(
                                     painter = Menu,
                                     contentDescription = null,
                                     modifier = Modifier
                                         .size(50.dp)
                                         .padding(0.dp, 0.dp)
                                 )
                        }//Fim da Coluna do Menu

                    //Espaçamento entre o titulo e a imagem do Menu
                         Spacer(modifier = Modifier.width(45.dp))

                    //Coluna do titulo
                    Column {

                    //Adicionando texto na tela
                    Text(text =  "CineMais",
                        Modifier
                        .padding(0.dp, 20.dp),
                        color = Color.White,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        )
                    }//Fim da Coluna do Texto

                        //Espaçamento entre a coluna do texto e a coluna da imagem de pesquisa
                         Spacer(modifier = Modifier.width(30.dp))

                    //Coluna da Imagem de Pesquisa
                    Column {

                        //Espaçamento Horizontal da Coluna da imagem do Menu (Altura)
                        Spacer(modifier = Modifier.height(20.dp))

                            //Imagem da lupa
                            Image(
                                painter = Lupa,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(0.dp, 0.dp),
                            )
                    }//Fim Coluna da Pesquisa





             } //Fim da Row da Navbar

            //linha de espaçamento
            Row (
                Modifier
                    .padding(10.dp)
            ){
            }

            //Linha da Imagem do Filme
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                    Arrangement.Center
                      ){

                Column(
                    modifier = Modifier
                        .background(Color.DarkGray, shape = RoundedCornerShape(5.dp)),
                    Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.divertidamente), // Caminho correto da imagem
                        contentDescription = null, // Descrição da imagem (opcional)
                        modifier = Modifier
                            .width(280.dp)
                            .height(490.dp)
                            // Tamanho da imagem (250x355 pixels)
                            .padding(4.dp) // Adiciona espaçamento em torno da imagem
                    )
                }

            }//Fim da Linha do filme

            Row (
                Modifier
                    .padding(0.dp)
            ){
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                     Arrangement.Center
            ){
                Text("Divertida Mente 2", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 25.sp)
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                    Arrangement.Center

            ){
                botao()
            }

            Spacer(modifier = Modifier.weight(1f))

            //footer
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Black)
                    .padding(50.dp)
                    .align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

                ) {

                Text("Home", color = Color.White, fontWeight = FontWeight.Bold)
                Text("Filme", color = Color.White, fontWeight = FontWeight.Bold)
                Text("Série", color = Color.White, fontWeight = FontWeight.Bold)
            }

        }//Fim da Coluna 1



}

        




@Preview(showBackground = true)
@Composable
fun AppPreview() {
    CinemaisTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(enabled = true, state = rememberScrollState())
            ){
                App()

            }
        }
    }
}