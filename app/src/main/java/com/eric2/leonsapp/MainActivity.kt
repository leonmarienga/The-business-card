package com.eric2.leonsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eric2.leonsapp.ui.theme.LeonsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LeonsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}
@Composable
fun finalView(){
    Column() {
        firstText("The chairman", "Leon marie")
        secondText("0708332509", "leonmarienga@gmail.com", "leommari@linkedin.com")
    }

}

@Composable
fun firstText(title:String, name:String){
    Column() {
        mainImage()
        Text(text = title)
        Text(text = name)
    }

}
@Composable
fun secondText(one:String, two:String, three:String){
    Column() {
        Row() {
            firstImage()
            Text(text = one)
        }
        Row() {
            secondImage()
            Text(text = two)
        }
        Row() {
            thirdImage()
            Text(text = three)
        }
    }

}

@Composable
fun mainImage(){
    val image = painterResource(R.drawable.leons_imange)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.height(50.dp)
    )
}

@Composable
fun firstImage(){
    val image = painterResource(R.drawable._55705)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.height(20.dp)
    )
}

@Composable
fun secondImage(){
    val image = painterResource(R.drawable._61188)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.height(20.dp)
    )
}

@Composable
fun thirdImage(){
    val image = painterResource(R.drawable.png_transparent_computer_icons_linkedin_resume_curriculum_vitae_social_media_social_media_template_text_rectangle)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.height(20.dp)
    )
}

@Composable
@Preview
fun theView(){
    finalView()
}
