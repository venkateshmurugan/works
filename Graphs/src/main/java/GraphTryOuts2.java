import java.util.*;

public class GraphTryOuts2 {

    public static void main(String[] args){

        VGraph2 gr = new VGraph2(6);

        gr.addEdge(0, 1);
        gr.addEdge(0, 2);
        gr.addEdge(1, 2);
        gr.addEdge(2, 0);
        gr.addEdge(2, 3);
        gr.addEdge(3, 4);
        gr.addEdge(4, 5);

        gr.BFS(2);
    }
}

   