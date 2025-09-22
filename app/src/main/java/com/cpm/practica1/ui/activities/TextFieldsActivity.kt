package com.cpm.practica1.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cpm.practica1.ui.theme.Practica1Theme

class TextFieldsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practica1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TextFieldsScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("TextFields (EditText)") })
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
                text = "📝 Título: Campos de Texto (TextFields)",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "💡 Explicación: Los TextFields permiten a los usuarios introducir y editar texto. Son fundamentales para formularios, búsquedas y cualquier interacción que requiera entrada de datos.",
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "⚡ Demostración Interactiva:",
                style = MaterialTheme.typography.titleMedium
            )

            // Ejemplo 1: TextField Básico
            var textState by remember { mutableStateOf("") }
            OutlinedTextField(
                value = textState,
                onValueChange = { textState = it },
                label = { Text("Nombre de usuario") },
                modifier = Modifier.fillMaxWidth()
            )
            Text("Texto actual: $textState")

            // Ejemplo 2: TextField con Icono y teclado numérico
            var numberState by remember { mutableStateOf("") }
            TextField(
                value = numberState,
                onValueChange = { if (it.length <= 10) numberState = it }, // Limitar a 10 caracteres
                label = { Text("Número de teléfono") },
                leadingIcon = { Icon(Icons.Default.Email, contentDescription = "Email icon") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxWidth()
            )
            Text("Número ingresado: $numberState")

            // Ejemplo 3: Password TextField
            var passwordState by remember { mutableStateOf("") }
            OutlinedTextField(
                value = passwordState,
                onValueChange = { passwordState = it },
                label = { Text("Contraseña") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                modifier = Modifier.fillMaxWidth()
            )
            Text("Contraseña (oculta): ${"*".repeat(passwordState.length)}")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TextFieldsScreenPreview() {
    Practica1Theme {
        TextFieldsScreen()
    }
}