package br.com.viewModelProject.meucontadordecliques

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import br.com.viewModelProject.meucontadordecliques.ui.theme.MeuContadorDeCliquesTheme
import br.com.viewModelProject.meucontadordecliques.views.MainView
import br.com.viewModelProject.meucontadordecliques.views.MainView
import br.com.viewModelProject.meucontadordecliques.views.MainViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: MainViewModel = MainViewModel()

        enableEdgetoEdge()
        setContent {
            MeuContadorDeCliquesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainView(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainView(modifier: Modifier){

}

fun enableEdgetoEdge() {
    // TODO: Implement this method
}

