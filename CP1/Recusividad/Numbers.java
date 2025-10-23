import java.util.Locale;
private static final String[] METALS = {
"Platinum", "Golden", "Silver", "Bronze", "Copper",
"Nickel", "Aluminum", "Iron", "Tin", "Lead"
};


// Fórmula directa: formula(z) = (z + sqrt(4 + z^2)) / 2
public static double formula(double z) {
return (z + Math.sqrt(4.0 + z * z)) / 2.0;
}


// Método público pedido por el enunciado: usa recursive(...) privado internamente
public static double recursiveRatio(int z) {
// ratio = f(z, 25) / f(z, 24)
double num = recursive(z, 25);
double den = recursive(z, 24);
return num / den;
}


// Método público para el iterativo
public static double iterativeRatio(int z) {
double num = iterative(z, 25);
double den = iterative(z, 24);
return num / den;
}


// ---------- Métodos privados (puedes editarlos según indicación) ----------


// Recursiva directa según la definición f(z, n)
private static double recursive(int z, int n) {
if (n == 0) return 1.0;
if (n == 1) return 1.0;
return z * recursive(z, n - 1) + recursive(z, n - 2);
}


// Iterativa equivalente
private static double iterative(int z, int n) {
if (n == 0) return 1.0;
if (n == 1) return 1.0;
double f0 = 1.0; // f(z,0)
double f1 = 1.0; // f(z,1)
double f = 1.0;
for (int i = 2; i <= n; i++) {
f = z * f1 + f0; // f(z,i) = z*f(z,i-1) + f(z,i-2)
f0 = f1;
f1 = f;
}
return f;
}


// Formatea a 10 decimales con punto decimal
private static String fmt(double v) {
return String.format(Locale.US, "%.10f", v);
}


// main (si ya tienes otro main en tu repo no modificar — este es para pruebas independientes)
public static void main(String[] args) {
for (int z = 0; z < METALS.length; z++) {
System.out.println("[" + z + "] " + METALS[z]);
System.out.println(" ↳ formula(" + z + ") ≈ " + fmt(formula(z)));
System.out.println(" ↳ recursive(" + z + ") ≈ " + fmt(recursiveRatio(z)));
System.out.println(" ↳ iterative(" + z + ") ≈ " + fmt(iterativeRatio(z)));
System.out.println();
}
}
