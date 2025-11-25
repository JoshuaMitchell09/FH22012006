public class CustomQueue {

    private QueueNode _head;

    public CustomQueue() {
        _head = null;
    }

    public void enqueue(int index) {
        

        QueueNode newNode = new QueueNode(index);

        if (_head == null) {
            _head = newNode;
        } else {
            QueueNode temp = _head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    public int dequeue() {
       

        if (_head == null) {
            return -1;
        }

        int value = _head.getIndex();
        _head = _head.getNext();
        return value;
    }

    public int getSize() {
        // ChatGPT — contar nodos

        int count = 0;
        QueueNode temp = _head;

        while (temp != null) {
            count++;
            temp = temp.getNext();
        }

        return count;
    }

    public String getIndexes() {
        

        StringBuilder builder = new StringBuilder();

        int value = dequeue();
        while (value != -1) {
            builder.append(" ").append(value);
            value = dequeue();
        }

        return builder.toString();
    }
}



