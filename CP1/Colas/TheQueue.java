import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class TheQueue implements QueueInterface {

    private Deque<Character> queue;  // Estructura de cola
    private int n;                   // Cantidad total de nucleótidos
    private final char[] nucleotides = { 'A', 'C', 'G', 'T' }; // ADN básico

    // Constructor
    public TheQueue(int n) {
        this.queue = new ArrayDeque<>();
        this.n = n;
    }

    // Inserta un nucleótido en la cola
    @Override
    public void enqueue(Character item) {
        queue.addLast(item);
    }

    // Extrae el primer elemento de la cola y lo retorna (sin usar if)
    @Override
    public Character dequeue() {
        return queue.pollFirst(); // pollFirst() retorna null si está vacía
    }

    // Retorna el primer elemento sin eliminarlo (sin usar if)
    @Override
    public Character getFront() {
        return queue.peekFirst(); // peekFirst() retorna null si está vacía
    }

    // Retorna el tamaño actual
    @Override
    public int getSize() {
        return queue.size();
    }

    // Verifica si está vacía
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Imprime la cola completa
    @Override
    public void print() {
        System.out.println(queue);
    }

    // Genera los codones (tripletas) vaciando la cola
    @Override
    public String[] getCodons() {
        int codonCount = n / 3;         // Tamaño del arreglo
        String[] codons = new String[codonCount];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < codonCount; i++) {
            builder.setLength(0); // Reiniciar el StringBuilder
            for (int j = 0; j < 3; j++) {
                builder.append(dequeue());
            }
            codons[i] = builder.toString();
        }
        return codons;
    }

    // Método principal — NO debe modificarse según el enunciado
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        TheQueue q = new TheQueue(n);
        Random rand = new Random();

        // Llenado de la cola
        System.out.println("\nFilled {full}");
        for (int i = 0; i < n; i++) {
            char nucleotide = q.nucleotides[rand.nextInt(q.nucleotides.length)];
            q.enqueue(nucleotide);
        }

        System.out.print(" ↳ print() → ");
        q.print();
        System.out.println("   ↳ getFront() → " + q.getFront());
        System.out.println("   ↳ getSize() → " + q.getSize());
        System.out.println("   ↳ isEmpty() → " + q.isEmpty());

        // Generar codones
        String[] codons = q.getCodons();
        System.out.print("\ngetCodons() → [");
        for (int i = 0; i < codons.length; i++) {
            System.out.print(codons[i]);
            if (i < codons.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Mostrar la cola vacía
        System.out.println("\nEnd {empty}");
        System.out.print(" ↳ print() → ");
        q.print();
        System.out.println("   ↳ getFront() → " + q.getFront());
        System.out.println("   ↳ getSize() → " + q.getSize());
        System.out.println("   ↳ isEmpty() → " + q.isEmpty());
    }
}