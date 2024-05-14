package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeImage(
                        stringResource(R.string.heading),
                        stringResource(R.string.para1),
                        stringResource(R.string.para2)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeText(heading: String , para1: String  , para2: String , modifier: Modifier = Modifier) {
    Column {
        Text(
            text = heading,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = para1,
            textAlign = TextAlign.Justify,
            lineHeight = 22.sp,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                )
        )
        Text(
            text = para2,
            lineHeight = 22.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }

}

@Composable
fun ComposeImage(heading: String , para1: String  , para2: String , modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column(modifier){
        Image(
            painter = image,
            contentDescription = null,
        )
        ComposeText(
            heading = heading,
            para1 = para1,
            para2 = para2,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTutorialTheme {
        ComposeImage(
            stringResource(R.string.heading),
            stringResource(R.string.para1),
            stringResource(R.string.para2)
        )
    }
}