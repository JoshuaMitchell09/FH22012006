import java.util.ArrayList;

public class TheStack implements StackInterface {

    private int capacity;           // Capacidad máxima de la pila
    private ArrayList<Double> stack; // Contenedor dinámico

    // Constructor
    public TheStack(int capacity) {
        this.capacity = capacity;
        this.stack = new ArrayList<>();
    }

    // Inserta un elemento (mejora del método push)
    @Override
    public boolean push(double item) {
        if (stack.size() >= capacity) {
            return false; // Overflow
        }
        stack.add(item);
        return true;
    }

    // Extrae el elemento superior (update del método pop)
    @Override
    public Double pop() {
        if (stack.isEmpty()) {
            return null; // Underflow
        }
        return stack.remove(stack.size() - 1);
    }

    // Retorna el elemento superior sin eliminarlo (update del método peek)
    @Override
    public Double peek() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    // Retorna el tamaño actual
    @Override
    public int size() {
        return stack.size();
    }

    // Verifica si está vacía
    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    // Imprime la pila completa
    @Override
    public void print() {
        System.out.println(stack);
    }

    // Método principal — NO debe modificarse en el examen/práctica
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        TheStack s = new TheStack(n);

        System.out.println("\nPushing {capacity + 1}");
        for (int i = 0; i < n + 1; i++) {
            double rand = Math.random();
            System.out.println(" ↳ push(" + rand + ") → " + s.push(rand));
        }

        System.out.println("\nPushed {full}");
        System.out.print(" ↳ print() → ");
        s.print();
        System.out.println("   ↳ peek() → " + s.peek());
        System.out.println("   ↳ size() → " + s.size());
        System.out.println("   ↳ empty() → " + s.empty());

        System.out.println("\nPopping {capacity + 1}");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(" ↳ pop() → " + s.pop());
        }

        System.out.println("\nPopped {empty}");
        System.out.print(" ↳ print() → ");
        s.print();
        System.out.println("   ↳ peek() → " + s.peek());
        System.out.println("   ↳ size() → " + s.size());
        System.out.println("   ↳ empty() → " + s.empty());
    }
}