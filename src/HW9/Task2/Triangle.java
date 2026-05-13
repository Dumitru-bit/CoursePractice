package HW9.Task2;

public class Triangle extends Shape{
    private double a, b, c;
    private String type;

    public Triangle(double a, double b, double c) {
        if (!isValid(a, b, c)) {
            System.out.println("Invalid triangle with sides: " + a + " , " + b + " , " + c);
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
            setType();
            displayArea();
        }
    }

    private boolean isValid(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public void setType() {
        if (a == b && b == c)
            type = "Equilateral";
        else if (a == b || b == c || a == c)
            type = "Isosceles";
        else
            type = "Scalene";
    }

    public void displayArea() {
        double s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The triangle with sides: " + a + " , " + b + " and " + c + " is a " + type + " triangle, and its area is: " + area);
    }

}
