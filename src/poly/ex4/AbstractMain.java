package poly.ex4;

public class AbstractMain {
  // 추상 클래스는 생성 불가
  // AbstractAnimal animal = new AbstractAnimal();
  
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    Caw caw = new Caw();
    
    cat.sound();
    cat.move();
    
    soundAnimal(dog);
    soundAnimal(cat);
    soundAnimal(caw);
    
    moveAnimal(dog);
    moveAnimal(cat);
    moveAnimal(caw);
  }
  
  // 변하지 않는 부분
  private static void soundAnimal(AbstractAnimal animal) {
    System.out.println("동물소리 시작");
    animal.sound();
    System.out.println("동물소리 끝");
  }
  
  // 변하지 않는 부분
  private static void moveAnimal(AbstractAnimal animal) {
    animal.move();
  }
}
