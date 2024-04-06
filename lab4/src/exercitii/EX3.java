package exercitii;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;

public class EX3 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        String str = console.nextLine();

        HashMap<Character, Integer> dic = new HashMap<>();

        for(int i = 0 ; i < str.length() ; i++){
            if( !dic.containsKey(str.charAt(i)))
                dic.put(str.charAt(i), 1);
            else
                dic.put(str.charAt(i), dic.get(str.charAt(i)) + 1);
        }

        TreeMap<Character,Integer> dicT = new TreeMap<>(dic);

        for(Map.Entry<Character,Integer> it : dicT.entrySet()){
            System.out.println(it.getKey() + ": " + it.getValue());
        }
    }
}
