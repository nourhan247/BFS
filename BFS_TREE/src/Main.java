import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter targete node: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);



        // Perform BFS to find the target in the tree
        System.out.println("Visited nodes during BFS traversal:");
        if (BFS(root, target)) {
            System.out.println("\nTarget " + target + " found in the tree.");
        } else {
            System.out.println("\nTarget " + target + " not found in the tree.");
        }

        }
    public static boolean BFS(Tree node, int target)  {
        if(node == null) return false;

        Queue<Tree> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            Tree current = queue.poll();
            System.out.println(current.value+" is visited");
            if(current.value==target) return true;
            if(current.left != null) queue.offer(current.left);
            if(current.right != null) queue.offer(current.right);

        }

        return false;
    }

}

class Tree{
    Tree left,right;
    int value;
    Tree(int value){
        this.value = value;
        left = right = null;
    }
}

//        Time Complexity: O(V), where V is the number of nodes in the tree. Each node is visited once.
//        Space Complexity: O(W), where W is the maximum width of the tree. This accounts for the space used by the array to store the nodes at each level.

// search level by level