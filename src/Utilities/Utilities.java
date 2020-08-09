package Utilities;

import Assets.Location;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Utilities {
    /**
     * @param text input the text you want display slowly
     */
    public static String slowTextScroll(String text) {
        return slowTextScroll(text,800);
    }

    /**
     *
     * @param text input the text you want display slowly
     * @param milliseconds enter the amount of milliseconds you want it display at
     */
    public static String slowTextScroll(String text, long milliseconds) {
        BufferedReader bufReader = new BufferedReader(new StringReader(text));
        String line = null;
        while (true) {
            try {
                if ((line = bufReader.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(line);
            try {
                Thread.sleep(milliseconds);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    /**
     * @param encounter Pass the encounter method
     * @param locations enter the available locations
     */
    public static void locationSelector(int encounter, Location... locations) {
        for (Location l : locations) {
            if (encounter != -1 && encounter == l.getDoor().getDoorId()) {
//              Displays the selected locations dialogue
                l.getDialogue();
                break;
            }
        }
    }
}
