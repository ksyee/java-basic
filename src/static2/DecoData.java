package static2;

public class DecoData {
  
  private static int staticValue;
  private int instanceValue;
  
  public static void staticCall() {
    staticValue++; // 정벅 변수 접근
    staticMethod();
    
    // 인스턴스 변수나 메서드에는 접근할 수 없음. 컴파일 에러남.
//    instanceValue++;
//    instanceMethod();
  }
  
  public static void staticCall(DecoData data) {
    data.instanceValue++;
    data.instanceMethod();
  }
  
  private static void staticMethod() {
    System.out.println("staticValue = " + staticValue);
  }
  
  public void instanceCall() {
    instanceValue++;
    instanceMethod();
    
    staticValue++;
    staticMethod();
  }
  
  private void instanceMethod() {
    System.out.println("instanceValue = " + instanceValue);
  }
}
