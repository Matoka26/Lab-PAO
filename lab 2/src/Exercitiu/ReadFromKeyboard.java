package Exercitiu;
import java.awt.image.AbstractMultiResolutionImage;
import java.util.Scanner;
import java.util.HashMap;

public class ReadFromKeyboard {

    private static Scanner keyboard = new Scanner(System.in);
    private static DataStorage pojos;

    private static void help(){
        System.out.println("Accepted commands:\n" +
                "\t\thelp: Instructions on how to use the application\n" +
                "\t\tupdate: Update data. Can receive two parameters: username and sold.\n" +
                "\t\tdelete: Delete the user's data.  Receive the username.\n" +
                "\t\tquit: Close the application.\n");
    }

    private static void update(){

        System.out.print("Username >>> ");
        String username = keyboard.nextLine();

        System.out.print("Sold >>> ");
        int sold = keyboard.nextInt();
        keyboard.nextLine();

        POJO obj = new POJO(username, sold);
        pojos.put(username, obj);

        System.out.println("The sold was updated for user " + username + " " + sold + "\n");
    }

    public static void delete(){
        System.out.print("Username >>> ");
        String username = keyboard.nextLine();

        pojos.remove(username);
        System.out.println("Removed " + username + "\n");
    }

    public static void main(String[] args){

        boolean loop = true;
        String command;

        while(loop){
            System.out.print("Enter command >>> ");
            command = keyboard.nextLine();

            System.out.println("Command received: " + command);
            switch (command) {
                case "help" -> help();
                case "update" -> update();
                case "delete" -> delete();
                case "quit" -> loop = false;
            }
        }
    }
}
