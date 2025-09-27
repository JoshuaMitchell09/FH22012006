# PP1 — Inverso


**Alumno:** _Joshua Mitchell Navarro_


**Carné:** _FH22012006_


---
## Descripción

Programa en Java que solicita al usuario un número natural (>= 0) por consola y muestra el número original y su inverso. El algoritmo para invertir el número está implementado de forma recursiva, usando cociente y residuo.


Preguntas del ejercicio respondidas:

1. ¿Es posible implementar una solución equivalente pero de comportamiento iterativo?
Sí, se puede implementar de forma iterativa utilizando un bucle while que vaya extrayendo dígitos con el operador % y acumulándolos en el resultado. Sin embargo, el ejercicio pide explícitamente el enfoque recursivo.
2. ¿Cree que hay alguna otra manera recursiva de generar el mismo resultado?
Sí, por ejemplo, calculando primero la cantidad de dígitos y luego construyendo el inverso multiplicando cada dígito por potencias de 10 en orden inverso.
3. ¿Qué relación observa entre el algoritmo para invertir un número natural y las estrategias para pasar de una base numérica a otra?
Ambos algoritmos utilizan cocientes y residuos de divisiones sucesivas. Al convertir bases, se toman residuos que representan los "dígitos" en la nueva base. Al invertir, se aprovecha el mismo mecanismo para reordenar los dígitos del número original.

📚 Bibliografía 

Cormen, T. H., Leiserson, C. E., Rivest, R. L., & Stein, C. (2022). Introduction to Algorithms (4th ed.). MIT Press.
➝ Explica técnicas de diseño de algoritmos, incluyendo enfoques recursivos e iterativos.

Deitel, P. J., & Deitel, H. M. (2017). Java: How to Program (11th ed.). Pearson.
➝ Presenta ejemplos de programación en Java con estructuras de control como bucles y recursión.

Knuth, D. E. (1997). The Art of Computer Programming, Volume 1: Fundamental Algorithms (3rd ed.). Addison-Wesley.
➝ Analiza algoritmos clásicos de manipulación de números y operaciones con sistemas numéricos.

Weiss, M. A. (2014). Data Structures and Algorithm Analysis in Java (3rd ed.). Pearson.
➝ Trata en detalle algoritmos iterativos y recursivos aplicados a problemas de manipulación numérica.
