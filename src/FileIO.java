import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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


    }

}
