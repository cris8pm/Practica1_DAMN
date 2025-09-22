package com.cpm.practica1.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cpm.practica1.ui.theme.Practica1Theme

class ListasActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practica1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ListasScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListasScreen() {
    val items = listOf(
        "Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4", "Elemento 5",
        "Elemento 6", "Elemento 7", "Elemento 8", "Elemento 9", "Elemento 10",
        "Elemento 11", "Elemento 12", "Elemento 13", "Elemento 14", "Elemento 15"
    )

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Listas (LazyColumn)") })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "📝 Título: Listas (LazyColumn)",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "💡 Explicación: Las listas (LazyColumn en Compose) permiten mostrar grandes cantidades de datos de manera eficiente, renderizando solo los elementos visibles en pantalla.",
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "⚡ Demostración Interactiva:",
                style = MaterialTheme.typography.titleMedium
            )

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(items) { item ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                    ) {
                        Text(
                            text = item,
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListasScreenPreview() {
    Practica1Theme {
        ListasScreen()
    }
}