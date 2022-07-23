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
    
    private String namePlayer;
    private int heigth;
    private int width;
    private String text;
    private String state;
    
    ArrayList<GridPanel> grid;

    public GridMaker(String namePlayer, int heigth, int width, String text, String state) {
        grid = new ArrayList<>();
        this.namePlayer = namePlayer;
        this.heigth = heigth;
        this.width = width;
        this.text = text;
        this.state = state;
        makeGrid(heigth, width, text, state);
    }

    
    public ArrayList<GridPanel> getGridPlayer() {
        return grid;
    }

    
    public void setGridPlayer(ArrayList<GridPanel> gridPlayer) {
        this.grid = gridPlayer;
    }
    
    
    private void makeGrid(int heigth, int width, String text, String state) {
        for (int i = 0; heigth > i; i++) {
            for (int j = 0; width > j; j++) {
                grid.add(new GridPanel(text, state, namePlayer, i, j));
            }
        }
    }
    
    
    public void automaticGrid() { //Here is the grid filled with ships automatically
        System.out.println("Aun no se ha rellenado nada de esto");
    }
    
    
    public void newAttack() { //Here goes the attack command from the AI
        System.out.println("Aun no se ha rellenado nada de esto");
    }
    
}

