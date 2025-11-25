📄 README – Caso Práctico #2 (Recuperación de Información Textual)
👤 Estudiante: Joshua Mitchell
📚 Curso: Lenguajes de Base de Datos – SC-504
🗂️ Proyecto: CP2 – Recuperación de Información Textual
🛠️ Lenguaje: Java
🔧 IDE sugerido: Visual Studio Code / IntelliJ / Terminal
📘 Descripción General

Este proyecto implementa un sistema de recuperación de información textual utilizando varias estructuras de datos desarrolladas manualmente en Java:

Cola (Queue) – lista enlazada simple

Pila (Stack) – lista enlazada simple

Árbol binario de búsqueda (Binary Search Tree)

Grafo dirigido (matriz de adyacencia)

El programa:

Lee un archivo input.txt con contenido en español.

Genera su versión limpia (clean.txt).

Construye un diccionario de palabras con sus índices (map.txt).

Calcula las frecuencias de término (TF) y las almacena en un árbol (tree.txt).

Genera una matriz de adyacencia de caracteres (matrix.csv).

Imprime únicamente cuántas palabras limpias fueron procesadas.

📂 Estructura del Proyecto
CP2/
├── Main.java
├── CustomQueue.java
├── CustomStack.java
├── CustomTree.java
├── CustomGraph.java
├── QueueNode.java
├── StackNode.java
├── TreeNode.java
└── (Archivos generados automáticamente)
    ├── clean.txt
    ├── map.txt
    ├── tree.txt
    └── matrix.csv


⚠️ Los archivos generados (txt/csv) NO deben subirse al repositorio final.

🧠 Funcionamiento del Programa
1. Limpieza del archivo (clean.txt)

El texto original se convierte en:

Minúsculas

Sin acentos

Sin signos de puntuación

En una sola línea contínua

2. Mapa de palabras (map.txt)

Se genera un mapa:

palabra → índice1 índice2 índice3 ...


Cada palabra apunta a una cola de índices.

3. Árbol binario de TF (tree.txt)

Cada nodo del árbol contiene:

TF (double)

Pila de palabras que tienen ese TF

Hijo izquierdo (menor TF)

Hijo derecho (mayor TF)

El resultado se imprime en orden ascendente (InOrder):

0.003337505214851898
 ↳ (4) [ muy tu fue casa ]

4. Matriz de adyacencia (matrix.csv)

Cada celda de la matriz representa cuántas veces un carácter aparece antes del otro:

[row][col] = cantidad de adyacencias

🛠️ Implementaciones Modificadas

Las únicas clases modificadas fueron:

CustomQueue.java

CustomStack.java

CustomTree.java

CustomGraph.java

Todas incluyen comentarios de origen:

// ChatGPT


Estas modificaciones fueron necesarias para:

✔ Implementar cola por lista enlazada
✔ Implementar pila por lista enlazada
✔ Insertar correctamente en árbol por TF
✔ Construir matriz de adyacencia
✔ Mantener estructuras limpias y estables

▶️ Cómo Compilar y Ejecutar

Abrir una terminal dentro de la carpeta CP2.

1. Compilar:
javac *.java

2. Ejecutar:
java Main


Salida esperada:

Length (words): 2397


Después de la ejecución se generan:

clean.txt

map.txt

tree.txt

matrix.csv

🧪 Validación

Los archivos generados se validaron con:

Conteo correcto de palabras (2397)

Palabras limpias sin acentos ni saltos

Índices en orden ascendente

TF correctos y ordenados

Árbol completo en orden InOrder

Matriz generada correctamente

📌 Restricciones cumplidas

✔ No se agregaron métodos nuevos
✔ No se modificaron firmas ni tipos de retorno
✔ No se modificaron las clases Node ni Main.java
✔ No se usó try/catch
✔ No se imprimió nada extra en consola
✔ Implementación 100% manual

📚 Referencias / Créditos

ChatGPT (OpenAI) – asistencia en implementación y debugging

Documentación oficial de Java

Apuntes del curso SC-504

Estructuras de Datos – Árboles, Colas y Pilas
