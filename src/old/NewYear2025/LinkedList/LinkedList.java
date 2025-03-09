package old.NewYear2025.LinkedList;

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
        if (head == null || head.next == null) {
            return head;
        }

        ListNode MyLastIsMyHead = reverse(head.next);
        head.next.next = head;
        head.next = null; // we not reverse our linked-list at for a single node. GO README.MD
        return MyLastIsMyHead;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)  {
            return null;
        }

       int a = listofLength(l1);
       int b =  listofLength(l2);

       ListNode largeL = null;
       ListNode shortL = null;

       if (a > b) {
          largeL = l1;
          shortL = l2;
       } else if (a < b) {
           largeL = l2;
           shortL = l1;
       }else {
           largeL = l1;
           shortL = l2;
       }

       int carry = 0;

       while (largeL != null && shortL != null) {
           int res = largeL.val + shortL.val + carry;
           largeL.val = res % 10;
           carry =  res / 10;

           largeL = largeL.next;
           shortL = shortL.next;
       }

       ListNode prev  = null;
       while (carry != 0 && largeL != null) {
           int res  = largeL.val + carry;
           largeL.val =  res %  10;
           carry = res / 10;
           prev = largeL;
           largeL = largeL.next;
       }

       if (carry  ==  1 && prev.next ==  null) {
           prev.next = new ListNode(1);
           return reverse(l1);
       }
       return a >= b ? l1 : l2;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,3};
        int [] arr2 = {5,6};

        ListNode l1 = AddLast(arr, new ListNode(0));
        ListNode l2 = AddLast(arr2, new ListNode(0));
        ListNode res = addTwoNumbers(l1, l2);
        printList(res);
    }
}
