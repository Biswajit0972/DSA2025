package NewYear2025.Geeks.LinkedList;

public class MyLinkedList {

    private Node head = null;
    private Node tail = null;
    // Node class for the linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail =   newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a new node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail =   newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Method to delete a node with the given data
    public void deleteNode(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

   public  Node segregate(Node listHead) {
        if(listHead == null) {
            return null;
        }

        int zeroCount = 0;
        int onesCount = 0;
        int twoCount = 0;
         Node temp = listHead;
        while (temp != null) {  // treversel in ll O(n)
            if (temp.data == 0) {
                zeroCount++;
            } else if (temp.data == 1) {
                onesCount++;
            }else {
                twoCount ++;
            }
            temp = temp.next;
        }

         Node temp2 = listHead;

        // in worst case 1 or 0 or 2 comes all time , so O(n)

        while (zeroCount > 0) {
            temp2.data  = 0;
            temp2 = temp2.next;
            zeroCount--;
        }
        while (onesCount > 0) {
            temp2.data  = 1;
            temp2 = temp2.next;
            onesCount--;
        }
        while (twoCount > 0) {
            temp2.data  = 2;
            temp2 = temp2.next;
            twoCount--;
        }

        // TC =  O(n) +  O(n) = O(2n) = O(n)
       // SC= O(1) No use if extra space
        return listHead;
    }
    public  Node addOne(Node head) {
        if(head == null) {
            return null;
        }

        // code here.
        int total = 0;
        int count = 0;
        Node temp = head;
        while (temp != null) {
            int val = temp.data;
            total = (total * 10) + val;
            count++;
            temp = temp.next;
        }

        total += 1;
        Node customHead = head;
        Node prev = null;
        while (total != 0 && customHead != null) {
            int LastDigit = total % 10;
            customHead.data = LastDigit;
            prev = customHead;
            customHead = customHead.next;
            total /= 10;
        }

        // 👽 My logic is good for integer values not for greater value. so i need to think more effective approach
        while (total != 0)  {
            int LastDigit = total % 10;
            Node newNode = new Node(LastDigit);
            prev.next = newNode;
            prev = newNode;
            total /= 10;
        }

        return reverse(head);
    };

    public static Node reverse (Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node lastNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return lastNode;
    }

    public  Node lastHope (Node head) {
        if (head == null) {
            return null;
        }
        head = reverse(head); // O(n)
        Node temp = head;
        int carry = 1;

        while (temp != null) { // O(k)
            int sum = temp.data + carry;
            if (sum / 10 != 0) {
                carry = sum / 10;
            }
            temp.data = sum % 10;
            if (temp.next == null) {
                temp.next = new Node(carry);
                break;
            }
            temp = temp.next;
        }

        return reverse(head); // O(n)
    }
    public static void main(String[] args ) {
        MyLinkedList list = new MyLinkedList();
        list.insertAtBeginning(9);
        list.insertAtBeginning(9);
        list.insertAtBeginning(9);
        Node newli = list.lastHope(list.head);
        list.head = newli;
        list.printList();
    }
}