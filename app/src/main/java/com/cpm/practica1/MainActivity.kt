package com.cpm.practica1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.RadioButtonChecked
import androidx.compose.material.icons.filled.TextFields
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cpm.practica1.data.MenuItem
import com.cpm.practica1.ui.activities.*
import com.cpm.practica1.ui.theme.Practica1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practica1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainMenuScreen(onMenuItemClick = { destinationActivity ->
                        startActivity(Intent(this, destinationActivity))
                    })
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainMenuScreen(onMenuItemClick: (Class<*>) -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Práctica 1 - Funcionamiento de Entornos Moviles") })
        }
    ) { paddingValues ->
        val menuItems = listOf(
            MenuItem(
                "TextFields",
                "Campos de texto para entrada de usuario.",
                Icons.Default.TextFields,
                TextFieldsActivity::class.java
            ),
            MenuItem(
                "Botones",
                "Elementos interactivos para acciones del usuario.",
                Icons.Default.RadioButtonChecked,
                BotonesActivity::class.java
            ),
            MenuItem(
                "Elementos de Selección",
                "Checkboxes, RadioButtons y Switches.",
                Icons.Default.List,
                ElementosSeleccionActivity::class.java
            ),
            MenuItem(
                "Listas",
                "Visualización de colecciones de datos.",
                Icons.Default.List,
                ListasActivity::class.java
            ),
            MenuItem(
                "Elementos de Información",
                "Textos, imágenes y barras de progreso.",
                Icons.Default.Info,
                ElementosInformacionActivity::class.java
            )
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(menuItems) { item ->
                MenuItemCard(item = item) {
                    onMenuItemClick(item.destinationActivity)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuItemCard(item: MenuItem, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                imageVector = item.icon,
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = item.title, style = MaterialTheme.typography.headlineSmall)
                Text(text = item.description, style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Practica1Theme {
        MainMenuScreen(onMenuItemClick = {})
    }
}