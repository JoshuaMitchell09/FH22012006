import java.util.Stack;

public class CustomTree {

    private TreeNode _root;

    public CustomTree() {
        _root = null;
    }

    public void insert(double tf, String word) {
        // ChatGPT — MUY IMPORTANTE actualizar la raíz
        _root = insert(_root, tf, word);
    }

    private TreeNode insert(TreeNode node, double tf, String word) {

        // Caso base: crear nodo
        if (node == null) {
            TreeNode newNode = new TreeNode(tf);
            newNode.addWord(word);
            return newNode;
        }

        // Inserción según BST por TF
        if (tf < node.getTf()) {
            node.setLeft(insert(node.getLeft(), tf, word));
        } else if (tf > node.getTf()) {
            node.setRight(insert(node.getRight(), tf, word));
        } else {
            // TF igual — agregar palabra a la pila
            node.addWord(word);
        }

        return node;
    }

    public String getInOrderTraversal() {
        return getInOrderTraversal(_root);
    }

    private String getInOrderTraversal(TreeNode root) {
        // ChatGPT — InOrder iterativo

        StringBuilder builder = new StringBuilder();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }

            node = stack.pop();

            builder.append(node.getTf()).append("\n");
            builder.append(" ↳ ").append(node.getWords()).append("\n\n");

            node = node.getRight();
        }

        return builder.toString();
    }
}



