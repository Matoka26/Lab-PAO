package Exercitiu;

import java.util.HashMap;

public class DataStorage {
    private static HashMap<String,POJO> storage = new HashMap<String,POJO>();

    public static void put(String username, POJO obj){
        storage.put(username, obj);
    }
    public static void remove(String username){
        storage.remove(username);
    }
}
