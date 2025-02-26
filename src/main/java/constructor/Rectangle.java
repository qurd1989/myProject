package constructor;

public class Rectangle {
    Point topLeft;
    Point bottomRight;
    public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        this.topLeft = new Point(topLeftX, topLeftY); // Deep copy of points
        this.bottomRight = new Point(bottomRightX, bottomRightY); // Deep copy of points
    }

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = new Point(topLeft); // Deep copy of points
        this.bottomRight = new Point(bottomRight); // Deep copy of points
    }

    public Rectangle(Rectangle other) { // Copy constructor
        this.topLeft = new Point(other.topLeft); // Deep copy of points
        this.bottomRight = new Point(other.bottomRight); // Deep copy of points
    }
}
