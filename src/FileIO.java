import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    public static void main(String[] args) {

        String[] names = {"Manny", "Moe", "Jack"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file.\n");
            writer.write("Writing some more.");

            for (String name : names) {
                writer.write("\n" + name);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
