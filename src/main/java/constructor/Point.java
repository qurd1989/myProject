package constructor;

public class Point {

    int x;
    int y;
    Point(int x , int y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point other) { // Copy constructor
        this.x = other.x;
        this.y = other.y;

    }
}
