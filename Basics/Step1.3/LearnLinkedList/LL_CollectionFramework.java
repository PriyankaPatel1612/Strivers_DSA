//add
//addFirst
//addLast
//remove
//removeFirst
//removeLast
//using collection 

import java.util.LinkedList;

public class LL_CollectionFramework {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();

        //add (by default add on last)
        li.add(1);
        li.add(2);
        System.out.println(li);

        //addFirst
        li.addFirst(0);
        System.out.println(li);

        //addLAst
        li.addLast(3);
        li.addLast(4);
        System.out.println(li);

        //remove (delete last element)
        li.remove();
        System.out.println(li);

        //removeFirst
        li.removeFirst();
        System.out.println(li);

        //removeLast
        li.removeLast();
        System.out.println(li);
    }
}
