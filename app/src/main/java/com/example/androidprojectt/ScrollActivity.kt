package com.example.androidprojectt

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight


import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.androidprojectt.ui.theme.AndroidProjectTTheme
import java.nio.file.WatchEvent

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val employees = listOf("Trevor","Fidel","Larry","Lincon","Allan","Anto","Cecilia","Tasha","Antonio","Marline","Andrew","Beatrice","Danstun","Reilly","Randy")
//                    ListScreen(modifier = Modifier, employees)
                    val cars = listOf("Lexus","Harrier","Forester","Exiga","Landcruiser","Volkswagen","Premio","Avensis","Fielder","Impreza","Outback","Ferari","Discovery","Evoque","Crown")
                    ListScreen(modifier = Modifier, employees,cars)

                }
            }
        }
    }
}
@Composable
fun ListScreen(modifier: Modifier,employees:List<String>,cars:List<String>){
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.background2) ,
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())

    }
    Column (modifier = Modifier.fillMaxSize()){
        LazyRow (contentPadding = PaddingValues(10.dp)){
            items(items = employees){
                item->
                RowCard(modifier = Modifier, name = item)
            }
        }
        LazyColumn(contentPadding = PaddingValues(10.dp)){
            items(items = cars) {
                item ->
                ColumnCard(modifier = Modifier, name = item)
            }
        }

    }

}
//@Preview
//@Composable
//fun ListScreenPreview(){
//    ListScreen(modifier = Modifier , employees)
//}
@Composable
fun RowCard(modifier: Modifier,name:String){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(100.dp)
            .aspectRatio(1.5f),
        colors = CardDefaults.cardColors(
                 containerColor = Color.White),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(modifier = Modifier
            .padding(10.dp)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Text(text = name, fontSize = 30.sp, fontWeight = FontWeight.Bold,)
        }

    }
}
@Composable
fun ColumnCard(modifier: Modifier,name: String){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight()
            .aspectRatio(1.5f),
        colors = CardDefaults.cardColors(
            containerColor = Color.Cyan),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(modifier = Modifier
            .padding(10.dp)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Text(text = name, fontSize = 30.sp, fontWeight = FontWeight.Bold,)
        }

    }

}