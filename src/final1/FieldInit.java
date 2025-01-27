package final1;

public class FieldInit {
  
  static final int CONST_VALUE = 10;
  final int value = 10;
  
  public FieldInit() {
//    this.value = 10; // 이미 할당이 된 final값은 생성자로도 재할당할 수 없다
  }
}
