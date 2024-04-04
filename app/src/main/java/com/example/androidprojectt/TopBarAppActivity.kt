package com.example.androidprojectt

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
//import androidx.camera.core.Camera
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidprojectt.ui.theme.AndroidProjectTTheme
//import kotlinx.coroutines.flow.internal.NoOpContinuation.context
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class TopBarAppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TopBar()


                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(){

    val context = LocalContext.current.applicationContext
    TopAppBar(title = {Text(text = "WhatsApp")},
        navigationIcon ={
            IconButton(onClick = { /*TODO*/ }) {
               Icon(imageVector = Icons.Filled.Home, contentDescription ="Home", tint = Color.Blue )
                
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Cyan ,
            titleContentColor = Color.Black ,
            navigationIconContentColor = Color.White
        ),
        actions = {
            IconButton(onClick = {Toast.makeText(context,"You have clicked the search icon",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Share, contentDescription = "Menu", tint = Color.DarkGray)
            }
            IconButton(onClick = {Toast.makeText(context,"You can share using",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Share, contentDescription = "Share")
            }
            IconButton(onClick = {Toast.makeText(context,"Choose from the given options",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Search")
            }
        }

    )

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TopBarPreview(){
    TopBar()
}
