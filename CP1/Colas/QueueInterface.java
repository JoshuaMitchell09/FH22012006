
public interface QueueInterface {

    // Inserta un elemento en la cola.
    public void enqueue(Character item);

    // Extrae el primer elemento de la cola y lo retorna.
    // Si está vacía, debe retornar null (sin usar if...else).
    public Character dequeue();

    // Retorna el primer elemento sin eliminarlo.
    // Si la cola está vacía, debe retornar null (sin usar if...else).
    public Character getFront();

    // Retorna el tamaño actual de la cola.
    public int getSize();

    // Verifica si la cola está vacía.
    public boolean isEmpty();

    // Muestra la cola completa (de izquierda a derecha).
    public void print();

    // Retorna las ternas de nucleótidos (codones) en un arreglo.
    public String[] getCodons();
}