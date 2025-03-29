package poly.ex3;

public class AbstractMain {
  // 추상 클래스는 생성 불가
  // AbstractAnimal animal = new AbstractAnimal();
  
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    Caw caw = new Caw();
    Duck duck = new Duck();
    
    cat.sound();
    cat.move();
    
    soundAnimal(dog);
    soundAnimal(cat);
    soundAnimal(caw);
    soundAnimal(duck);
  }
  
  // 변하지 않는 부분
  private static void soundAnimal(AbstractAnimal animal) {
    System.out.println("동물소리 시작");
    animal.sound();
    System.out.println("동물소리 끝");
  }
}
