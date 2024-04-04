package com.example.androidprojectt

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojectt.ui.theme.AndroidProjectTTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(modifier = (Modifier
                        .clip(shape = RoundedCornerShape(20.dp))
                        .border(width = 2.dp, color = Color.Black))) {
//        HelloClient("Fidel")
//        SecondLine()
//        ThirdLine()
                        TextComponent(value = "Welcome Back",
                            22.sp,
                            Color.Black,
                            FontFamily.Monospace,
                            FontWeight.Bold,
                            TextAlign.Center)
                        TextComponent(value = "Login Here",
                            22.sp,
                            Color.DarkGray,
                            FontFamily.Cursive,
                            FontWeight.Bold,
                            TextAlign.Center)
                        ImageComponent()
//                        Spacer(modifier = Modifier.height(40.dp))
//                        TextFieldComponent("Enter your Name")
                        Spacer(modifier = Modifier.height(20.dp))
                        TextFieldComponent("Enter your Email")
                        Spacer(modifier = Modifier.height(20.dp))
//                        TextFieldComponent("Enter your Location")
//                        Spacer(modifier = Modifier.height(40.dp))
                        TextFieldComponent("Enter your Password")
                        Spacer(modifier = Modifier.height(30.dp))
                        CheckboxComponent(value ="I have read and agreed on the company policies and regulations")
                        Button(onClick = {
                                         val intent = Intent(this@LoginActivity,MainActivity::class.java)
                         startActivity(intent)},
                            colors = ButtonDefaults.buttonColors(Color.Blue),
                            modifier = Modifier.fillMaxWidth()) {
                            Text( modifier = Modifier.padding(10.dp),
                                text = "REGISTER HERE")
                        }
                        Spacer(modifier = Modifier.height(15.dp))
                        Button(onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            modifier= Modifier.fillMaxWidth()) {
                            Text( modifier = Modifier.padding(10.dp),
                                text = "LOGIN HERE")
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Button(onClick = {
                                         val intent = Intent(this@LoginActivity,CardActivity::class.java)
                            startActivity(intent)
                        },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            modifier= Modifier.fillMaxWidth()) {
                            Text( modifier = Modifier.padding(10.dp),
                                text = "CARDS")
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Button(
                            onClick = {
                                val intent =
                                    Intent(this@LoginActivity, Indicators::class.java)
                                startActivity(intent)
                            },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                modifier = Modifier.padding(15.dp),
                                text = "INDICATOR"
                            )
                        }

                    }
                }
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview(){
    Column(modifier = (Modifier
        .clip(shape = RoundedCornerShape(20.dp))
        .border(width = 2.dp, color = Color.Black))) {
//        HelloClient("Fidel")
//        SecondLine()
//        ThirdLine()
        TextComponent(value = "Welcome Back",
            22.sp,
            Color.Black,
            FontFamily.Monospace,
            FontWeight.Bold,
            TextAlign.Center)
        TextComponent(value = "Login here",
            22.sp,
            Color.DarkGray,
            FontFamily.Cursive,
            FontWeight.Bold,
            TextAlign.Center)
        ImageComponent()
        Spacer(modifier = Modifier.height(20.dp))
//        TextFieldComponent("Enter your Name")
//        Spacer(modifier = Modifier.height(40.dp))
        TextFieldComponent("Enter your Email")
        Spacer(modifier = Modifier.height(30.dp))
//        TextFieldComponent("Enter your Location")
//        Spacer(modifier = Modifier.height(40.dp))
        TextFieldComponent("Enter your Password")
        Spacer(modifier = Modifier.height(40.dp))
        CheckboxComponent(value ="I have read and agreed on the company policies and regulations")
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.fillMaxWidth()) {
            Text( modifier = Modifier.padding(15.dp),
                text = "REGISTER HERE")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Green),
            modifier= Modifier.fillMaxWidth()) {
            Text( modifier = Modifier.padding(15.dp),
                text = "LOGIN HERE")
        }

    }
}
@Composable
fun ImageComponent(){
    Image(modifier = Modifier
        .wrapContentHeight()
        .fillMaxWidth()
        .height(200.dp),
        painter = painterResource(id = R.drawable.index) ,
         contentDescription = "logo image" )
}
@Composable
fun TextComponent(
    value: String,
    size: TextUnit,
    colorValue: Color,
    fontFamilyValue: FontFamily,
    fontWeightValue: FontWeight,
    textAlignValue: TextAlign,

    ) {
    Text(
        modifier = Modifier
            .background(Color.Cyan)
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentWidth(),
        text = value,
        fontSize = size,
        color = colorValue,
        fontFamily = fontFamilyValue,
        fontWeight = fontWeightValue,
        textAlign = textAlignValue


    )

}

@Composable
fun TextFieldComponent(mylabel: String) {
    var text by remember { mutableStateOf(value = "") }
    TextField(modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = { newText -> text = newText },
        label = { TextFieldLabels(value = mylabel) })
}

@Composable
fun TextFieldLabels(value: String) {
    Text(text = value)
}

@Composable
fun CheckboxComponent(value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(56.dp)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val checkedState = remember {
            mutableStateOf(value = false)
        }
        Checkbox(checked = checkedState.value, onCheckedChange = {

        })
        TextFieldLabels(value = value)
    }
}

