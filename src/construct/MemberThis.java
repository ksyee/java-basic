package construct;

public class MemberThis {
  
  String nameField;
  
  void initMember(String nameParameter) {
    nameField = nameParameter; // 파라미터와 멤버변수의 이름이 다를 때는 this 없어도 됨
  }
}
