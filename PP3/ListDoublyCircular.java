import java.util.ArrayDeque;
import java.util.Random;

public class ListDoublyCircular<T> implements ListInterface<T> {

    private NodeDoubly<T> head = null; // First, Front, Initial node
    private NodeDoubly<T> tail = null; // Last node

    public ListDoublyCircular() {
        head = null;
        tail = null;
    }

    /**
     * Agrega un nodo al inicio de la lista.
     */
    public void addFirst(T value) {
        NodeDoubly<T> newNode = new NodeDoubly<T>(value);
        if (isEmpty()) {
            // Caso 1: Lista vacía. El nuevo nodo es head y tail.
            head = newNode;
            tail = newNode;
            head.next = head; // Apunta a sí mismo
            head.prev = head; // Apunta a sí mismo
        } else {
            // Caso 2: Lista con elementos.
            // 1. Establecer enlaces del nuevo nodo.
            newNode.next = head;
            newNode.prev = tail;
            // 2. Actualizar enlaces de nodos adyacentes.
            head.prev = newNode;
            tail.next = newNode;
            // 3. Actualizar la referencia head.
            head = newNode;
        }
    }

    /**
     * Agrega un nodo al final de la lista.
     */
    public void addLast(T value) {
        NodeDoubly<T> newNode = new NodeDoubly<T>(value);
        if (isEmpty()) {
            // Caso 1: Lista vacía. El nuevo nodo es head y tail.
            head = newNode;
            tail = newNode;
            head.next = head; // Apunta a sí mismo
            head.prev = head; // Apunta a sí mismo
        } else {
            // Caso 2: Lista con elementos.
            // 1. Establecer enlaces del nuevo nodo.
            newNode.next = head;
            newNode.prev = tail;
            // 2. Actualizar enlaces de nodos adyacentes.
            tail.next = newNode;
            head.prev = newNode;
            // 3. Actualizar la referencia tail.
            tail = newNode;
        }
    }

    /**
     * Elimina el primer nodo de la lista retornando su valor (data).
     */
    public T removeFirst() {
        if (isEmpty()) {
            // Caso 1: Lista vacía.
            return null;
        }

        T first = head.data; // Guardar el valor a retornar.

        if (head == tail) {
            // Caso 2: Un solo elemento. La lista queda vacía.
            head = null;
            tail = null;
        } else {
            // Caso 3: Más de un elemento.
            // 1. Mover head al siguiente nodo.
            head = head.next;
            // 2. Actualizar el enlace circular: el nuevo head.prev debe ser tail.
            head.prev = tail;
            // 3. Actualizar el enlace circular: tail.next debe ser el nuevo head.
            tail.next = head;
        }

        return first;
    }

    /**
     * Elimina el último nodo de la lista retornando su valor (data).
     */
    public T removeLast() {
        if (isEmpty()) {
            // Caso 1: Lista vacía.
            return null;
        }

        T last = tail.data; // Guardar el valor a retornar.

        if (head == tail) {
            // Caso 2: Un solo elemento. La lista queda vacía.
            head = null;
            tail = null;
        } else {
            // Caso 3: Más de un elemento.
            // 1. Mover tail al nodo anterior.
            tail = tail.prev;
            // 2. Actualizar el enlace circular: el nuevo tail.next debe ser head.
            tail.next = head;
            // 3. Actualizar el enlace circular: head.prev debe ser el nuevo tail.
            head.prev = tail;
        }

        return last;
    }

    // --- Métodos provistos que SÍ contienen System.out.print (no modificables) ---

    public T getFirst() {
        return head != null ? head.data : null;
    }

    public T getLast() {
        return tail != null ? tail.data : null;
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public Integer getSize() {
        var size = 0;
        if (!isEmpty()) {
            var current = head;
            do {
                size++;
                current = current.next;
            } while (current != tail.next);
        }
        return size;
    }

    public void printList() {
        if (!isEmpty()) {
            var curr = head;
            do {
                System.out.println("\t" + curr.prev.data + " ⇄ | " + curr.data + " | ⇄ " + curr.next.data);
                curr = curr.next;
            } while (curr != tail.next);
        }
    }

    public void printListInReverse() {
        if (!isEmpty()) {
            var curr = tail;
            System.out.print("| ");
            do {
                System.out.print(curr.data + " | ");
                curr = curr.prev;
            } while (curr != head.prev);
        }
        System.out.println();
    }
}