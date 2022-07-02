public class Vnode {
    int value, weight;
    boolean isVisited;
    public Vnode(int value, int weight){
        this.value = value;
        this.weight = weight;
        isVisited = false;
    }
    public Vnode(int value){
        this.value = value;
        isVisited = false;
    }
};
