public interface StackInterface {

    // Inserta un elemento en la pila.
    // Retorna true si se pudo insertar, o false si la pila está llena.
    public boolean push(double item);

    // Elimina el elemento del tope de la pila y lo retorna.
    // Si la pila está vacía, debe retornar null.
    public Double pop();

    // Retorna el elemento del tope sin eliminarlo.
    // Si la pila está vacía, debe retornar null.
    public Double peek();

    // Retorna la cantidad de elementos almacenados actualmente.
    public int size();

    // Retorna true si la pila está vacía.
    public boolean empty();

    // Imprime todos los elementos de la pila.
    public void print();
}