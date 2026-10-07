class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Quadrilateral {
    Point p1, p2, p3, p4;

    Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
}

class Trapezoid extends Quadrilateral {

    Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    double area(double b1, double b2, double h) {
        return (b1 + b2) * h / 2;
    }
}

class Rectangle extends Trapezoid {

    Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    double area(double l, double b) {
        return l * b;
    }
}

class Square extends Rectangle {

    Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    double area(double s) {
        return s * s;
    }
}

public class ShapeTest {

    public static void main(String[] args) {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 4);
        Point p4 = new Point(0, 4);

        Trapezoid t = new Trapezoid(p1, p2, p3, p4);
        Rectangle r = new Rectangle(p1, p2, p3, p4);
        Square s = new Square(p1, p2, p3, p4);

        System.out.println("Trapezoid Area = " + t.area(1, 3, 6));
        System.out.println("Rectangle Area = " + r.area(4, 3));
        System.out.println("Square Area = " + s.area(3));
    }
}
