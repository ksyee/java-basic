package poly.diamond;

public class DiamondMain {
  
  public static void main(String[] args) {
    InterfaceA a = new Child();
    
    a.methodA();
    a.methodCommon();
    
    // 줄바꿈
    System.out.println();
    
    InterfaceB b = new Child();
    
    b.methodB();
    b.methodCommon();
  }
}
