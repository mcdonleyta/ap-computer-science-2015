package pacman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Character;

public class Map {
        
        private int numberOfDots;
        
        private void countDots() {
            numberOfDots = 0;
            for(int a = 0; a < entities.size(); a++) {
                for(int b = 0; b < entities.get(a).size(); b++) {
                    if(entities.get(a).get(b).getDisplayChar() == '.' || entities.get(a).get(b).getDisplayChar() == '@') {
                        numberOfDots++;
                    }
                }
            }
        }
        
        public void decrementNumberOfDots() {
            numberOfDots--;
        }
        
        public boolean didWin() {
            return numberOfDots <= 0;
        }
    
        public List <List <Entity>> entities = new ArrayList();
        public Player player;
        public List <Ghost> ghosts = new ArrayList();
        
        final public void display() {
            List <List <Character> > toDisplay = new ArrayList();
            for(int a = 0; a < entities.size(); a++) {
                List<Character> tempRow = new ArrayList();
                for(int b = 0; b < entities.get(a).size(); b++) {
                    tempRow.add(entities.get(a).get(b).getDisplayChar());
                }
                toDisplay.add(tempRow);
            }
            for (Ghost ghost : ghosts) {
                toDisplay.get(ghost.pos.y).set(ghost.pos.x, ghost.getDisplayChar());
            }
            toDisplay.get(player.pos.y).set(player.pos.x, player.getDisplayChar());
            
            for(int a = 0; a < toDisplay.size(); a++) {
                for(int b = 0; b < toDisplay.get(a).size();b++) {
                    System.out.print(toDisplay.get(a).get(b));
                }
                System.out.println();
            }
        }
        
        private void fillEmptyMapFromFile() {
            try{//read map from file
            BufferedReader reader = new BufferedReader(new FileReader(new File(getClass().getResource("BlankBoard.txt").getPath())));
            String line;
            while((line = reader.readLine()) != null) { //store each line in line and loop so long as line is not null (out of lines in file)
                List<Entity> tempRow = new ArrayList();
                for(int a = 0; a < line.length(); a++) {
                    switch(line.charAt(a)) {
                        case 'w':
                            tempRow.add(new Wall());
                            break;
                        case '.':
                            tempRow.add(new Dot());
                            break;
                        case '*':
                            tempRow.add(new Superpill());
                            break;
                        case 'm':
                            tempRow.add(new Membrane());
                            break;
                        default:
                            tempRow.add(new Entity());
                            break;
                    }
                }
                entities.add(tempRow);
            }
            }catch(Exception e) {
            e.printStackTrace(System.out);
            }
        }
        
        private static String getInput() {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            if(input.equals("w")) {input = "up";} else
            if(input.equals("a")) {input = "left";} else
            if(input.equals("s")) {input = "down";} else
            if(input.equals("d")) {input = "right";}
            else {input = "none";
            }
            
            return input;
        }
        
        public void doTurn() {
            player.doMove(getInput());
            for (Ghost ghost : ghosts) {
                //ghost.doMove(someLogicToDetermineDirection());
            }
        }
        
        Map() {
            fillEmptyMapFromFile();
            countDots();
            player = new Player(13, 23);
            ghosts.add(new Ghost(11, 13));
            ghosts.add(new Ghost(16, 13));
            ghosts.add(new Ghost(11, 15));
            ghosts.add(new Ghost(16, 15));
        }
        
    }