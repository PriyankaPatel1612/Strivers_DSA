//Enqueue - add - O(1)
//Dequeue - remove - O(1)
//Peek - front - O(1)
public class CircularQueueImplementationUsingArray {
    public static class Queue{
        static int[] arr;
        static int size;
        static int rear=-1;
        static int front=-1;

        Queue(int size){
            this.size = size;
            arr = new int[size]; 
        }

        //is empty
        static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        //is full
        static boolean isFull(){
            return (rear+1)%size == front;
        }
        //enqueue
        static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //for first element
            if(front==-1){
                front = 0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
            System.out.println("added ");
        }
        //dequeue
        static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty!!");
                return -1;
            }
            int result = arr[front];
            //for first element
            if(front==rear){
                front=-1;
                rear=-1;
            }else{
                front = (front+1)%size;
            } 
            return result;
        }
        //peek
        static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty!!");
                return -1;
            }
            return arr[front];
        }
        
    }
    public static void main(String[] args) {
        
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("front: " + q.peek());
        System.out.println("removed: "+ q.remove());
        q.add(6);
        System.out.println("front: " + q.peek());
        System.out.println("removed: "+ q.remove());
        q.add(7);
        System.out.println("front: " + q.peek());
        
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
