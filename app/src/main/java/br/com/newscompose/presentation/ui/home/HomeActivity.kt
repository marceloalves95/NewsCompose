package br.com.newscompose.presentation.ui.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.newscompose.presentation.theme.NewsComposeTheme

class HomeActivity : ComponentActivity() {

    private val layoutCompose by lazy { HomeActivityLayoutCompose() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsComposeTheme {
                layoutCompose.InitCompose()
            }
        }
    }
}

