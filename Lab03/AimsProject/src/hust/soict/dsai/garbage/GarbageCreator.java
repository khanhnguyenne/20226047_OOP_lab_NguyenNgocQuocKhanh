package hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "test.txt"; // Ensure this file exists and is large
        byte[] inputBytes;
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char) b;
            }
            endTime = System.currentTimeMillis();
            System.out.println("Time for String concatenation: " + (endTime - startTime) + "ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
