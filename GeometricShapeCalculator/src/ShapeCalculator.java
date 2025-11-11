public class ShapeCalculator {
    public static void main(String[] args) throws Exception {

        ShapeCalculator calculator = new ShapeCalculator();

        calculator.printShapeInfo("Circle", calculator.calculateArea(5), calculator.calculatePerimeter(5));
        System.out.println("---");
        calculator.printShapeInfo("Rectangle", calculator.calculateArea(4, 6), calculator.calculatePerimeter(4, 6));
        System.out.println("---");
        calculator.printShapeInfo("Triangle", calculator.calculateArea(3, 4, true), calculator.calculatePerimeter(3, 4, true));
        System.out.println("---");
        calculator.printShapeInfo("Square", calculator.calculateArea(5, 5), calculator.calculatePerimeter(5, 5));
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            throw new IllegalArgumentException("For non-triangle shapes, use other methods.");
        }
    }

    public double calculateArea(double sideLength, int numberOfSides) {
        if (numberOfSides < 3) {
            throw new IllegalArgumentException("A polygon must have at least 3 sides.");
        }
        double apothem = sideLength / (2 * Math.tan(Math.PI / numberOfSides));
        return (numberOfSides * sideLength * apothem) / 2;
    }

    public double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public double calculatePerimeter(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            double hypotenuse = Math.sqrt(base * base + height * height);
            return base + height + hypotenuse;
        } else {
            throw new IllegalArgumentException("For non-triangle shapes, use other methods.");
        }
    }

    public double calculatePerimeter(double sideLength, int numberOfSides) {
        if (numberOfSides < 3) {
            throw new IllegalArgumentException("A polygon must have at least 3 sides.");
        }
        return numberOfSides * sideLength;
    }

    public void printShapeInfo(String shapeName, double area, double perimeter) {
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
