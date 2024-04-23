// Lesson 1. OOP principles: Encapsulation, inheritance, polymorphism

package lesson_01;

import java.util.*;

class Figure{
    public void calculateArea(){

    }

    public void calculatePerimeter(){

    }
}





class Circle extends Figure{
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area = " + 3.14*(Math.pow(radius,2)));
    }

    @Override
    public void calculatePerimeter(){
        System.out.println("Perimeter = " + 2*3.14*radius);
    }

    @Override
    public String toString(){
        return "Circle has the following data: ";
    }
}





class Rectangle extends Figure{
    int length;
    int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area = " + length*width);
    }

    @Override
    public void calculatePerimeter(){
        System.out.println("Perimeter = " + 2*(length+width));
    }

    @Override
    public String toString(){
        return "Rectangle has the following data: ";
    }
}





class Square extends Rectangle{
    int side;

    public Square(int side){
        super(side, 5);
        this.side = side;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area = " + (int)Math.pow(side,2));
    }

    @Override
    public void calculatePerimeter(){
        System.out.println("Perimeter = " + 4*side);
    }

    @Override
    public String toString(){
        return "Square has the following data: ";
    }
}





public class Main {
    public static void main(String[] args) {

        List<Figure> figures = new ArrayList<Figure>();
        figures.add(new Circle(4));
        figures.add(new Rectangle(4, 3));
        figures.add(new Square(4));

        for (Figure figure: figures) {
            System.out.println(figure);
            figure.calculateArea();
            figure.calculatePerimeter();
            System.out.println();
        }
    }
}
