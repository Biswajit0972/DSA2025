package Restart.Week2.BinarySearch;

import java.util.LinkedList;
import java.util.Queue;

public class ClassRoom {
    static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        public Node () {

        }

        public Node (int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public static int idx = -1;
    public static Node createBinaryTree (int [] arr) {
        idx++;
        // base
        if (arr[idx] == -1) {
            return null;
        }

        Node newNode = new Node(arr[idx]);
        newNode.leftChild = createBinaryTree(arr);
        newNode.rightChild = createBinaryTree(arr);

        return newNode;
    }

    public static void PrintList (Node head) { // this is preorder traversal
        if (head == null) {
            System.out.print("null ->");
            return;
        }

        System.out.print(head.data + " -> ");

        PrintList(head.leftChild);
        PrintList(head.rightChild);
    }


    public static void postPrint (Node head) {
        if (head == null) {
            System.out.print("null ->");
            return;
        }
        postPrint(head.leftChild);
        postPrint(head.rightChild);
        System.out.print(head.data + " -> ");
    }

    public static void inorderPrint (Node head ) {
        if (head == null) {
            System.out.print("null ->");
            return;
        }
        inorderPrint(head.leftChild);
        System.out.print(head.data + " -> ");
        inorderPrint(head.rightChild);
    }

    public static int countHeightByNodes (Node head) {
        if (head == null) {
            return 0;
        }

        int leftChild = countHeightByNodes(head.leftChild);
        int rightChild = countHeightByNodes(head.rightChild);

        return Math.max(leftChild, rightChild) + 1;
    }

    public static int countEdegs (Node head) {
        if (head == null) {
            return 0;
        }

        int leftChild = countHeightByNodes(head.leftChild);
        int rightChild = countHeightByNodes(head.rightChild);

        return leftChild+ rightChild + 1;
    }
    public static void levelOrder (Node head) {
        if (head == null) {
            return;
        }

        Queue<Node> store = new LinkedList<>();

        store.add(head);
        store.add(null);

        while (!store.isEmpty()) {
            Node removeNode = store.remove();
            if (removeNode == null) {
                if (store.isEmpty()) {
                    break;
                }else {
                    System.out.println();
                    store.add(null);
                }
            }else {
                System.out.print(removeNode.data);
                if (removeNode.leftChild != null) {

                store.add(removeNode.leftChild);
                }
                if (removeNode.rightChild != null) {
                store.add(removeNode.rightChild);
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node e1 = createBinaryTree(arr);
        System.out.println(countEdegs(e1));
    }
}
