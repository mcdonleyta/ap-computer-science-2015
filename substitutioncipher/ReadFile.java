package substitutioncipher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFile {
    
    public ArrayList<String> readFile(String fileName) {
        ArrayList<String> fileContents = new ArrayList();
        try{
        BufferedReader reader = new BufferedReader(new FileReader(new File(getClass().getResource(fileName).getPath())));
            String line;
            while((line = reader.readLine()) != null) {
                fileContents.add(line);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return fileContents;
    }
    
}