package com.cpm.practica1.ui.activities

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cpm.practica1.R
import com.cpm.practica1.ui.theme.Practica1Theme

class BotonesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practica1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BotonesScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BotonesScreen() {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Botones (Button, ImageButton)") })
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
                text = "📝 Título: Botones",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "💡 Explicación: Los botones permiten a los usuarios realizar acciones. Hay varios tipos, como botones de texto, con icono, o solo iconos.",
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "⚡ Demostración Interactiva:",
                style = MaterialTheme.typography.titleMedium
            )

            // Ejemplo 1: Botón de texto simple
            Button(onClick = { Toast.makeText(context, "Botón simple presionado", Toast.LENGTH_SHORT).show() }) {
                Text("Hacer algo")
            }

            // Ejemplo 2: Outlined Button
            OutlinedButton(onClick = { Toast.makeText(context, "Botón Outline presionado", Toast.LENGTH_SHORT).show() }) {
                Text("Guardar cambios")
            }

            // Ejemplo 3: Text Button
            TextButton(onClick = { Toast.makeText(context, "Botón de Texto presionado", Toast.LENGTH_SHORT).show() }) {
                Text("Cancelar")
            }

            // Ejemplo 4: Floating Action Button (FAB)
            FloatingActionButton(onClick = { Toast.makeText(context, "FAB presionado", Toast.LENGTH_SHORT).show() }) {
                Icon(Icons.Filled.Add, "Floating action button.")
            }

            // Ejemplo 5: Icon Button (similar a ImageButton)
            IconButton(onClick = { Toast.makeText(context, "Icono de ajustes presionado", Toast.LENGTH_SHORT).show() }) {
                Icon(
                    painter = painterResource(id = android.R.drawable.ic_menu_preferences),
                    contentDescription = "Ajustes",
                    modifier = Modifier.size(48.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BotonesScreenPreview() {
    Practica1Theme {
        BotonesScreen()
    }
}