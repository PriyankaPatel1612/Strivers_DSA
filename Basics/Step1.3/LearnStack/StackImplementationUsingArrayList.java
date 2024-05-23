import java.util.ArrayList;

public class StackImplementationUsingArrayList {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();

        //push
        public void push(int data){
            //push 
            list.add(data);
            System.out.println("Pushed!");
        }

        //is empty
        public boolean isEmpty(){
            return list.size()==0;
        }

        //pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            //pop
            int top = list.remove(list.size()-1);
            System.out.println("Poped!");
            return top;
        }

        //peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            //pop
            int top = list.get(list.size()-1);
            return top;
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
            s.pop();
        }
    }
}
