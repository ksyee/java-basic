package poly.ex5;

public class InterfaceMain {
  
  public static void main(String[] args) {
//    인터페이스는 객체 생성 불가
//    InterfaceAnimal interfaceAnimal = new InterfaceAnimal();
    
    Dog dog = new Dog();
    Cat cat = new Cat();
    Caw caw = new Caw();
    
    soundAnimal(dog);
    soundAnimal(cat);
    soundAnimal(caw);
    
    moveAnimal(dog);
    moveAnimal(cat);
    moveAnimal(caw);
  }
  
  private static void soundAnimal(InterfaceAnimal animal) {
    System.out.println("동물소리 시작");
    animal.sound();
    System.out.println("동물소리 끝");
  }
  
  private static void moveAnimal(InterfaceAnimal animal) {
    System.out.println("움직임 시작");
    animal.move();
    System.out.println("움직임 끝");
  }
}
