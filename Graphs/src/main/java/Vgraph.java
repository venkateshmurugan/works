import org.w3c.dom.Node;

import java.util.*;

public class Vgraph {
    Map<Integer, List<Vnode>> graph = new HashMap<Integer, List<Vnode>>();

    public Vgraph(List<Vedge> edges){

        for (Vedge e: edges) {
            if(!graph.containsKey(e.src)){
                graph.put(e.src, new LinkedList<>());
            }

            graph.get(e.src).add(new Vnode(e.dest, e.weight));
        }
    }

    public void addEdge(Vedge e)
    {
        graph.get(e.src).add(new Vnode(e.dest, e.weight));
    }

    public void printGraph()
    {
        StringBuilder strBuild = new StringBuilder();

        for(int v: graph.keySet()){
            strBuild.append("\n" + v + " => ");
            for(Vnode node: graph.get(v)){
                strBuild.append(" " + node.value + ":" + node.weight);
            }
        }

        System.out.println(strBuild);
    }
}
