import java.util.HashSet;
import java.util.Iterator;
public class LearnHashSet {
    public static void main(String[] args) {

        //create
        HashSet<Integer> set = new HashSet<>();

        //add (this is not neccessary that order will be same)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);  //it will not be added because set contains unique elements

        //size
        System.out.println("size=" + set.size());

        //search
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain 6");
        }

        //delete
        set.remove(1);

        //print
        System.out.println(set);

        //iterator- next(),hasNext()
        Iterator it =  set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //is empty
        if(set.isEmpty()){
            System.out.println("set is empty");
        }else{
            System.out.println("set is not empty");
        }
    }
}
