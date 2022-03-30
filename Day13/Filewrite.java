package Day13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Filewrite {
    public static void main(String[] args) {

        File myFile = new File("CWH_file2.txt");
        try {
            FileWriter fileWriter = new FileWriter("CWH_file2.txt");
            fileWriter.write("Code is one step solution for your all programming problems.\nKeep learning, Keep coding!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}