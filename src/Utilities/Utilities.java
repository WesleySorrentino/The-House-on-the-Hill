package Utilities;

import Assets.Location;

import java.io.*;
import java.util.Scanner;

public class Utilities {
    /**
     * enter the file path where the .txt file is located, DONT ADD \\
     */
    public static String slowTextScroll(String filePath) {
        return slowTextScroll(filePath,800);
    }

    /**
     *
     * @param filePath enter the file path where the .txt file is located, DONT ADD \\
     * @param milliseconds enter the amount of milliseconds you want it display at
     */
    public static String slowTextScroll(String filePath, long milliseconds) {
        File file = new File("src\\Dialogue\\"+filePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                BufferedReader bufReader = new BufferedReader(new FileReader(file));
                try {
                    if ((bufReader.readLine()) == null) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(scanner.nextLine());
                try {
                    Thread.sleep(milliseconds);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * @param encounter Pass the encounter method
     * @param locations enter the available locations
     */
    public static int locationSelector(int encounter, Location... locations) {
        for (Location l : locations) {
            if (encounter != -1 && encounter == l.getDoor().getDoorId()) {
//              Displays the selected locations dialogue
                l.getDialogue();

                return l.getDoor().getDoorId();
            }
        }

        return -1;
    }
}