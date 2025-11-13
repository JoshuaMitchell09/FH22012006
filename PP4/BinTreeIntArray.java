import java.util.Arrays;
import java.util.Stack;

public class BinTreeIntArray {

    private Integer[] _tree;

    public BinTreeIntArray(int size) {
        _tree = new Integer[size];
    }

    public Integer[] getTree() {
        return _tree;
    }

    public void insert(int value) {
        // --------------------------------------------
        // Actualizar
        // --------------------------------------------
        int i = 0;

        // Recorremos hasta encontrar posición vacía
        while (i < _tree.length && _tree[i] != null) {
            if (value < _tree[i]) {
                i = 2 * i + 1; // Izquierda
            } else {
                i = 2 * i + 2; // Derecha
            }
        }

        // Insertamos si hay espacio
        if (i < _tree.length) {
            _tree[i] = value;
        }

        System.out.println(" ↳ insert: " + value + " → " + Arrays.toString(_tree));
    }

    public void inOrderTraversal() { // left -> root -> right
        System.out.print(" ↳ inOrderTraversal → ");
        var stack = new Stack<Integer>();
        var index = 0;
        while (!stack.isEmpty() || (index < _tree.length && _tree[index] != null)) {
            while (index < _tree.length && _tree[index] != null) {
                stack.push(index);
                index = 2 * index + 1;
            }
            index = stack.pop();
            System.out.print(_tree[index] + " ");
            index = 2 * index + 2;
        }
        System.out.println();
    }

    public void preOrderTraversal() { // root -> left -> right
        System.out.print(" ↳ preOrderTraversal → ");

        // --------------------------------------------
        // Actualizar
        // --------------------------------------------
        if (_tree[0] == null) {
            System.out.println();
            return;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while (!stack.isEmpty()) {
            int i = stack.pop();
            System.out.print(_tree[i] + " ");

            int right = 2 * i + 2;
            int left = 2 * i + 1;

            // Empujamos primero el hijo derecho, para procesar primero el izquierdo
            if (right < _tree.length && _tree[right] != null) stack.push(right);
            if (left < _tree.length && _tree[left] != null) stack.push(left);
        }

        System.out.println();
    }

    public void postOrderTraversal() { // left -> right -> root
        System.out.print(" ↳ postOrderTraversal → ");

        // --------------------------------------------
        // Actualizar
        // --------------------------------------------
        if (_tree[0] == null) {
            System.out.println();
            return;
        }

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(0);

        while (!stack1.isEmpty()) {
            int i = stack1.pop();
            stack2.push(i);

            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < _tree.length && _tree[left] != null) stack1.push(left);
            if (right < _tree.length && _tree[right] != null) stack1.push(right);
        }

        while (!stack2.isEmpty()) {
            System.out.print(_tree[stack2.pop()] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        var tree = new BinTreeIntArray(7);
        System.out.println("Empty array → " + Arrays.toString(tree.getTree()));
        tree.insert(4);
        tree.insert(6);
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        System.out.println("\nFull array → " + Arrays.toString(tree.getTree()));
        tree.inOrderTraversal(); // 1 2 3 4 5 6 7
        tree.preOrderTraversal(); // 4 2 1 3 6 5 7
        tree.postOrderTraversal(); // 1 3 2 5 7 6 4
    }
}
