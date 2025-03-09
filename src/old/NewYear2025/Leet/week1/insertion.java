package old.NewYear2025.Leet.week1;


public class insertion {
   private static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        HashMap<ListNode, Integer> seen = new HashMap<>();
//        ListNode tempA = headA;
//
//        while (tempA != null) {
//            seen.put(tempA, seen.getOrDefault(tempA, 0)+1);
//            tempA = tempA.next;
//        }
//        ListNode tempB =headB;
//        while (tempB != null) {
//            if (seen.containsKey(tempB)) {
//                return tempB;
//            }
//            tempB = tempB.next;
//        }
         int lengthA = ListofLength(headA);
         int lengthB = ListofLength(headB);

         ListNode tempA; // greater list
         ListNode tempB;

         if (lengthA < lengthB) {
             tempA = headB;
             tempB = headA;
         }else {
             tempA = headA;
             tempB = headB;
         }

         int totalDifference = Math.abs(lengthA - lengthB);

         for (int i = 0; i < totalDifference; i++) {
             tempA = tempA.next;
         }

         while (tempA != null && tempB != null) {
             if (tempA == tempB) {
                 return tempA;
             }
             tempA = tempA.next;
             tempB = tempB.next;
         }
        return null;
    }

    public static int ListofLength (ListNode head) {
       if (head == null) {
           return -1;
       }

       ListNode  temp = head;

       int count  =0;

       while (temp != null) {
           count++;
           temp = temp.next;
       }

       return count;
    }

    public static ListNode genList (ListNode head, int [] arr) {
       if (head == null) {
           head = new ListNode(arr[0]);
       }

       ListNode temp = head;

        for (int i = 1; i< arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;

        }
        return head;
    }

    public  static ListNode middleNode(ListNode head) {
         if (head == null)  {
             return head;
         }

         ListNode slow = head;
         ListNode  fast = head;

         while ( fast !=null &&fast.next != null) {
             slow = slow.next;
             fast = fast.next.next;
         }

         return slow;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Base case: empty list or single-node list.
        }

        // Recursively reverse the rest of the list
        ListNode reversedListHead = reverseList(head.next);

        // Reverse the current node's pointer
        head.next.next = head;
        head.next = null;

        return reversedListHead; // Return the new head of the reversed list.
    }

    public static void printlist (ListNode head) {
       if (head == null ){
           return;
       }

       ListNode temp = head;

       while (temp != null) {
           System.out.print(temp.val + "->");
           temp = temp.next;
       }

        System.out.println("Null");
   }

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
      int [] arr1 = {4,1,8,4,5};
      ListNode listA = genList(null, arr1);
      printlist(reverseList(listA));

    }
}
