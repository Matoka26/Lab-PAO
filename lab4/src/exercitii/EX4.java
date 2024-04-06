package exercitii;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EX4 {
    public static void main(String[] args){
        int arr[] = {1,1,2,2,4,4,3,3,1,6};

        Set<Integer> dic = new HashSet<>();
        for(int i:arr){
            dic.add(i);
        }

        int aux[] = new int[dic.size()];
        int i = 0;
        for(Integer n:dic){
            aux[i++] = n;
        }

        arr = aux;
        System.out.println(Arrays.toString(arr));
    }
}
