import java.util.Arrays;

public class CustomGraph {

    private char[] _chars;
    private int[][] _matrix;

    public CustomGraph(char[] chars) {
        _chars = chars;
        _matrix = new int[chars.length][chars.length];
    }

    public void addDirectedEdge(char source, char target) {
        addEdge(source, target);
    }

    private void addEdge(char source, char target) {
        

        int src = Arrays.binarySearch(_chars, source);
        int tgt = Arrays.binarySearch(_chars, target);

        if (src >= 0 && tgt >= 0) {
            _matrix[src][tgt]++;
        }
    }

    public String getMatrix() {
       

        StringBuilder builder = new StringBuilder(" ");

        for (char c : _chars) {
            builder.append(" , ").append(c);
        }

        for (int i = 0; i < _chars.length; i++) {
            builder.append("\n").append(_chars[i]);

            for (int j = 0; j < _chars.length; j++) {
                builder.append(" , ").append(_matrix[i][j]);
            }
        }

        builder.append("\n");
        return builder.toString();
    }
}

