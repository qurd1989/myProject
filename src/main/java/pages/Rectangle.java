package pages;

public class Rectangle {
    public Point topLeft;
    public int height;
    public int width;

    public Rectangle() {
        this.topLeft = topLeft;
        this.height = height;
        this.width = width;
    }

    Rectangle(int height, int width, Point topLeft){
        this.height =height;
        this.width = width;
        this.topLeft = topLeft;
    }
    int getArea() {

        return width*height;
    }
    int getParameter(){

        return 2 * (width + height);
    }

//    Point getBottomRight(){
//        Point point = new Point();
//        point.x = topLeft.x + width;
//        point.y = topLeft.y -height;
//        return point;
//    }
}
