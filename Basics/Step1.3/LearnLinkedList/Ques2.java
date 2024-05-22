//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
import java.util.LinkedList;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedList<Integer> li = new LinkedList<>();
        int size = 50;
       
        for(int i=0 ; i<size ; i++){
            System.out.println("Enter number: ");
            li.add(scan.nextInt());
            System.out.println("want add more no. type yes : ");
            String check = scan.next();
            if(check.equals("yes")){
                continue;
            }else{
                break;

            }
        }

        //print
        System.out.println(li);

        int i=0;
        while(i<li.size()){
            if(li.get(i)>25){
                System.out.println("removed " + li.get(i));
                li.remove(i);
                i--;
            }
            i++;
        }
        
        System.out.println(li);
    }
}
