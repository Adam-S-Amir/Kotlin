package com.toosmart.teens
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
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

class Calendar : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar)

        val webView: WebView = findViewById(R.id.webView)
        val url = "https://calendar.google.com/calendar/u/0/embed?src=henricotoosmart2start@gmail.com"
        webView.loadUrl(url)

        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.cacheMode = WebSettings.LOAD_DEFAULT // Use default cache mode
    }
}