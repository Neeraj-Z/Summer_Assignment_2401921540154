// 1. Interface and Arithmetic class
interface Test {
    int square(int n);
}

class Arithmetic implements Test {
    public int square(int n) {
        return n * n;
    }
}

// 2. Outer and Inner class
class Outer {

    void display() {
        System.out.println("Display of Outer Class");
    }

    class Inner {
        void display() {
            System.out.println("Display of Inner Class");
        }
    }
}

// 3. Point class
class Point {

    private int x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Point : (" + x + ", " + y + ")");
    }
}

// 4. Box and Box3D
class Box {

    int length, breadth;

    Box(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }
}

class Box3D extends Box {

    int height;

    Box3D(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    int volume() {
        return length * breadth * height;
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Question 1
        System.out.println("Question 1");
        Arithmetic a = new Arithmetic();
        System.out.println("Square of 5 = " + a.square(5));

        // Question 2
        System.out.println("\nQuestion 2");
        Outer out = new Outer();
        out.display();

        Outer.Inner in = out.new Inner();
        in.display();

        // Question 3
        System.out.println("\nQuestion 3");
        Point p = new Point();
        p.display();

        Point p2 = new Point(10, 20);
        p2.display();

        p2.setXY(30, 40);
        p2.display();

        // Question 4
        System.out.println("\nQuestion 4");
        Box3D b = new Box3D(5, 4, 3);

        System.out.println("Area = " + b.area());
        System.out.println("Volume = " + b.volume());
    }
}