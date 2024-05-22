public class RevLinkedListRecursiveApproach {
    //head
    Node head;
    private int size;

    RevLinkedListRecursiveApproach(){
        size=0;
    }

    //class node
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //addFirst
    public void addFirst(int data){
        //create node
        Node newNode = new Node(data);

        //corner case
        if(head==null){
            head = newNode;
            return;
        }
        //add
        newNode.next = head;
        head = newNode; 
    }

    //add last
    public void addLast(int data){
        //create node
        Node newNode = new Node(data);

        //corner case
        if(head == null){
            head = newNode;
            return;
        }

        //add last
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print list
    public void printList(){
        //corner case
        if(head==null){
            System.out.println("List is empty!");
            return;
        }
        //print
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    //reverse recursive
    public Node revRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = revRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        RevLinkedListRecursiveApproach LL = new RevLinkedListRecursiveApproach();
        LL.addLast(1);
        LL.addLast(2);
        LL.addLast(3);
        LL.addLast(4);
        LL.addLast(5);
        LL.printList();

        //reverse linked list
        LL.head = LL.revRecursive(LL.head);
        System.out.println();
        LL.printList();
    }
}
