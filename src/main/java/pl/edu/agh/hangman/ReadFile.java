package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {

    private ArrayList<String> allWords;

    public ArrayList<String> fileReader(String filePath) throws IOException {

        String pathToFile = filePath;
        File in = new File(pathToFile);

        String line = "";
        String theWholeLine="";
        ArrayList<String> allTheWholeLines = new ArrayList<>();
        BufferedReader inReader = null;
        try {
            inReader = new BufferedReader(new FileReader(in));

            while ((line = inReader.readLine()) != null) {
                if (line.trim().length()>0){
                        allTheWholeLines.add(line.trim());
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            inReader.close();
        }
        return allTheWholeLines;
    }
}
