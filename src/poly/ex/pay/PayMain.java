package poly.ex.pay;

public class PayMain {
  
  public static void main(String[] args) {
    PayService payService = new PayService();
    
    // kakao 결제
    String payOption1 = "kakao";
    int amount1 = 5000;
    payService.processPay(payOption1, amount1);
    
    // naver 결제
    String payOption2 = "naver";
    payService.processPay(payOption2, amount1);
    
    // 잘못된 결제 수단
    String payOption3 = "bad";
    payService.processPay(payOption3, amount1);
    
    // google 결제
    String payOption4 = "google";
    payService.processPay(payOption4, amount1);
  }
}
