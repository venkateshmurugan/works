import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeTryOuts {
    public static void main(String args[]){
        int arr[] = new int[]{1, 2, 4, 7, 8, 11, 13, 17, 23, 29, 31, 37, 39, 41, 47, 53, 59, 63, 71};
        VTree vTree = new VTree();
        TreeNode node = vTree.sortedArrayToBST(arr);

        vTree.preOrderPrint(node);

        List<LinkedList<TreeNode>> returnList = createLevelList(node);

        printLevelList(returnList);
    }

    public static List<LinkedList<TreeNode>> createLevelList(TreeNode node) {

        if (node == null)
            return null;

        List<LinkedList<TreeNode>> returnList = new ArrayList<LinkedList<TreeNode>>();

        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        current.add(node);

        while (current.size() > 0) {
            returnList.add(current);

            LinkedList<TreeNode> temp = new LinkedList<TreeNode>();

            for (TreeNode n : current) {
                if (n.left != null) {
                    temp.add(n.left);
                }

                if (n.right != null) {
                    temp.add(n.right);
                }
            }

            current = temp;
        }

        return returnList;
    }

    public static void printLevelList(List<LinkedList<TreeNode>> levelList){
        int i = 0;
        for(LinkedList<TreeNode> level: levelList){
            System.out.println("\nLevel :" + i++);
            for(TreeNode node: level){
                System.out.print(node.data + "   ");
            }
        }

        System.out.println("\n\n ");
    }

    /*public static List<LinkedList<TreeNode>> createLevelListDepthFirst(TreeNode node) {

        if (node == null)
            return null;

        return returnList;
    } */
}

