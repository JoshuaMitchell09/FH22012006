import java.util.Scanner;


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