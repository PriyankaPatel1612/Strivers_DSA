public class RecursionEx{
    static int count = 0;
    public static void main(String[] args) {
        print();
    }

    //recursive function
    static void print(){
        if(count==5)  //base condition
        return;
        System.out.println(count);
        count++;
        print();  
    }
}