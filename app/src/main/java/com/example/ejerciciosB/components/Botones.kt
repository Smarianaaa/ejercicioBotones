package com.example.clase13.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BotonNormal() {
    Button(onClick = { /*TODO*/}, enabled = false) {
        Text(text = "Boton Normal", fontSize = 30.sp)
    }
}



@Composable
fun BotonNormal2() {
    Button(
        onClick = { /*TODO*/},
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Red,
        )
    ) {
        Text(text = "Boton Normal 2", fontSize = 30.sp)
    }
}

@Composable
fun BotonTexto() {
    Button(onClick = { /*TODO*/}) {
        Text(text = "Boton Texto", fontSize = 30.sp)
    }
}



@Composable
fun BotonOutline() {
    OutlinedButton(onClick = { /*TODO*/ }, border = BorderStroke(3.dp, Color.Blue)) {
        Text(text = "Boton Outline", fontSize = 30.sp)
    }
}



@Composable
fun BotonIcono() {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            Icons.Filled.Home,
            contentDescription = "Icono Home",
            tint = Color.Red,
            modifier = Modifier.size(50.dp)
        )
    }
}

@Composable
fun BotonSwitch() {
    var switched by remember {
        mutableStateOf(false)
    }
    Switch(
        checked = switched,
        onCheckedChange = {
            switched = it
        },
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color.Red,
            checkedTrackColor = Color.Green,
            uncheckedThumbColor = Color.Yellow,
            uncheckedTrackColor = Color.Blue
        )
    )
}

@Composable
fun BotonDarkMode(darkMode: MutableState<Boolean>) {
    Button(
        onClick = { darkMode.value = !darkMode.value }
    ) {
        Icon(imageVector = Icons.Filled.Star, contentDescription = "Dark Mode")
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = "Dark Mode", fontSize = 30.sp)
    }
}



@Composable
fun FloatingAction() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        backgroundColor = Color.Red,
        contentColor = Color.White,
    ) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "", modifier = Modifier.size(30.dp))
    }
}



@Composable
fun Space() {
    Spacer(modifier = Modifier.height(10.dp))
}