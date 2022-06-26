import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphTryOuts {


    public static void main(String[] args){

        List<Vedge> edges = Arrays.asList(new Vedge(0, 1, 2),new Vedge(0, 2, 4),
                new Vedge(1, 2, 4),new Vedge(2, 0, 5), new Vedge(2, 1, 4),
                new Vedge(3, 2, 3), new Vedge(4, 5, 1),new Vedge(5, 4, 3));

        Vgraph graph = new Vgraph(edges);

        graph.printGraph();
    }
}
