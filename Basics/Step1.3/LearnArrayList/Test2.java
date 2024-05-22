
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        //list 1
        List<String> list1 = new ArrayList<>(Arrays.asList("Mango","Banana","apple","cherry","Hola"));
        System.out.println(list1);
        //list 2
        List<String> list2 = new ArrayList<>(Arrays.asList("Mango","Banana","Hola"));
        System.out.println(list2);

        //clear()
        list2.clear();
        System.out.println(list2);
        //addAll
        list2.addAll(list1);
        System.out.println(list2);
        //containsAll
        System.out.println(list2.containsAll(list1));
        //get()
        System.out.println(list1.get(4));
        //iterate
        list1.iterator();
        //remove()
        list2.remove(4);
        System.out.println(list2);    
    }
}
