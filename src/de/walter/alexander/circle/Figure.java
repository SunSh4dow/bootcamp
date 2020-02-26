package de.walter.alexander.circle;

public abstract class Figure {

    private int x;
    private int y;
    Figure(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public abstract String toPrettyString();
}
