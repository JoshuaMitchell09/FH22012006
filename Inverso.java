import java.util.Scanner;


/**
* Inverso.java
* Programa de consola que solicita un número natural (>= 0) al usuario
* y muestra el número original y su inverso, usando un algoritmo recursivo
* que utiliza cociente y residuo de la división.
*
* Compilar: javac Inverso.java
* Ejecutar: java Inverso
* Luego ingresar el número cuando la consola lo pida.
*/
public class Inverso {


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


System.out.print("Ingrese un numero natural: ");
int n = sc.nextInt();


if (n < 0) {
System.err.println("El numero debe ser un natural (>= 0).");
sc.close();
return;
}


int inv = invertir(n, 0);
System.out.println(n + " -> " + inv);


sc.close();
}


// Método recursivo con acumulador para invertir el número
public static int invertir(int n, int acum) {
if (n == 0) return acum;
return invertir(n / 10, acum * 10 + (n % 10));
}
}