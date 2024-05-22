//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

import java.util.Arrays;
import java.util.LinkedList;

public class Ques1 {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>(Arrays.asList(1, 5, 7, 3 , 8, 2, 3));
        for(int i=0 ; i<li.size() ; i++){
            if(li.get(i)==7){
                System.out.println("index = " + i);
            }
        }
        
    }
}
