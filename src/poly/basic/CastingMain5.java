package poly.basic;

public class CastingMain5 {
  
  public static void main(String[] args) {
    Parent parent1 = new Parent();
    System.out.println("parent1 호출");
    call(parent1);
    
    Parent parent2 = new Child();
    System.out.println("parent2 호출");
    call(parent2);
  }
  
  private static void call(Parent parent) {
    parent.parentMethod();
    
    // Child 인스턴스인 경우 childMethod() 호출
    if (parent instanceof Child child) {
      System.out.println("Child 객체입니다.");
      child.childMethod();
    }
  }
}
