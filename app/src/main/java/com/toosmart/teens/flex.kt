package com.toosmart.teens

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import android.os.Bundle
import android.util.Log
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

class flex : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flex)
        val button1 = findViewById<View>(R.id.page1_button1) as Button
        val button2 = findViewById<View>(R.id.page1_button2) as Button
        val button3 = findViewById<View>(R.id.page1_button3) as Button
        val button4 = findViewById<View>(R.id.page1_button4) as Button
        val button5 = findViewById<View>(R.id.page1_button5) as Button
        val button6 = findViewById<View>(R.id.page1_button6) as Button
        val button7 = findViewById<View>(R.id.page1_button7) as Button
        val button8 = findViewById<View>(R.id.page1_button8) as Button
        val button9 = findViewById<View>(R.id.page1_button9) as Button
        val button80 = findViewById<View>(R.id.fab1) as Button
        val button90 = findViewById<View>(R.id.fab2) as Button
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
        button7.setOnClickListener {
            val phoneNumber = "8048762785"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("sms:$phoneNumber")
            startActivity(intent)
        }
        button8.setOnClickListener {
//            val intent = Intent(this, Calendar::class.java)
//            startActivity(intent)
            val url = "https://calendar.google.com/calendar/u/0/embed?src=henricotoosmart2start@gmail.com"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
        button9.setOnClickListener {
            val url = "https://not2vape.org"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }

        button80.setOnClickListener {
            val url = "tel:988"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
        button90.setOnClickListener {
            val url = "https://988lifeline.org/chat/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }

    }
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        if (newConfig.uiMode and Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES) {
            setTheme(R.style.Theme_TooSmartTeens_Dark)
        } else {
            setTheme(R.style.Theme_TooSmartTeens)
        }
        recreate()
    }
}