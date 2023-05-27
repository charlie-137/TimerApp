package com.brogrammer.timerapp.screens


//import android.support.v4.os.IResultReceiver.Default
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.*
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.material.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp


//@Composable
//private fun BackgroundColorTextField(text: String = stringResource(id = R.string.jetpack)) {
//    val state = remember { mutableStateOf(TextFieldValue(text = text)) }
//    TextField(
//        value = state.value,
//        onValueChange = { state.value = it },
//        textStyle = TextStyle(color = Color.Black),
//        modifier = Modifier
//            .padding(16.dp)
//            .fillMaxWidth(),
//        colors = TextFieldDefaults.textFieldColors(
//            backgroundColor = Color.Magenta
//        ),
//    )
//}


//@Composable
//fun TextField() {
//    Box(
//        contentAlignment = Alignment.Center,
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White)
//    ) {
//
//        var textFieldState by remember { mutableStateOf("") }
//        val myColor = Color.Blue
//        TextField(
//            value = textFieldState,
//            onValueChange = { textFieldState = it },
//            label = { Text(text = "Enter the duration in seconds") },
//            colors = TextFieldDefaults.textFieldColors(
//                unfocusedLabelColor = myColor,
//                focusedLabelColor = myColor,
//                backgroundColor = myColor.copy(
//                    TextFieldDefaults.BackgroundOpacity
//                ),
//                focusedIndicatorColor = myColor,
//                unfocusedIndicatorColor = myColor.copy(
//                    TextFieldDefaults.UnfocusedIndicatorLineOpacity
//                ),
//                cursorColor = myColor,
//                textColor = myColor
//            ),
//            shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp),
//        )
//
//    }
//
//}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    TextField()
//
//}
