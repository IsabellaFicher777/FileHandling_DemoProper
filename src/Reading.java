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

        // Read and display each name
        while(inputFile.hasNextLine())
        {
            String line = inputFile.nextLine();
            if(line.contains(" - "))
            {
                String[] parts = line.split(" - ");

                if(parts[1].equals("Hobbit"))
                {
                    System.out.println(parts[0]);
                }
            }
        }

        inputFile.close();

        System.out.println("Hobbits of the fellowship: " + count);
    }
}
