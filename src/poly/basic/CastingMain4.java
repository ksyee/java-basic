package poly.basic;

public class CastingMain4 {
  
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
    
    if (parent instanceof Child) {
      System.out.println("Child 객체입니다.");
      ((Child) parent).childMethod();
    } else {
      System.out.println("Child 객체가 아닙니다.");
    }
  }
}
