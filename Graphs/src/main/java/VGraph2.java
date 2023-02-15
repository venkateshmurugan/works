import java.util.*;

public class VGraph2{
    private int vertices;
    private LinkedList<Integer> adjList[];

    public VGraph2(int vertices){
        this.vertices = vertices;
        adjList = new LinkedList[vertices];

        for(int i = 0; i < vertices; ++i){
            adjList[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int src, int dest){
        adjList[src].add(dest);
    } 

    public void BFS(int startNode){
        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(startNode);

        while(queue.size() != 0){
            Integer temp2 = queue.remove();
            System.out.println(" " + temp2 + " ");

            LinkedList<Integer> tempList = adjList[temp2];

            for(Integer temp: tempList){
                if(visited[temp] == false){
                    queue.add(temp);
                    visited[temp] = true;
                }
            }

            visited[temp2] = true;
        }
    }
}
