
public class VTree {
    TreeNode root;

    public VTree(){
        root = null;
    }

   public TreeNode sortedArrayToBST(int[] array){
        root = createBSTFromArray(array, 0, array.length -1);
        return root;
    }

    public TreeNode createBSTFromArray(int[] array, int start, int end){
        if(start > end)
            return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(array[mid]);

        node.left = createBSTFromArray(array, start, mid -1);
        node.right = createBSTFromArray(array, mid +1, end);

        return node;
    }

    public void preOrderPrint(TreeNode root){

        if(root == null)
            return;

       System.out.println(root.data);

       preOrderPrint(root.left);
       preOrderPrint(root.right);
    }
};
