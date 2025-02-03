import java.util.Scanner;

public class CharacterHashing2 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = scan.next();

        //precompute
        int[] hash = new int[256];
        for(int i=0 ; i<str.length() ; i++){
            hash[str.charAt(i)]+=1;
        }

        //input queries
        System.out.print("Enter Queries: ");
        int q = scan.nextInt();

        while(q-- != 0){
            System.out.print("Enter Character : ");
            char character = scan.next().charAt(0);
            System.out.println(hash[character]);
        }

    }
}
