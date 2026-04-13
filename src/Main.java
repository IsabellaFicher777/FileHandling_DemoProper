import java.io.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        /* File newFile = new File("onering.txt");

        if(newFile.exists())
        {
            System.out.println("File already exists!");
            return;
        }

        PrintWriter outputFile = new PrintWriter(newFile);

        outputFile.println("For the Fans!");

        outputFile.close();

        System.out.println("Data was written to the file.");
        */

        File charcterFile = new File("characterOfLOTR.txt");
        PrintWriter characters = new PrintWriter(charcterFile);
        Scanner userInput = new Scanner(System.in);

        while(true)
        {
           System.out.println("Enter a character: ");

           String character = userInput.nextLine();

           if(!character.equals("exit"))
           {
               characters.println(character);
           }else
           {
               break;
           }
        }

        characters.close();

        System.out.println("Success!");
    }
}
