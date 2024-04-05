package com.example.androidprojectt

import android.graphics.fonts.FontFamily
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojectt.ui.theme.AndroidProjectTTheme

class AssessmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Assessment()

                }
            }
        }
    }
}
@Composable
fun Assessment (){
    Box(modifier = Modifier.fillMaxSize() ){
        Image(painter = painterResource(id = R.drawable.farisi),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
        modifier = Modifier.matchParentSize())
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Wanderly", textAlign = TextAlign.Center, color = Color.White, fontSize = 40.sp)
            Text(text = "Yor Ultimate Companion for Seamless", textAlign = TextAlign.Center, color = Color.White, fontSize = 20.sp)
            Text(text = "Travel Experience", textAlign = TextAlign.Center, color = Color.White, fontSize = 20.sp)
            Spacer(modifier = Modifier.height(400.dp))
            Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Cyan),
                modifier = Modifier.fillMaxWidth()) {
                Text(text = "Sign in with Phone Number", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier.fillMaxWidth()) {
                Text(text = "Sign in with Apple", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Do you have an account? Sign Up", textAlign = TextAlign.Center, color = Color.Blue, fontSize = 20.sp)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "By creating an account or signing in,you agree to our Terms and Privacy Policy.", textAlign = TextAlign.Center, color = Color.Blue, fontSize = 20.sp)
        }

    }
}




@Preview(showSystemUi = true, showBackground = true)
@Composable
fun AssessmentPreview(){
    Assessment()
}
//@Composable
//fun TextComp(value:String,
//             size: TextUnit,
//colorValue: Color,
//             fontFamilyValues:FontFamily,
//             fontWeightValue: FontWeight,
//             textAlignValue: TextAlign){
//
//
//
//
//
//}