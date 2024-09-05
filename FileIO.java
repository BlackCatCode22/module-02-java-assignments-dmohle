// dH 9/5/24

import java.io.*;

public class FileIO {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("myOutputFile.txt"));
            writer.write("\n this is a line of text");
            writer.write("\n second line of text");
            writer.write("\n 3rd line of text");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("myOutputFile.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(reader.readLine());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}