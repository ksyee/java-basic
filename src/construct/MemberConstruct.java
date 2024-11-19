package construct;

public class MemberConstruct {
  
  String name;
  int age;
  int grade;
  
  MemberConstruct(String name, int age) {
    this(name, age, 50); // this()는 생성자의 첫 번째 줄에서만 호출 가능
  }
  
  MemberConstruct(String name, int age, int grade) {
    System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
    this.name = name;
    this.age = age;
    this.grade = grade;
  }
}
