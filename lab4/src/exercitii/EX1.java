package exercitii;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args){
        Scanner console =  new Scanner(System.in);

        String str1 = console.nextLine().toLowerCase();
        String str2 = console.nextLine().toLowerCase();

        if(str1.equals(str2)){
            System.out.println(str1 + " = " + str2);
            return;
        }


        if(str1.compareTo(str2) < 0){
            System.out.println(str1 + " < " + str2);
            return;
        }

        System.out.println(str1 + " > " + str2);

    }

}
