package oop1.ex;

public class RectangleOopMain {
  
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(2, 2);
    
    int area = rectangle.calculateArea();
    System.out.println("넓이: " + area);
    
    int perimeter = rectangle.calculatePerimeter();
    System.out.println("둘레 길이: " + perimeter);
    
    boolean isSquare = rectangle.isSquare();
    System.out.println("정사각형 여부: " + isSquare);
  }
}
