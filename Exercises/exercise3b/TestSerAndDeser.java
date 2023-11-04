import java.io.*;

public class TestSerAndDeser {

    static abstract class Shape implements Serializable {
        protected static String color;

        public Shape(String color) {
            Shape.color = color;
        }

        public abstract double calculateArea();
        public abstract double calculatePerimeter();
    }

    static class Triangle extends Shape {
        private double edge1, edge2, edge3;

        public Triangle(double edge1, double edge2, double edge3) {
            super("Red");
            this.edge1 = edge1;
            this.edge2 = edge2;
            this.edge3 = edge3;
        }

        @Override
        public double calculateArea() {
            double s = (edge1 + edge2 + edge3) / 2;
            return Math.sqrt(s * (s - edge1) * (s - edge2) * (s - edge3));
        }

        @Override
        public double calculatePerimeter() {
            return edge1 + edge2 + edge3;
        }
    }

    static class Rectangle extends Shape {
        private double length, width;

        public Rectangle(double length, double width) {
            super("Blue");
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            super("Yellow");
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Square extends Shape {
        private double edge;

        public Square(double edge) {
            super("Green");
            this.edge = edge;
        }

        @Override
        public double calculateArea() {
            return edge * edge;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * edge;
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        Rectangle rectangle = new Rectangle(6.0, 7.0);
        Circle circle = new Circle(8.0);
        Square square = new Square(9.0);

        try {
            // Serialize objects
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("shapes.ser"));
            out.writeObject(triangle);
            out.writeObject(rectangle);
            out.writeObject(circle);
            out.writeObject(square);
            out.close();

            // Deserialize objects
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("shapes.ser"));
            Triangle deserializedTriangle = (Triangle) in.readObject();
            Rectangle deserializedRectangle = (Rectangle) in.readObject();
            Circle deserializedCircle = (Circle) in.readObject();
            Square deserializedSquare = (Square) in.readObject();
            in.close();

            // Output deserialized objects
            System.out.println("Deserialized Triangle: " + deserializedTriangle.calculateArea());
            System.out.println("Deserialized Rectangle: " + deserializedRectangle.calculateArea());
            System.out.println("Deserialized Circle: " + deserializedCircle.calculateArea());
            System.out.println("Deserialized Square: " + deserializedSquare.calculateArea());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
