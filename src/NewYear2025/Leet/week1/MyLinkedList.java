package NewYear2025.Leet.week1;

public class MyLinkedList {

    class Node {
        int val;
        Node next;

        public Node (int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;
    public int listLength = 0;
    public MyLinkedList() {

    }



    public int get(int index) {
        if(index < 0 || index >= listLength)
            return -1;

        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        if (head == null || listLength == 0) {
            head = tail = new Node(val);
            listLength++;
            return;
        }

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        listLength++;
    }

    public void addAtTail(int val) {
     if (tail == null || head == null) {
         head = tail = new Node(val);
         listLength++;
         return;
     }

        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        listLength++;
    }

    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
       if (index > listLength ||  index  < 0) {
           return;
       }

       if (listLength == index) {
           tail.next = newNode;
           tail = newNode;
           listLength++;
           return;
       }

       if (index == 0 && listLength > index) {
           Node temp = head.next;
           head.next = newNode;
           newNode.next = temp;
           listLength++;
           return;
       }

       Node temp = head;
       for (int i = 1; i < listLength; i++) {
           if (index-1 == 0) {
               Node temp2 = head.next;
               head.next = newNode;
               newNode.next = temp2;
               listLength++;
               break;
           }

           if (i == index-1) {
               Node temp2 = temp.next;
               temp.next = newNode;
               newNode.next= temp2;
               listLength++;
               break;
           }
          temp = temp.next;
       }
    }

    public void deleteAtIndex(int index) {
        Node temp = head;
        if (index > listLength) {
            return;
        }

        if (index == 0) {
            head = head.next;
            listLength--;
        }

        for (int i = 1; i < listLength; i++) {

            if (index-1 == 0 ) {
                head.next = head.next.next;
                listLength--;
                break;
            }

            if (i == index-1) {
                temp.next = temp.next.next;
                listLength--;
                break;
            }

            temp = temp.next;
        }
    }



    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addAtHead(1);
        ll.addAtHead(2);
        ll.addAtTail(3);
        ll.addAtTail(4);
        ll.deleteAtIndex(1);
        MyLinkedList.Node temp   = ll.head;
        while (temp != null ) {
            System.out.print(temp.val + " " + "-> ");
            temp = temp.next;
        }

    }
}