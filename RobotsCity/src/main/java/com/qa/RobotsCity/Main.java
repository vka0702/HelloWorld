package com.qa.RobotsCity;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //RobotsCity robotsCity = new RobotsCity();
        //robotsCity.buildCity();
        int[][] mass = new int[8][7];


        try {
            RobotsReader.readFromFile();
        }
        catch (FileNotFoundException nofile) {
            System.out.println("No file");
        }
    }
}
