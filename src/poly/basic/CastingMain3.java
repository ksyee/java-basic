package poly.basic;

public class CastingMain3 {
  
  public static void main(String[] args) {
    Parent parent1 = new Child();
    Child child1 = (Child) parent1;
    child1.childMethod(); // 문제 없음
    
    Parent parent2 = new Parent(); // 여기엔 Child가 메모리에 없음
    Child child2 = (Child) parent2;
    child2.childMethod(); // 문제 발생
  }
}
