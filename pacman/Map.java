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
        
        public boolean didWin() {
            return numberOfDots <= 0;
        }
    
        public ArrayList <ArrayList <Entity>> entities = new ArrayList();
        public Player player;
        public ArrayList <Ghost> ghosts = new ArrayList();
        
        final public void display() {
            for(int a = 0; a < 15; a++) {
                System.out.println();
            }
            ArrayList <ArrayList <Character> > toDisplay = new ArrayList();
            for(int a = 0; a < entities.size(); a++) {
                ArrayList<Character> tempRow = new ArrayList();
                for(int b = 0; b < entities.get(a).size(); b++) {
                    tempRow.add(entities.get(a).get(b).getDisplayChar());
                }
                toDisplay.add(tempRow);
            }
            for(Ghost ghost : ghosts) {
                toDisplay.get(ghost.pos.y).set(ghost.pos.x, ghost.getDisplayChar());
            }
            updateSuper();
            if(isSuper) {
                toDisplay.get(player.pos.y).set(player.pos.x, 'C');
            } else {
            toDisplay.get(player.pos.y).set(player.pos.x, player.getDisplayChar());
            }
            
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
                ArrayList<Entity> tempRow = new ArrayList();
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
            else {
                input = "none";
            }
            
            return input;
        }
        
        private boolean isSuper;
        private int turnNumberAtSuperStart;
        
        private void updateSuper() { //called by display()
            if(isSuper && numberOfTurns > turnNumberAtSuperStart+15) {
                isSuper = false;
            }
        }
        
        private void handleAction(String action) {
            if(action.equals("subtractDot")) {
                numberOfDots--;
            } else if(action.equals("super")) {
                numberOfDots--;
                isSuper = true;
                turnNumberAtSuperStart = numberOfTurns;
            }
            
        }
        
        private int numberOfTurns;
        
        public void doTurn() {
            handleAction(player.doMove(getInput(), entities));
            if(numberOfTurns < 16 && numberOfTurns%5 == 0) { // Release a ghost every 5 turns
                ghosts.get(numberOfTurns/5).exitFromBox(entities);
            }
            
            ArrayList<Pos> ghostPoss = new ArrayList();
            for(Ghost ghost: ghosts) { // fill arraylist with ghost positions for use in ghost movement ai
                ghostPoss.add(ghost.pos);
            }
            for(Ghost ghost: ghosts) { //if player move to ghost
            if(player.pos.x == ghost.pos.x && player.pos.y == ghost.pos.y) {
                    if(isSuper) {
                        ghost.kill(entities);
                    } else {
                        player.kill(entities);
                    }
                }
            }
            
            for (Ghost ghost : ghosts) { // handle ghost movement
                if(ghost.isOutOfBox())
                ghost.doMove(ghost.determineMove(player.pos, ghostPoss, isSuper, entities), entities);
                if(player.pos.x == ghost.pos.x && player.pos.y == ghost.pos.y) { //if ghost move to player
                    if(isSuper) {
                        ghost.kill(entities);
                    } else {
                        player.kill(entities);
                    }
                }
            }
            numberOfTurns++;
        }
        
        public Map() {
            fillEmptyMapFromFile();
            countDots();
            player = new Player(13, 23);
            ghosts.add(new Ghost(11, 13));
            ghosts.add(new Ghost(16, 13));
            ghosts.add(new Ghost(11, 15));
            ghosts.add(new Ghost(16, 15));
            numberOfTurns = 0;
            isSuper = false;
        }
        
    }