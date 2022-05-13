package com.makza.draganddrop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.makza.draganddrop.ui.theme.DragAndDropTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DragAndDropTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(
                                        text = "Drag and Drop Ui Element",
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }
                            )
                        }
                    ) {

                    }
                }
            }
        }
    }
}


@Composable
fun FoodItemCard(
    foodItem: FoodItem
){
    Card(
        elevation = 10.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(24.dp),
        modifier = Modifier.padding(8.dp)
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)
        ) {
            DragTarget(
                modifier = Modifier.size(130.dp),
                dataToDrop = foodItem
            ) {
                Image(
                    painter = painterResource(id = foodItem.image),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(130.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))
                Column(modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = foodItem.name,
                        fontSize = 22.sp,
                        color = Color.DarkGray
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "$${foodItem.price}",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            }
        }
    }
}
