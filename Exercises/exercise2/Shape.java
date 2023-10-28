abstract class Shape {
    protected static String color;

    public Shape(String color) {
        Shape.color = color;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Triangle extends Shape {
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

class Rectangle extends Shape {
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

class Circle extends Shape {
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

class Square extends Shape {
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
