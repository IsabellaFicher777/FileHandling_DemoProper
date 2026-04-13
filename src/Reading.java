import java.io.*;
import java.util.Scanner;

public class Reading
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File myFile = new File("fellowship.txt");

        // Check to ensure the file does exit
        if(!myFile.exists())
        {
            System.out.println("File does not exist");
            return;
        }

        Scanner inputFile = new Scanner(myFile);

        System.out.println("Members of the Fellowship:");
        System.out.println("==========================");

        int count = 0;

        while(inputFile.hasNextLine())
        {
            count++;
            inputFile.nextLine();
        }

        inputFile.close();

        System.out.println("Total members: " + count);
    }
}
