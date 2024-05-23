//Enqueue - add - O(1)
//Dequeue - remove - O(n)
//Peek - front - O(n)
class QueueImplementationUsingArray {
    public static class Queue{
        static int[] arr;
        static int size;
        static int rear;

        Queue(int size){
            this.size = size;
            arr = new int[size];
            rear = -1;
        }

        //is empty
        static boolean isEmpty(){
            return rear==-1;
        }
        //is full
        static boolean isFull(){
            return rear==size-1;
        }
        //enqueue
        static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        //dequeue
        static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty!!");
                return -1;
            }
            int front = arr[0];
            for(int i=0 ; i<size-1 ; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        //peek
        static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty!!");
                return -1;
            }
            return arr[0];
        }
        
    }
    public static void main(String[] args) {
        
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            System.out.println(q.remove());
        }
    }
}