package pages;

public class Point {

    private String name;
    private double price;

    public Point(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return  name;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    public static void main(String[] args) {
        Point point = new Point("Three points ", 34);
        Point point1 = point;

        point.name = "elmar";
        System.out.println(point.name);
        System.out.println(point1.name);
    }

}
