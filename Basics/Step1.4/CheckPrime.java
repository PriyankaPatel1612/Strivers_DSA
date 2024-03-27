import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scan.nextInt();
        //System.out.println(checkPrime(num));
        System.out.println(checkPrime2(num));
    }

    static boolean checkPrime(int num){
        int flag = 0;
        if(num==1)
        return false;
        for(int i=2 ; i<num ; i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }

        if(flag==0){
            return true;
        }else{
            return false;
        }
    }

    //optimal solution
    static boolean checkPrime2(int num){
        int count=0;
        for(int i=1 ; i<=(int)Math.sqrt(num) ; i++){
            if(num%i==0){
                count++;
                if((num/i)!=i){
                    count++;
                }
            }
        }

        if(count==2)
            return true;
        else
         return false;
    }
}

