public class CustomStack {

    private StackNode _head;

    public CustomStack() {
        _head = null;
    }

    public void push(String word) {
       

        StackNode newNode = new StackNode(word);
        newNode.setNext(_head);
        _head = newNode;
    }

    public String pop() {
        // ChatGPT — sacar del tope

        if (_head == null) {
            return null;
        }

        String word = _head.getWord();
        _head = _head.getNext();
        return word;
    }

    public int size() {
        // ChatGPT — contar nodos

        int count = 0;
        StackNode temp = _head;

        while (temp != null) {
            count++;
            temp = temp.getNext();
        }

        return count;
    }

    public String getWords() {
        

        StringBuilder builder = new StringBuilder("(")
                .append(size())
                .append(") [");

        String word = pop();
        while (word != null) {
            builder.append(" ").append(word);
            word = pop();
        }

        builder.append(" ]");
        return builder.toString();
    }
}

