package br.com.newscompose.presentation.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.newscompose.presentation.theme.NewsComposeTheme

/**
 * @author RubioAlves
 * Created 30/04/2022 at 13:52
 */

class HomeActivityLayoutCompose {

    @Composable
    fun InitCompose() = Screen()

    @Composable
    private fun Screen() {
        Scaffold(topBar = { Toolbar() }) {
            Content()
        }
    }

    @Composable
    private fun Toolbar() = TopAppBar(title = { Text(text = "News") })

    @Composable
    private fun Content() {
        Lists()
    }

    @Composable
    private fun Lists() {
        Card(shape = RoundedCornerShape(3.dp)) {
            Column {
                Text(
                    text = "Jetpack"
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Compose"
                )
            }
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun Preview() {
        NewsComposeTheme {
            InitCompose()
        }
    }
}
