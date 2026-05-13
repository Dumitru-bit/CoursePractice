package HW9.Task2;
/*
2. Geometric Shapes Application – Inheritance
Develop an application for geometric shapes such as:
•	Circle
•	Rectangle
•	Triangle
Each shape must:
•	have a method that calculates its area,
•	and store its own specific dimensions.
Requirements:
1.	Create a base class called Shape.
2.	Create separate classes for:
o	Circle
o	Rectangle
o	Triangle
3.	Use inheritance to avoid duplicating common code.
4.	Display information about each shape and its area.

 */

public class Classroom {
    public static void main(String[] args) {
        Circle c1 = new Circle(10.5);
        Rectangle r1 = new Rectangle(11.5,12.8);
        Triangle t1 = new Triangle(5,5,5);
        Triangle t2 = new Triangle(5,5,6);
        Triangle t3 = new Triangle(3,4,5);
        Triangle t4 = new Triangle(2,3,6);
    }
}
