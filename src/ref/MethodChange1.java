package ref;

public class MethodChange1 {
  
  public static void main(String[] args) {
    int a = 10;
    System.out.println("메서드 호출 전");
    System.out.println("a = " + a);
    
    changePrimitive(a);
    System.out.println("메서드 호출 후");
    System.out.println("a = " + a);
  }
  
  static void changePrimitive(int x) {
    x = 20;
  }
}
