package com.example.pamact2

import android.graphics.drawable.shapes.OvalShape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pamact2.ui.theme.PAMact2Theme
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMact2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Logo Universitas
        Image(
            painter = painterResource(id = R.drawable.universitaslogo),
            contentDescription = "Logo Universitas",
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Text untuk Login
        Text(
            text = "Login",
            style = TextStyle(
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        )

        // Deskripsi halaman
        Text(
            text = "Ini adalah halaman login",
            style = TextStyle(
                fontSize = 16.sp,
                color = Color.Gray
            )
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Nama dan NIM
        Text(
            text = "Nama",
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.Black
            )
        )

        Text(
            text = "Muhammad Zharfan",
            style = TextStyle(
                fontSize = 24.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold
            )
        )

        Text(
            text = "20220140079",
            style = TextStyle(
                fontSize = 24.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Gambar profil mahasiswa
        Image(
            painter = painterResource(id = R.drawable.profileimage),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(200.dp)
                .padding(16.dp)
                .clip(CircleShape)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen() {
    PAMact2Theme {
        LoginScreen()
    }
}
