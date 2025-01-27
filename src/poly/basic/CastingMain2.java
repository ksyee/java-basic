package poly.basic;

// upcasring vs downcasting
public class CastingMain2 {
  
  public static void main(String[] args) {
    
    Child child = new Child();
    Parent parent1 = child; // upcasting은 생략 권장
    Parent parent2 = child;
    
    parent1.parentMethod();
    parent2.parentMethod();
  }
}
