import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementHashMapUsingArrayOfLinkedList {
    static class HashMap<K,V>{
       
       private class Node{
        K key;
        V value;

        private Node(K key, V value){
            this.key = key;
            this.value = value;
        }
       }

       private int n; //nodes
       private int N; //no. of buckets
       private LinkedList<Node> buckets[];

       @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            //initialization array
            this.buckets = new LinkedList[4];
            //initialize empty LL 
            for(int i=0 ; i<buckets.length ; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        //hash function
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi)%N;
        }

        //search data index (di)
        private int searchInLL(K key, int di){
            LinkedList<Node> ll = buckets[di];
            for(int i=0 ; i<ll.size() ; i++){
                if(ll.get(i).key==key){
                    return i; //di
                }
            }
            return -1;
        }

        //rehashing
        private void rehash(){
            //store old array --> resize double size array -->
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            //initalize empty list
            for(int i=0 ; i<buckets.length ; i++){
                buckets[i] = new LinkedList<>();
        }

        //intialize nodes

        //traverse buckets
        for(int i=0 ; i<buckets.length ; i++){
            //taking (i)th bucket
            LinkedList<Node> ll = oldBucket[i];
            //traverse ith LL
            for(int j=0 ; j<ll.size() ; j++){
                //nodes
                Node node = ll.get(j);
                put(node.key, node.value);
            }
        }
        }


        //------------------------------put()------------------------------//
        //key-->exist -->(update) -->find (bi) index using hash function -->find data index(di) -->value update
        //key-->not exist -->(add) -->find (bi) index using hash function --> add node
        private void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);
            
            if(di==-1){          //if not exist(add)
                buckets[bi].add(new Node(key, value));
                n++;
            }else{               //exist(update)
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            //lambda
            double lambda = (double)n/N;
            if(lambda>2.0){
                //rehash
                rehash();
            }
        }

        //------------------------------get()------------------------------//
        //key-->exist-->return key
        //key-->doesn't exist-->return null
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);
            
            if(di==-1){          //if not exist(add)
                return null;
            }else{               //exist(update)
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        //------------------------containsKey()------------------------//
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);
            
            if(di==-1){          //if not exist(add)
                return false;
            }else{               //exist(update)
                return true;
            }
        }
        //--------------------------remove()------------------------------//
        //if exist-->remove-->return value
        //if not --> return null
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);
        
            if(di==-1){          //if not exist(add)
                return null;
            }else{               //exist(update)
                Node node =  buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        //--------------------------isEmpty(------------------------------//
        public boolean isEmpty(){
            return n==0;
        }

        //--------------------------keySet()------------------------------//
        public ArrayList<K> keySet(){
            //declare array list
            ArrayList<K> keys = new ArrayList<>();

            //traverse buckets
            for(int i=0 ; i<buckets.length ; i++){
                //taking (i)th list
                LinkedList<Node> ll = buckets[i];
                //traverse data nodes
                for(int j=0 ; j<ll.size() ; j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }

            return keys;
        }
    }

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        //put()
        hm.put("India", 120);
        hm.put("China", 150);
        hm.put("US", 50);
        
        //get()
        System.out.println(hm.get("India"));
        //containsKey()
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.containsKey("Canada"));
        //remove()
        System.out.println(hm.remove("Canada"));
        System.out.println(hm.remove("US"));
        
        //isEmpty()
        System.out.println(hm.isEmpty());

        //keySet()
        ArrayList<String> keys = hm.keySet();
        for(int i=0; i<keys.size(); i++) {
        System.out.println(keys.get(i)+" "+hm.get(keys.get(i)));
        }    
 
    }
}
