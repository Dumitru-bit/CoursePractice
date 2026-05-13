package HW9.Task2;

public class Circle extends Shape{
    private double radius;
    final double pi = 3.14;

    Circle(double radius){
        this.radius = radius;
        calculateArea();
        getArea();
    }
    public void calculateArea(){
        area = pi * radius * radius;
    }
    public void getArea(){
        System.out.println("Area of circle with radius: " + radius + " is " + area);
    }

}

