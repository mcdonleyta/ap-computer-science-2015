import substitutioncipher.*;

import java.util.ArrayList;

public class SubstitutionCipher {
    
    public static void main(String[] args) {
        ReadFile fr = new ReadFile();
        ArrayList<String> message = fr.readFile("message.txt");
        ArrayList<String> cipheredMessage = new ArrayList();
        
        for(int a = 0; a < message.size(); a++) {
            String cipheredLine = "";
            for(int b = 0; b < message.get(a).length(); b++) {
                switch(message.get(a).charAt(b)) {
                    case 'a':
                        cipheredLine += 'b';
                        break;
                    case 'b':
                        cipheredLine += 'c';
                        break;
                    case 'c':
                        cipheredLine += 'd';
                        break;
                    case 'd':
                        cipheredLine += 'e';
                        break;
                    case 'e':
                        cipheredLine += 'f';
                        break;
                    case 'f':
                        cipheredLine += 'g';
                        break;
                    case 'g':
                        cipheredLine += 'h';
                        break;
                    case 'h':
                        cipheredLine += 'i';
                        break;
                    case 'i':
                        cipheredLine += 'j';
                        break;
                    case 'j':
                        cipheredLine += 'k';
                        break;
                    case 'k':
                        cipheredLine += 'l';
                        break;
                    case 'l':
                        cipheredLine += 'm';
                        break;
                    case 'm':
                        cipheredLine += 'n';
                        break;
                    case 'n':
                        cipheredLine += 'o';
                        break;
                    case 'o':
                        cipheredLine += 'p';
                        break;
                    case 'p':
                        cipheredLine += 'q';
                        break;
                    case 'q':
                        cipheredLine += 'r';
                        break;
                    case 'r':
                        cipheredLine += 's';
                        break;
                    case 's':
                        cipheredLine += 't';
                        break;
                    case 't':
                        cipheredLine += 'u';
                        break;
                    case 'u':
                        cipheredLine += 'v';
                        break;
                    case 'v':
                        cipheredLine += 'w';
                        break;
                    case 'w':
                        cipheredLine += 'x';
                        break;
                    case 'x':
                        cipheredLine += 'y';
                        break;
                    case 'y':
                        cipheredLine += 'z';
                        break;
                    case 'z':
                        cipheredLine += 'a';
                        break;
                    case ' ':
                        cipheredLine += ' ';
                        break;
                    default:
                        cipheredLine += '?';
                        break;
                }
            }
            cipheredMessage.add(cipheredLine);
        }
        
        WriteFile wf = new WriteFile();
        wf.writeFile("cipheredMessage.txt", cipheredMessage);
        
    }
    
}