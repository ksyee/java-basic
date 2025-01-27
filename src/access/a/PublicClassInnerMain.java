package access.a;

public class PublicClassInnerMain {
  
  public static void main(String[] args) {
    // 같은 패키지라 접근 가능함
    PublicClass publicClass = new PublicClass();
    DefaultClass1 class1 = new DefaultClass1();
    DefaultClass2 class2 = new DefaultClass2();
  }
}
