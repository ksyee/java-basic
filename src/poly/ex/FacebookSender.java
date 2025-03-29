package poly.ex;

public class FacebookSender implements Sender {
  
  @Override
  public void sendMessage(String text) {
    System.out.println("Facebook에 발송합니다: " + text);
  }
}
