package substitutioncipher;

import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteFile {
    
    public void writeFile(String fileName, ArrayList<String> data) {
        try{
        PrintWriter writer = new PrintWriter(fileName, "UTF-8");
        
        for(String line : data) {
            writer.println(line);
        }
        
        writer.close();
        
        
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}