package poly.ex.pay;

public abstract class PayStore {
  
  public static Pay findPay(String option) {
    return switch (option) {
      case "kakao" -> new KakaoPay();
      case "naver" -> new NaverPay();
      case "google" -> new GooglePay();
      default -> new DefaultPay();
    };
  }
}
