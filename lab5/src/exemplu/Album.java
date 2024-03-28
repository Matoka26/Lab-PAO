package exemplu;

import java.util.ArrayList;

public class Album implements Track{
    String albumName;
    ArrayList<Song> songs;

    public Album(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public void printName(){
        System.out.println(albumName);
    }
}

