package HW9.Task2;

public class Rectangle extends Shape{
    private double length;
    private double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        calculateArea();
        getArea();
    }
    public void calculateArea(){
        area = length * width;
    }
    public void getArea(){
        System.out.println("Area of rectangle with length: " + length + " and width: " + width + " is : " + area);
    }

}
