/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battleship;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author pamelamurillo
 */
public class GridMaker {
    
    ArrayList<GridPanel> grid;

    public GridMaker() {
        grid = new ArrayList<>();
    }

    
    public ArrayList<GridPanel> getGridPlayer() {
        return grid;
    }

    
    public void setGridPlayer(ArrayList<GridPanel> gridPlayer) {
        this.grid = gridPlayer;
    }
    
    
    public void makeGrid(String namePlayer, int width, int lenght) {
        for (int i = 0; lenght > i; i++) {
            for (int j = 0; width > j; j++) {
                grid.add(new GridPanel("/", "empty", namePlayer, i, j));
            }
        }
    }
    
    
    public void automaticGrid() { //Here is the grid filled with ships automatically
        System.out.println("Aun no se ha rellenado nada de esto");
    }
    
    
    public void newAttack() { //Here goes the attack command from the AI
        System.out.println("Aun no se ha rellenado nada de esto");
    }
    
    
     public static void main(String[] args) {
         GridMaker gridMaker = new GridMaker();
         gridMaker.makeGrid("Pame", 10, 10);
         System.out.println(gridMaker.getGridPlayer().toString());
         
     }
     
     
}

