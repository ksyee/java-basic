package poly.car0;

public class Driver {
  
  private K3Car k3Car;
  private Model3Car model3Car;
  
  public void setK3Car(K3Car k3Car) {
    this.k3Car = k3Car;
  }
  
  public void setModel3Car(Model3Car model3Car) {
    this.model3Car = model3Car;
  }
  
  public void drive() {
    System.out.println("운전을 시작합니다.");
    if (k3Car != null) {
      K3Car.startEngine();
      K3Car.pressAccelerator();
      K3Car.offEngine();
    } else if (model3Car != null) {
      Model3Car.startEngine();
      Model3Car.pressAccelerator();
      Model3Car.offEngine();
    } else {
      System.out.println("운전할 차가 없습니다.");
    }
  }
}
