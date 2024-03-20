package com.example.androidprojectt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.androidprojectt.ui.theme.AndroidProjectTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    HelloClient("Fidel")
//                    SecondLine()
//                    ThirdLine()
                    Column {
                        TextComponent(value = "Good Afternoon Kimani",          22.sp,
                            Color.Green,
                            FontFamily.Monospace,
                            FontWeight.Bold,
                            TextAlign.Center)
                        TextComponent(value = "You have logged In",
                            20.sp,
                            Color.Cyan,
                            FontFamily.Cursive,
                            FontWeight.W200,
                            TextAlign.Center)
                        TextComponent(value = "We missed you",
                            22.sp,
                            Color.Magenta,
                            FontFamily.SansSerif,
                            FontWeight.W300,
                            TextAlign.Center)
                    }

                }
            }
        }
    }
}
@Composable
fun HelloClient(name: String){
//    Text(text = "Good afternoon $name")
    TextComponent(value = ("Good afternoon $name"),
        22.sp,
        Color.Green,
        FontFamily.Monospace,
        FontWeight.Bold,
        TextAlign.Center)
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HelloClientPreview(){
    Column {
//        HelloClient("Fidel")
//        SecondLine()
//        ThirdLine()
        TextComponent(value = "Good Afternoon Kimani",
            22.sp,
            Color.Green,
            FontFamily.Monospace,
            FontWeight.Bold,
            TextAlign.Center)
        TextComponent(value = "You have logged In",
            20.sp,
            Color.Cyan,
            FontFamily.Cursive,
            FontWeight.W200,
            TextAlign.Center)
        TextComponent(value = "We missed you",
            22.sp,
            Color.Magenta,
            FontFamily.SansSerif,
            FontWeight.W300,
            TextAlign.Center)
    }
}

@Composable
fun SecondLine(){
    Text(text = "Successfully logged In")
}
@Composable
fun ThirdLine(){
    Text(text = "Welcome back")
}
@Composable
fun TextComponent(value: String,
                  size:TextUnit,
                  colorValue: Color,
                  fontFamilyValue: FontFamily,
                  fontWeightValue: FontWeight,
                  textAlignValue: TextAlign,

                 ){
    Text(text = value,
        fontSize = size,
        color = colorValue,
        fontFamily = fontFamilyValue,
        fontWeight = fontWeightValue,
        textAlign = textAlignValue


    )

}