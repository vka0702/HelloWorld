package com.qa.RobotsCity;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RobotsReader {
    public static void readFromFile() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));

        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }
        String everything = sb.toString();
        System.out.println(everything);


    }
}
