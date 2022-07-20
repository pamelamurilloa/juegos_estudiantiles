/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battleship;

/**
 *
 * @author pamelamurillo
 */
public class GridPanel {
    private String text; // This is the image it can have, it depends ont he state, it can change
    private String state; // This can be ship/destroyedShip/empty, it can change
    private String player; // Which player is this grid from, it cannot change once assigned
    private int coordX;
    private int coordY;

    public GridPanel(String text, String state, String player, int coordY, int coordX) {
        this.text = text;
        this.state = state;
        this.player = player;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    @Override
    public String toString(){
        return("(" + coordX + ", " + coordY + ")");
    }
    
}
