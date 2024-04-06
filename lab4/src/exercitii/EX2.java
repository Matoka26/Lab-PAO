package exercitii;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        String str = console.nextLine().toLowerCase();

        int spaces = 0;
        int digits = 0;
        int vowels = 0;
        int cons = 0;

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ' ')
                spaces += 1;
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
                digits += 1;
            if(str.charAt(i) == 'a'
                || str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u')
                vowels += 1;
            else
                if(str.charAt(i) >= 'b' && str.charAt(i) <= 'z')
                    cons += 1;
        }

        System.out.println("Output:\nVowels: " + vowels);
        System.out.println("Consonants: " + cons);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
