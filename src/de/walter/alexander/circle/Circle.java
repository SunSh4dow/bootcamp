package de.walter.alexander.circle;

public class Circle extends Figure implements Drawable {

    private int radius;

    public Circle(int x, int y) {
        super(x, y);
    }

    public Circle(int radius, int x, int y) {
        super(x, y);
        this.radius = radius;
        System.out.println(toString());
    }
public void draw(){
        System.out.println(toPrettyString());
}
    @Override
    public String toPrettyString() {
        return "Circle{" +
                "radius=" + radius +
                "x="+getX() +
                "x="+getY() +
                '}';
    }
}
