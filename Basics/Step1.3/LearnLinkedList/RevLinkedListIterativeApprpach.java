
public class RevLinkedListIterativeApprpach {
    //head
    Node head;
    private int size;

    RevLinkedListIterativeApprpach(){
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

    //reverse iterative
    public void revIterate(){
        if(head == null || head.next == null) {
            return;
        } 
        //three pointers (prevNode, currNode, nextNode)
        Node prevNode = head;
        Node currNode = head.next;
        //iterate
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public static void main(String[] args) {
        RevLinkedListIterativeApprpach LL = new RevLinkedListIterativeApprpach();
        LL.addLast(1);
        LL.addLast(2);
        LL.addLast(3);
        LL.addLast(4);
        LL.addLast(5);
        LL.printList();

        //reverse linked list
        LL.revIterate();
        System.out.println();
        LL.printList();
    }
}
