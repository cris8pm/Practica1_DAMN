# Practica1 - Explorando Componentes UI con Jetpack Compose

![Android-Kotlin-Compose](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpack-compose&logoColor=white)
![Android Studio](https://img.shields.io/badge/IDE-Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)

## 🚀 Descripción del Proyecto

`Practica1` es una aplicación Android desarrollada con **Jetpack Compose** y **Kotlin** cuyo objetivo principal es demostrar y explicar el uso de los componentes de interfaz de usuario más comunes. La aplicación sirve como un recurso educativo interactivo, permitiendo a los usuarios explorar, comprender y probar elementos UI fundamentales en un entorno práctico.

Cada sección de la aplicación está dedicada a un tipo específico de componente, ofreciendo una explicación concisa, ejemplos visuales y una demostración interactiva.

## ✨ Características Principales

*   **Menú de Navegación Intuitivo:** Una `MainActivity` principal con un diseño moderno que permite navegar fácilmente entre los diferentes módulos.
*   **5 Módulos Dedicados:**
    *   **TextFields (EditText):** Ejemplos de campos de texto para la entrada de usuario, incluyendo diferentes tipos de teclado y transformaciones.
    *   **Botones (Button, ImageButton):** Demostración de varios tipos de botones interactivos y cómo manejar sus acciones.
    *   **Elementos de Selección (CheckBox, RadioButton, Switch):** Práctica con elementos para selecciones simples y múltiples.
    *   **Listas (LazyColumn/RecyclerView):** Implementación de listas eficientes para mostrar colecciones de datos.
    *   **Elementos de Información (TextView, ImageView, ProgressBar):** Uso de componentes para mostrar texto, imágenes y el progreso de tareas.
*   **Demostraciones Interactivas:** Cada módulo incluye ejemplos prácticos donde el usuario puede interactuar directamente con los componentes.
*   **Explicaciones Claras:** Breves descripciones sobre la función y el uso de cada elemento UI.
*   **Jetpack Compose:** Desarrollado completamente con el toolkit UI moderno de Android para una experiencia de desarrollo declarativa.

Ya que el objetivo es navegar ahora entre diferentes activities tenemos que agregarlas en el Android Manifest como en la siguiente imagen:

<img width="776" height="187" alt="image" src="https://github.com/user-attachments/assets/5d8ee09e-940d-4c1a-9925-11deccb4a758" />




La estructura del proyecto para dichas activities es la siguiente: 

<img width="407" height="329" alt="image" src="https://github.com/user-attachments/assets/e4151a43-3bba-4512-9490-17e64a19dc17" />


## 📱 Vistas Preeliminares

A continuación, se muestran las vistas de la aplicación.

Menú principal
<img width="360" height="800" alt="image" src="https://github.com/user-attachments/assets/4213a17c-1506-4fb9-8928-1aaa3a1f2e0f" />



Activity secundaria de Text Fields
<img width="360" height="800" alt="image" src="https://github.com/user-attachments/assets/ad5f3ab7-50d2-483f-99bc-a1f373fa454d" />
<img width="360" height="800" alt="image" src="https://github.com/user-attachments/assets/b5c988d8-aeed-4973-9a5c-af4cff894e4d" />
<img width="360" height="800" alt="image" src="https://github.com/user-attachments/assets/ea1bbee0-b6af-496e-882a-0d08117c7bbc" />



Activity de Botones
<img width="360" height="800" alt="image" src="https://github.com/user-attachments/assets/3a9e9ab1-2b8c-4892-91c2-f01fb0321b83" />



Activity de Selección
<img width="360" height="800" alt="image" src="https://github.com/user-attachments/assets/c894294c-6cfc-44a2-b36f-e7aa79a3934e" />



Activity de Listas
<img width="360" height="800" alt="image" src="https://github.com/user-attachments/assets/c031aa55-3954-4d19-bad0-7e78e7900ccb" />



Activity de Información
<img width="360" height="800" alt="image" src="https://github.com/user-attachments/assets/423b8acc-470e-4d56-9217-7ea14014156a" />






## 🛠️ Tecnologías Utilizadas

*   **Lenguaje:** Kotlin
*   **Framework UI:** Jetpack Compose
*   **IDE:** Android Studio
*   **Sistema de construcción:** Gradle
*   **Versión Android SDK:** Mínimo API 24 (Android 7.0 Nougat)

## ⚙️ Cómo Ejecutar el Proyecto

Para clonar y ejecutar este proyecto localmente, sigue estos pasos:

1.  **Clona el repositorio:**
    ```bash
    git clone https://github.com/tu-usuario/Practica1.git
    cd Practica1
    ```
2.  **Abre el proyecto en Android Studio:**
    *   Abre Android Studio.
    *   Selecciona `File > Open` y navega hasta la carpeta `Practica1` que acabas de clonar.
    *   Espera a que Gradle sincronice el proyecto.
3.  **Ejecuta la aplicación:**
    *   Conecta un dispositivo Android físico o inicia un emulador.
    *   Haz clic en el botón `Run` (el triángulo verde) en la barra de herramientas de Android Studio.
