package HW2.geometry;
import java.util.*;

public class Point {

    private float x;
    private float y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p) {
        float dX = this.x - p.x;
        float dY = this.y - p.y;
        return (float) Math.sqrt(dX * dX + dY * dY);
    }

    public boolean equals(Point p) {
        return (this.x == p.x) && (this.y == p.y);
    }

}
