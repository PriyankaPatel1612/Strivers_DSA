//addFirst
//addLast
//printList
//removeFirst
//removeLast

public class LinkedListImplementation1 {
    //head
    Node head;
    private int size;

    LinkedListImplementation1(){
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
            currNode = currNode.next;   //traverse
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

    //removeFirst
    public void removeFirst(){
        //corner case
        if(head==null){
            System.out.println("List is already empty!");
        }
        //remove
        head = head.next;
        //size decrease
        size--;
    }

    //removeLast
    public void removeLast(){
        //corner case
        if(head==null){
            System.out.println("List is already empty!");
        }
        //size decrease
        size--;
        //remove
        Node secondLastNode = head;
        Node lastNode = secondLastNode.next;
        while(lastNode.next != null){
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }
        secondLastNode.next = null;
    }

    public int getSize(){
        return size;
    }

    //main
    public static void main(String[] args) {
        LinkedListImplementation1 list = new LinkedListImplementation1();
        list.addFirst(23);
        list.addFirst(67);
    
        list.addLast(89);
        list.addFirst(22);

        list.removeFirst();
        list.removeLast();

        list.addLast(99);
        list.removeLast();
        // list.removeLast();

        list.printList();

        System.out.println();
        System.out.println(list.getSize());
    }  
}
