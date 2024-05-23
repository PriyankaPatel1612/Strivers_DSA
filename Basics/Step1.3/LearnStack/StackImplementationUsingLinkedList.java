class StackImplementationUsingLinkedList{
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack{
        static Node head = null;
        
        //push operation
        static void push(int data){
            Node newNode  = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            //push
            newNode.next = head;
            head = newNode;
        }
        //check is empty
        public static boolean isEmpty(){
            return head==null;
        }
        //pop operation
        public static int pop(){
            //corner case
            if(isEmpty()){
                return -1;
            }
            //pop
            Node top = head;
            head = head.next;
            return top.data;
        }
        //peek operation
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            //peek
            Node top = head;
            return top.data;    
        }
    }
    public static void main(String[] args) {
       Stack s = new Stack();        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        
        while(!s.isEmpty()){
            System.out.println("top data: " + s.peek());
            System.out.println("poped : " + s.pop());
        }
    }
}