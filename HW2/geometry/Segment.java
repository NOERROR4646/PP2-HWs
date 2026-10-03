package HW2.geometry;
import java.util.*;

public class Segment {

    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return this.p1;
    }

    public void setP1(Point p) {
        this.p1 = p;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP2(Point p) {
        this.p2 = p;
    }

    public void translate(float dX, float dY) {
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length() {
        return this.p1.distance(p2);
    }

    public boolean equals(Segment s) {
        return this.p1.equals(s.p1) && this.p2.equals(s.p2);
    }

    public float getSlope() {
        float dX = this.p1.getX() - this.p2.getX();
        float dY = this.p1.getY() - this.p2.getY();
        return dY / dX;
    }

    public float getIntercept() {
        return p1.getY() - this.getSlope() * p1.getX();
    }

    public boolean isOnLine(Point p) {
        return p.getY() == p.getX() * this.getSlope() + this.getIntercept();
    }

    public boolean isOnSegment(Point p) {
        return this.isOnLine(p) && ((p.getX() < this.p1.getX() && p.getX() > this.p2.getX()) ||
                (p.getX() < this.p2.getX() && p.getX() > this.p1.getX())) &&
                ((p.getY() < this.p1.getY() && p.getY() > this.p2.getY()) ||
                (p.getY() < this.p2.getY() && p.getY() > this.p1.getY()));
    }

}
