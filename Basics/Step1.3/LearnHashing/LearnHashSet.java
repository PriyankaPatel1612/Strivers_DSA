//add
//contains
//remove
//no duplicates
import java.util.HashSet;
import java.util.Iterator;
class LearnHashSet{
    public static void main(String[] args) {
        //create 
        HashSet<Integer> hs =new HashSet<>();
        //insert
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(1);
        //print
        System.out.println(hs);
        //search
        if(hs.contains(1)){
            System.out.println("set contains 1");
        }
        if(!hs.contains(1)){
            System.out.println("set doesn't contain 1");
        }
        //delete
        hs.remove(1);
        if(!hs.contains(1)){
            System.out.println("1 is removed, hence set doesn't contain 1");
        }
        //print
        System.out.println(hs);
        //size
        System.out.println(hs.size());

        //Iterator
        Iterator it =  hs.iterator();
        
        //next() -- return next value in starting pointing null 
        System.out.println(it.next());  //pointing 2
        System.out.println(it.next());  //pointing 3

        //hasNext() -- return true or false if next value is present
        System.out.println(it.hasNext()); //true
        it.next();  //pointing 4
        System.out.println(it.hasNext()); //true
        it.next();  //pointing 5
        System.out.println(it.hasNext()); //false(there is no next value)

        //printing value using iterator
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
    }
}