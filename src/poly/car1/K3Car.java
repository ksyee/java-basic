package poly.car1;

public class K3Car implements Car {
  
  @Override
  public void startEngine() {
    System.out.println("K3Car 엔진을 시작합니다.");
  }
  
  @Override
  public void stopEngine() {
    System.out.println("K3Car 엔진을 끕니다.");
  }
  
  @Override
  public void pressAccelerator() {
    System.out.println("K3Car 가속 페달을 밟습니다.");
  }
}
