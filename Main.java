
class Shape {

    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {

    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {

    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {

    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        System.out.println("Area of Circle: " + s.calculateArea());

        s = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + s.calculateArea());

        s = new Triangle(8, 6);
        System.out.println("Area of Triangle: " + s.calculateArea());
    }
}
