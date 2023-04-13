
import java.util.Scanner;

class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the length of side a: ");
            double a = sc.nextDouble();
            System.out.print("Enter the length of side b: ");
            double b = sc.nextDouble();
            System.out.print("Enter the length of side c: ");
            double c = sc.nextDouble();
            Triangle triangle = new Triangle(a, b, c);
            System.out.println("Area of the triangle is: " + triangle.findArea());
            System.out.println("Perimeter of the triangle is: " + triangle.findPerimeter());
        } 
        catch (NoTriangleFormException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }

}

class NoTriangleFormException extends Exception {
     NoTriangleFormException(String message) {
        super(message);
    }
}

class Triangle {
    double a,b,c;

    public Triangle(double a, double b, double c) throws NoTriangleFormException {
        if (a + b <= c || b + c <= a || c + a <= b) {
            throw new NoTriangleFormException("The given values cannot form a triangle");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double findArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double findPerimeter() {
        return a + b + c;
    }
}
