package idv.paul.geeksforgeeks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            int[] nums = new int[size];
            for (int i=0; i<size; i++) {
                Node node = queue.poll();
                if (node == null)
                    continue;
                nums[i] = node.data;
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            arr.add(nums[0]);
        }

        return arr;
    }

    public static void main(String... argv) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.right = node8;
        node3.left = node6;
        node3.right = node7;
        LeftViewOfBinaryTree obj = new LeftViewOfBinaryTree();
        System.out.println(obj.leftView(node1));
    }
}



class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
