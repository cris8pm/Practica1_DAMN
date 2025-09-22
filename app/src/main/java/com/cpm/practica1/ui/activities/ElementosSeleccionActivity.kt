package com.cpm.practica1.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cpm.practica1.ui.theme.Practica1Theme
import androidx.compose.foundation.clickable


class ElementosSeleccionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practica1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ElementosSeleccionScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ElementosSeleccionScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Elementos de Selección") })
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
                text = "📝 Título: Elementos de Selección",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "💡 Explicación: Estos elementos permiten al usuario elegir opciones. Los CheckBoxes para múltiples selecciones, RadioButtons para una única opción, y Switches para estados binarios (activar/desactivar).",
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "⚡ Demostración Interactiva:",
                style = MaterialTheme.typography.titleMedium
            )

            // Ejemplo 1: CheckBox
            var checkBoxState by remember { mutableStateOf(false) }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = checkBoxState,
                    onCheckedChange = { checkBoxState = it }
                )
                Text("Aceptar términos y condiciones")
            }
            Text("Checkbox: ${if (checkBoxState) "Activado" else "Desactivado"}")

            // Ejemplo 2: RadioButtons
            val radioOptions = listOf("Opción 1", "Opción 2", "Opción 3")
            var selectedOption by remember { mutableStateOf(radioOptions[0]) }

            Column {
                Text("Selecciona una opción:")
                radioOptions.forEach { text ->
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .clickable { selectedOption = text }
                            .padding(vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = (text == selectedOption),
                            onClick = { selectedOption = text }
                        )
                        Text(
                            text = text,
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    }
                }
            }
            Text("Opción seleccionada: $selectedOption")

            // Ejemplo 3: Switch
            var switchState by remember { mutableStateOf(true) }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Switch(
                    checked = switchState,
                    onCheckedChange = { switchState = it }
                )
                Text("Modo oscuro")
            }
            Text("Switch: ${if (switchState) "Activado" else "Desactivado"}")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ElementosSeleccionScreenPreview() {
    Practica1Theme {
        ElementosSeleccionScreen()
    }
}