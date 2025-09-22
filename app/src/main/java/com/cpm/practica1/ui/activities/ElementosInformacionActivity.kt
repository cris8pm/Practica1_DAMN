package com.cpm.practica1.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cpm.practica1.R
import com.cpm.practica1.ui.theme.Practica1Theme

class ElementosInformacionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practica1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ElementosInformacionScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ElementosInformacionScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Elementos de Información") })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "📝 Título: Elementos de Información",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "💡 Explicación: Estos elementos se utilizan para mostrar información al usuario, como texto (TextView), imágenes (ImageView) o el progreso de una tarea (ProgressBar).",
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "⚡ Demostración Interactiva:",
                style = MaterialTheme.typography.titleMedium
            )

            // Ejemplo 1: TextView (en Compose es Text)
            Text(
                text = "Este es un ejemplo de texto informativo. Puedes cambiar su estilo, tamaño y color.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.fillMaxWidth()
            )

            // Ejemplo 2: ImageView (en Compose es Image)
            Image(
                painter = painterResource(id = android.R.drawable.ic_menu_gallery), // Ejemplo de icono
                contentDescription = "Imagen de ejemplo",
                modifier = Modifier
                    .size(150.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Fit
            )

            // Ejemplo 3: ProgressBar (Circular y Lineal)
            Text("Progreso de descarga:")
            // Linear Progress Bar
            LinearProgressIndicator(
                progress = 0.75f, // 75% de progreso
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            // Circular Progress Bar
            CircularProgressIndicator(
                modifier = Modifier.size(50.dp),
                strokeWidth = 4.dp
            )
            Text("Cargando...", style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ElementosInformacionScreenPreview() {
    Practica1Theme {
        ElementosInformacionScreen()
    }
}