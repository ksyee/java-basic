package pack;

public class PackageMain1 {
  
  public static void main(String[] args) {
    Data data = new Data();
    
    pack.a.User user = new pack.a.User(); // 다른 패키지에 있는 클래스는 경로를 다 적어줘야 함
  }
}
