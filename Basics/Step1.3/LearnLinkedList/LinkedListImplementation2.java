//insert node in between
public class LinkedListImplementation2 {
    Node head;
    private int size;

    LinkedListImplementation2(){
        size=0;
    }

    class Node {
        int data;
        Node next;

        //create node
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //insert node at specific index
    //if null
    //at first(done)
    //at last(done)
    //in between
    public void insertNode(int index, int data){
        Node newNode = new Node(data);

        //corner case1
        if(index<0 || index>size){
            System.out.println("Invalid no.!!");
            return;
        }

        //corner case2
        if(head==null || index==0){
            newNode.next = head;            //head=null
            head = newNode;
            return;
        }

        //insert
        Node currNode = head;
        for(int i=1 ; i<size ; i++){
            if(index==i){
                Node nextNode = currNode.next; 
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
                
            }else{
                currNode = currNode.next;
            }
        }
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


    public static void main(String[] args) {
        LinkedListImplementation2 list = new LinkedListImplementation2();
        list.insertNode(0,33);
        // list.printList();

        list.insertNode(1, 77);
        list.insertNode(1, 89);
        list.insertNode(3, 67);
        list.printList();
    }
}
