package com.tesji.compose6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListadoSignos(listaDeSignos = listaDeSignos)
        }
    }
}
@Composable
fun ListadoSignos(listaDeSignos: List<Signo>) {
    LazyColumn {
        items(listaDeSignos) { signoactual ->
            TarjetaSigno(signo = signoactual)
        }
    }
}
@Composable
fun TarjetaSigno(signo: Signo) {
    Text(text = signo.nombre,
        style = MaterialTheme.typography.headlineSmall)
    Image(
        painter = painterResource(id = signo.imagen),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
    Text(text = signo.titulo)
    Text(
        text = signo.descripcion,
        style = MaterialTheme.typography.bodySmall
    )
}
data class Signo(val nombre: String, val titulo: String,
    val descripcion: String,val imagen: Int)

val listaDeSignos = listOf(
    Signo(
        "Aries",
        "Aries (21 de marzo-20 de abril)",
        "\"Los nacidos bajo el signo de Aries suelen ser personas ",
        R.drawable.aries),
    Signo(
        "Tauro",
        "Tauro (21 de abril- 21 de mayo)",
        "Este es un signo amoroso, al que le gusta ser romántico",
        R.drawable.tauro
    ),
    Signo(
        "Géminis",
        "Géminis (22 de mayo-21 de junio)",
        "La inteligencia es una de sus cualidades más conocidas",
        R.drawable.geminis
    ),
    Signo(
        "Cáncer",
        "Cáncer (22 de junio-22 de julio)",
        "Son personas hogareñas, románticas y muy apasionadas.",
        R.drawable.cancer
    ),
    Signo(
        "Leo",
        "Leo (23 de julio-23 de agosto)",
        "Les gusta ser líderes, apoyándose en sus ideas y convicciones.",
        R.drawable.leo
    ),
    Signo(
        "Virgo",
        "Virgo (24 de agosto-23 de septiembre)",
        "Son personas de carácter fuerte, con ideas firmes y claras",
        R.drawable.virgo
    ),
    Signo(
        "Libra",
        "Libra (24 de septiembre-23 de octubre)",
        "El equilibrio siempre está presente en su vida",
        R.drawable.libra
    ),
    Signo(
        "Escorpión",
        "Escorpión (24 de octubre-22 de noviembre)",
        "De mente calculadora, con carácter fuerte",
        R.drawable.escorpion
    ),
    Signo(
        "Sagitario",
        "Sagitario (23 de noviembre-21 de diciembre)",
        "Suelen ser desordenados, atrabancados o hasta berrinchudos",
        R.drawable.sagitario
    ),
    Signo(
        "Capricornio",
        "Capricornio (22 de diciembre-20 de enero)",
        "Prácticas, con una habilidad nata para encontrarle solución",
        R.drawable.capricornio
    ),
    Signo(
        "Acuario",
        "Acuario (21 de enero-18 de febrero)",
        "Amorosas, cariñosas y muy sensibles suelen ser las personas",
        R.drawable.acuario
    ),
    Signo(
        "Piscis",
        "Piscis (19 de febrero-20 de marzo)",
        "La honestidad puede llegar a ser una de sus mejores cualidades.",
        R.drawable.picis
    )
)


