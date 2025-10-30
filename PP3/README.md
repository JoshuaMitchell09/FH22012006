# 🚀 PP3: Implementación de Lista Circular Doblemente Enlazada

## 👤 Información del Estudiante

| Campo | Valor |
| :--- | :--- |
| **Nombre Completo** | [Joshua Mitchell] |
| **Carné** | [FH22012006] |
| **Editor/IDE Utilizado** | Visual Studio Code (VS Code) |
| **Plataforma de Ejecución** | Java Development Kit (JDK) 17+ |

---

## 🛠️ Recursos y Archivos

El proyecto consta de los siguientes archivos:

* `ListDoublyCircular.java`: Contiene la implementación de la estructura de datos, incluyendo los métodos `addFirst`, `addLast`, `removeFirst` y `removeLast`.
* `ListInterface.java`: Define la interfaz que debe cumplir la lista.
* `NodeDoubly.java`: Define la clase del nodo para el encadenamiento doble.

**Nota sobre la restricción de impresión:** La lógica de los métodos implementados (`addFirst`, `addLast`, `removeFirst`, `removeLast`) no contiene ninguna instrucción `System.out.print` o `try/catch`, cumpliendo con las especificaciones. La salida de consola es generada exclusivamente por los métodos de prueba (`main`, `printList`, `printListInReverse`).

### Asistencia de Desarrollo

Este trabajo fue desarrollado con la asistencia de un modelo de lenguaje (Gemini), utilizado principalmente para:

* Revisar la lógica de punteros (`head`, `tail`, `next`, `prev`) y asegurar que los casos de borde (lista vacía, un solo elemento) fueran manejados correctamente.
* Confirmar el cumplimiento de las restricciones técnicas de la tarea (no usar `System.out.print` ni `try/catch`).
* Generar la documentación `README.md` y las justificaciones teóricas.

---

## ❓ Preguntas de Análisis

### 1. Si tuviera que implementar una estructura tipo Cola (Queue) y una estructura tipo Pila (Stack), ¿qué tipo de lista utilizaría en cada caso y por qué?

#### A. Estructura tipo Cola (Queue - **FIFO** - *First-In, First-Out*)

Para una Cola, utilizaría una **Lista Doblemente Enlazada (o Circular Doblemente Enlazada)**.

* **Operaciones requeridas:**
    * **Adición (`enqueue`):** Al final de la lista.
    * **Eliminación (`dequeue`):** Al inicio de la lista.
* **Justificación:** Al tener referencias directas tanto a la **cabeza (`head`)** como a la **cola (`tail`)**, las listas doblemente enlazadas permiten realizar ambas operaciones (`addLast` y `removeFirst`) en **tiempo constante, $O(1)$**, lo cual es la máxima eficiencia posible para una Cola.

#### B. Estructura tipo Pila (Stack - **LIFO** - *Last-In, First-Out*)

Para una Pila, utilizaría una **Lista Simplemente Enlazada**.

* **Operaciones requeridas:**
    * **Adición (`push`):** Al inicio de la lista.
    * **Eliminación (`pop`):** Al inicio de la lista.
* **Justificación:** Dado que todas las operaciones se realizan exclusivamente en el mismo extremo (la cabeza), una lista simplemente enlazada es suficiente. Proporciona una implementación más ligera y eficiente en memoria que una lista doble o circular, manteniendo la eficiencia en **tiempo constante, $O(1)$**, para ambas operaciones.

### 2. ¿Cuál cree que podría ser una ventaja y una desventaja de utilizar una estructura de tipo lista creada por usted mismo, en vez de las opciones proveídas directamente por los módulos estándar de Java (como `java.util.List` o `java.util.LinkedList`)?

| Aspecto | Ventaja de la Implementación Propia | Desventaja de la Implementación Propia |
| :--- | :--- | :--- |
| **Personalización y Diseño** | **Control Total:** Permite diseñar la estructura para un caso de uso *muy* específico (como la lista circular doble) sin la sobrecarga de métodos genéricos, optimizando el rendimiento y el uso de memoria para ese nicho. | **Mayor Tarea de Mantenimiento:** El desarrollador es el único responsable de asegurar la robustez, el manejo de errores y la corrección de todos los casos de borde, lo que aumenta el tiempo de desarrollo y la probabilidad de *bugs*. |
| **Robustez y Rendimiento** | Se pueden implementar *micro-optimizaciones* para escenarios de uso específicos que pueden ser ligeramente más rápidos que una solución genérica de Java. | **Falta de Pruebas y Madurez:** Las colecciones estándar de Java (`LinkedList`, `ArrayList`) están exhaustivamente probadas, optimizadas y depuradas por miles de desarrolladores, ofreciendo una garantía de **robustez** que es casi imposible de replicar en un proyecto individual. |
