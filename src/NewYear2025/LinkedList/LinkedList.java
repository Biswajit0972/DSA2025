package NewYear2025.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedList {
    static class ListNode {
        int val;
        ListNode next;

        public  ListNode () {

        }

        public ListNode (int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode AddLast (int [] arr,  ListNode head) {

        if (head.val == 0) {
            head = new ListNode(arr[0]);

        }

        ListNode temp  = head;

        for (int i = 1; i< arr.length; i++) {
            temp.next = new ListNode(arr[i]);
           temp = temp.next;

    }
        return head;
    }

    public static void printList (ListNode head) {
        if (head == null) {
            return;
        }

        ListNode temp = head;

        while (temp  != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean isExist(ListNode head, int val) {
        if (head == null) {
            return false;
        }

        ListNode temp = head;

        while (temp  != null) {
           if (temp.val == val) {
               return true;
           }
            temp = temp.next;
        }
      return false;
    }

    public static ListNode deleteHead (ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode temp =  head;
        head = head.next;
        return head;
    }

    public static ListNode delteTail (ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode temp =  head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    public static ListNode detectCycle(ListNode head) {
     if (head == null || head.next == null) {
         return head;
     }

        ListNode slow  = head;
        ListNode fast  = head;

        while (fast != null  && fast.next != null) {
            slow =  slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                break;
            }
        }

        if (fast.next == null || fast == null) {
            return null;
        }

        ListNode temp =  head;

        while (slow != temp) {
            slow =slow.next;
            temp =temp.next;
        }

        return temp;
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null ||  head.next == null) {
            return head;
        }

        ListNode OddHead = head;
        ListNode EvenHead = head.next;

        ListNode dummyOdd = head;
        ListNode dummyEven = head.next;

        while (dummyEven != null && dummyEven.next  != null && dummyOdd != null && dummyOdd.next != null) {

             dummyEven = dummyEven.next.next;
             dummyOdd = dummyOdd.next.next;

            OddHead.next = dummyOdd;
            EvenHead.next = dummyEven;
            OddHead  = OddHead.next;
            EvenHead = EvenHead.next;
        }

        OddHead.next = head.next;
        return OddHead;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        int length = listofLength(head); // O(n)

        if (head.next ==  null && n == 1) {
            head = head.next;
        }

        if (n == length) {
            return head.next;
        }

        int count = 0;
        ListNode temp = head;
        while (temp != null) { 
            count++;
            if (length - n == count) {
                temp.next =  temp.next.next;
                break;
            }

            temp = temp.next;
        }

        return head;
    }

    public static int listofLength (ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static ListNode MargeSortOnLL (ListNode head) {
        List<Integer> array =  new ArrayList<>(); // O(n)

        ListNode temp = head;

        while (temp != null) { // O(n)
            array.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(array); // O(nlogn)

        ListNode res =  head;
        for (Integer val : array) { // O(n)
            res.val = val;
            res = res.next;
        }
        // TC = O(n) + O(n) + O(nlogn) = O(2n) + O(nlogn) = O(n) + O(nlong)
        // SC = O(n)
        return head;
    }

    public static ListNode brokeLL (ListNode head) {
       return head;
    }

    public static ListNode reverse (ListNode head) {
        if (head == null || head.next ==   null) {
            return head;
        }

        ListNode MyLastIsMyHead = reverse(head);
        head.next.next = head;
        head.next = null; // we not reverse our linked-list at for a single node. GO README.MD
        return MyLastIsMyHead;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,2,1,2,0,2,2};
        ListNode  l =  AddLast(arr, new ListNode());
        ListNode sorted =  MargeSortOnLL(l);
        printList(sorted);
    }
}
