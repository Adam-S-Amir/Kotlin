package com.toosmart.teens

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.toosmart.teens.ui.theme.TooSmartTeensTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<View>(R.id.page1_button1) as Button
        val button2 = findViewById<View>(R.id.page1_button2) as Button
        val button3 = findViewById<View>(R.id.page1_button3) as Button
        val button4 = findViewById<View>(R.id.page1_button4) as Button
        val button5 = findViewById<View>(R.id.page1_button5) as Button
        val button6 = findViewById<View>(R.id.page1_button6) as Button
        button1.setOnClickListener {
            val url = "https://henricoprevention.org/youth-leadership/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
        button2.setOnClickListener {
            val url = "https://henricoprevention.org/resources/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
        button3.setOnClickListener {
            val url = "https://henricoprevention.org/service-partners/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
        button4.setOnClickListener {
            val url = "https://www.instagram.com/henricotoosmart/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
        button5.setOnClickListener {
            val url = "https://www.youtube.com/channel/UCPoL8cFoxCdPlZFsa8YoLlQ"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
        button6.setOnClickListener {
            val url = ""
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
    }
}