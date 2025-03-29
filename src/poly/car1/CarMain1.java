package poly.car1;

public class CarMain1 {
  
  public static void main(String[] args) {
    
    K3Car k3Car = new K3Car();
    Driver driver = new Driver();
    
    driver.setCar(k3Car);
    driver.drive();
    
    // 다른 차로 교체
    
    Model3Car model3Car = new Model3Car();
    driver.setCar(model3Car);
    driver.drive();
    
    // 다른 차로 교체
    NewCar newCar = new NewCar();
    driver.setCar(newCar);
    driver.drive();
  }
}
