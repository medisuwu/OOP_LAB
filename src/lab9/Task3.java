package lab9;

public class Task3 {
    static class Shape {
        public void draw() {
            System.out.println("Drawing shape");
        }
    }

    static class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing circle");
        }
    }

    static class Square extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing square");
        }
    }

    static class Triangle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing triangle");
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Square(), new Triangle() };
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
