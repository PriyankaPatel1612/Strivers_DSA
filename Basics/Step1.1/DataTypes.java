/*Data type refers to the type of value a variable has and the way the computer interprets it.



Each data type has a different size. You’ve studied 5 different data types and the sizes of the data types:

Integer: 4 bytes
Long: 8 bytes
Float: 4 bytes
Double: 8 bytes
Character: 1 byte


You’re given a data type. Print its size in bytes. */

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.next();
        System.out.println(dataTypes(type));
    }
    public static int dataTypes(String type) {
        if(type.equals("Integer")){
            return 4;

        }else if(type.equals("Long")){
            return 8;
            
        }else if(type.equals("Float")){
            return 4;

        }else if(type.equals("Double")){
            return 8;

        }else if(type.equals("Character")){
            return 1;

        }else {
            return -1;
        }

    }
}
