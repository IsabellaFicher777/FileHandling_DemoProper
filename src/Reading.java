import java.io.*;
import java.util.Scanner;

public class Reading
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File myFile = new File("fellowship.txt");

        if(!myFile.exists())
        {
            System.out.println("File does not exist");
            return;
        }

        Scanner inputFile = new Scanner(myFile);
    }
}
