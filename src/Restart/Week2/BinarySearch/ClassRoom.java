package Restart.Week2.BinarySearch;

import java.util.*;

public class ClassRoom {
    static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        public Node() {

        }

        public Node(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public static int idx = -1;

    public static Node createBinaryTree(int[] arr) {
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

    public static void PrintList(Node head) { // this is preorder traversal
        if (head == null) {
            System.out.print("null ->");
            return;
        }

        System.out.print(head.data + " -> ");

        PrintList(head.leftChild);
        PrintList(head.rightChild);
    }


    public static void postPrint(Node head) {
        if (head == null) {
            System.out.print("null ->");
            return;
        }
        postPrint(head.leftChild);
        postPrint(head.rightChild);
        System.out.print(head.data + " -> ");
    }

    public static void inorderPrint(Node head) {
        if (head == null) {
            System.out.print("null ->");
            return;
        }
        inorderPrint(head.leftChild);
        System.out.print(head.data + " -> ");
        inorderPrint(head.rightChild);
    }

    public static int countHeightByNodes(Node head) {
        if (head == null) {
            return 0;
        }

        int leftChild = countHeightByNodes(head.leftChild);
        int rightChild = countHeightByNodes(head.rightChild);

        return Math.max(leftChild, rightChild) + 1;
    }

    public static int countEdegs(Node head) {
        if (head == null) {
            return 0;
        }

        int leftChild = countHeightByNodes(head.leftChild);
        int rightChild = countHeightByNodes(head.rightChild);

        return leftChild + rightChild + 1;
    }

    public static void levelOrder(Node head) {
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
                } else {
                    System.out.println();
                    store.add(null);
                }
            } else {
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

    public static int countDiaMeter(Node head) {
        if (head == null) {
            return 0;
        }

        int diameterLeft = countDiaMeter(head.leftChild);
        int diameterRight = countDiaMeter(head.rightChild);
        int heightLeft = countHeightByNodes(head.leftChild);
        int heightRight = countHeightByNodes(head.rightChild);

        int selfDiameter = heightLeft + heightRight + 1;
        return Math.max(Math.max(diameterLeft, diameterRight), selfDiameter);
    }

    public static boolean isValid(Node e1, Node e2) {
        if (e1 == null) {
            return false;
        }

        if (e1.data == e2.data) {
            if (isIdentical(e1, e2)) {
                return true;
            }
        }

        return isValid(e1.leftChild, e2) || isValid(e1.rightChild, e2);
    }

    public static boolean isIdentical(Node e1, Node e2) {
        if (e1 == null && e2 == null) {
            return true;
        } else if (e1 == null || e2 == null || e1.data != e2.data) {
            return false;
        }

        if (!isIdentical(e1.leftChild, e2.leftChild)) {
            return false;
        }
        if (!isIdentical(e1.rightChild, e2.rightChild)) {
            return false;
        }

        return true;
    }

     static class info {
        Node e1;
        int vd;

        public info(Node e1, int vd) {
            this.e1 = e1;
            this.vd = vd;
        }
    }

    public static void TopLevelView(Node root) {
        HashMap<Integer, Integer> tc = new HashMap<>();
        Queue<info> q = new LinkedList<>();
        int min = 0, max = 0;
        q.add(new info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            info remove = q.remove();
            if (remove == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
//                if (!tc.containsKey(remove.vd)) {
//                    tc.put(remove.vd, remove.e1.data); // it is used top level view
//                }
                tc.put(remove.vd, remove.e1.data); // this case used for bottom view more info check out not book

                if (remove.e1.leftChild != null) {
                    q.add(new info(remove.e1.leftChild, remove.vd - 1));
                    min = Math.min(min, remove.vd - 1);
                }
                if (remove.e1.rightChild != null) {
                    q.add(new info(remove.e1.rightChild, remove.vd + 1));
                    max = Math.max(max, remove.vd + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.println(tc.get(i));
        }
    }

    public static void printKthLevel(Node root, int k) {
        kthLevelHelper(root, k, 1);
    }

    public static void kthLevelHelper(Node root, int k, int i) {
        if (i == k) {
            System.out.println(root.data);
            return;
        }

        // kaam
        kthLevelHelper(root.leftChild, k, i + 1);
        kthLevelHelper(root.rightChild, k, i + 1);
    }


    public static int minDistance(Node e1, Node root) {
        if (root == null) {
            return -1;
        }

        if (root.data == e1.data) {
            return 0;
        }

        int leftSubtree = minDistance(e1, root.leftChild);
        int rightSubtree = minDistance(e1, root.rightChild);

        if (leftSubtree == -1) {
            return rightSubtree + 1;
        }

        if (rightSubtree == -1) {
            return leftSubtree + 1;
        }

        return -1;
    }


    public static int helperSum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSub = helperSum(root.leftChild);
        int rightSub = helperSum(root
                .rightChild);

        int temp = root.data;
        int sum = leftSub + rightSub;
        root.data = sum;
        return sum + temp;
    }

    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static ArrayList<Integer> topViewExperiment (Node root) {
        ArrayList<Integer> res = new ArrayList<>();

        HashMap<Integer, Integer> lt = new HashMap<>();
        ExperimentHelper(root, lt, 0);
        for (int i = min; i <= max; i++) {
            res.add(lt.get(i));
        }
        return res;
    }

    public static void ExperimentHelper (Node root, HashMap<Integer, Integer> res, int index) {
        // base
        if (root == null) {
            return;
        }
//         kaam
        if (res.containsKey(index)) {
            if (root.leftChild == null && root.rightChild == null) {
                res.put(index, root.data);
            }
        }

        if (!res.containsKey(index)) {
            res.put(index, root.data);
        }



        ExperimentHelper(root.leftChild, res, index - 1);
        min = Math.min(min, index);
        ExperimentHelper(root.rightChild, res, index+1);
        max =  Math.max(max,  index);

    }

    public static ArrayList<Integer> leftSideView (Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        // edge case
        if (root == null) {
            return result;
        }
//   recursive solution  lsHelper(root, result,0);

        Queue<Node>  q = new LinkedList<>();
        q.add(root);

        while  (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
               // remove node
                Node temp = q.poll();
                if (temp == null) {
                    break;
                }

                if (i == 0) {
                    result.add(temp.data);
                }

                if (temp.leftChild !=   null) {
                    q.add(temp.leftChild);
                }

                if (temp.rightChild !=   null) {
                    q.add(temp.rightChild);
                }
            }
        }
        return result;
    }

    public static void lsHelper (Node root , ArrayList<Integer> res, int index) {
        if (root == null) {
            return;
        }

        if (index == res.size()) {
            res.add(root.data);
        }

        lsHelper(root.leftChild, res, index + 1);
        lsHelper(root.rightChild, res, index + 1);
    }

    public static void myCode (Node root) {
        HashMap<Integer, List<Integer>> db = new HashMap<>();
        verticalHelper(root, db, 0);
        for (int i = min; i <= max; i++){
            System.out.println(db.get(i).toString());
        }
    }

    public static void verticalHelper (Node root, HashMap<Integer, List<Integer>> db, int index) {
        // base
        if (root == null) {
            return;
        }

        // check levels
        if (db.containsKey(index)) {
            db.get(index).add(root.data);
            Collections.sort(db.get(index));
        }else {
            List<Integer> temp = new ArrayList<>();
            temp.add(root.data);
            db.put(index,  temp);
        }

        verticalHelper(root.leftChild, db, index-1);
        min = Math.min(min, index);
        verticalHelper(root.rightChild, db, index+1);
        max  =  Math.max(max, index);
    }
     public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,6,-1,-1,3,5,-1,-1,7,-1,-1};
        Node e1 = createBinaryTree(arr);
        myCode(e1);
    }
}
