import java.util.*;

public class GraphTryOuts {

    public static void main(String[] args){

        List<Vedge> edges = Arrays.asList(new Vedge(0, 1, 2),new Vedge(0, 2, 4),
                new Vedge(1, 2, 4),new Vedge(2, 0, 5), new Vedge(2, 1, 4),
                new Vedge(3, 2, 3), new Vedge(4, 5, 1),new Vedge(5, 4, 3), 
                new Vedge(3, 4, 4), new Vedge(2, 3, 3));

        Vgraph graph = new Vgraph(edges);
        graph.printGraph();

        /*int node1 = Integer.parseInt(args[0]);
        int node2 = Integer.parseInt(args[1]);*/

        /*Question: Given Directed Graph, design an algorithm to find out whether there is a route between two nodes */
        /*boolean routeAvailable = isRouteAvailable(graph, new Vnode(node1), new Vnode(node2));

        System.out.println("Route available between " + node1 + " and " + node2 + ": " + routeAvailable); */

        breadhFirstSearch(graph, new Vnode(0));
    }

    /*Question: Given Directed Graph, design an algorithm to find out whether there is a route between two nodes */
    public static boolean isRouteAvailable(Vgraph graph, Vnode node1, Vnode node2) {
        if (node1.value == node2.value)
            return true;

        Queue<Vnode> vnodeQueue = new LinkedList<>();
        vnodeQueue.add(node1);

        while (!vnodeQueue.isEmpty()) {
            Vnode node = vnodeQueue.remove();
            List<Vnode> vertex = graph.graph.get(node.value);

            for (Vnode childNode : vertex) {

                if (!childNode.isVisited) {
                    if (childNode.value == node2.value) {
                        return true;
                    }

                    vnodeQueue.add(childNode);
                }
            }

            node.isVisited = true;
        }

        return false;
    }

    public static void breadhFirstSearch(Vgraph graph, Vnode startNode){
            Queue<Vnode> nodeQueue = new LinkedList<Vnode>();
            nodeQueue.add(startNode);

            while(!nodeQueue.isEmpty()){
                Vnode temp = nodeQueue.remove();

                System.out.println(" " + temp.value +" ");

                List<Vnode> vertex = graph.graph.get(temp.value); 

                for(Vnode childNode: vertex){
                    //System.out.println("checking child " + childNode.value +" ");
                    if(!childNode.isVisited)
                    {
                        //System.out.println(" child node not visited " + childNode.value +" ");
                        nodeQueue.add(childNode);                 
                    }
                    /*else{
                        System.out.println(" child node already visited " + childNode.value +" ");
                    }*/
                }

                temp.isVisited = true;
            }
    }
}
