import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

/**

 *
 * Autor: Joshua Mitchell
 * Versión: Java SE 21 (JDK 21)
 */

public class Revert {

    public static void main(String[] args) {
        // Archivos de entrada y salida
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Crear la pila de caracteres
        Stack<Character> pila = new Stack<>();

        // === Lectura del archivo y llenado de la pila ===
        try (FileReader lector = new FileReader(inputFile)) {
            int dato;
            while ((dato = lector.read()) != -1) {
                pila.push((char) dato); // Ingresar cada carácter en la pila
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo '" + inputFile + "': " + e.getMessage());
            return;
        }

        // === Vaciado de la pila y escritura en el archivo invertido ===
        try (FileWriter escritor = new FileWriter(outputFile)) {
            while (!pila.isEmpty()) {
                escritor.write(pila.pop()); // Escribir en orden inverso
            }
            System.out.println("✅ El contenido del archivo ha sido invertido correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo '" + outputFile + "': " + e.getMessage());
        }
    }
}
