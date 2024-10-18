package ref.ex;

public class ProductOrderMain2 {
  
  public static void main(String[] args) {
    ProductOrder prd1 = createOrder("두부", 2000, 2);
    ProductOrder prd2 = createOrder("김치", 5000, 1);
    ProductOrder prd3 = createOrder("콜라", 1500, 2);
    
    ProductOrder[] prdArr = {prd1, prd2, prd3};
    
    printOrders(prdArr);
    
    int totalAmount = getTotalAmount(prdArr);
    
    System.out.println("총 결제 금액: " + totalAmount);
  }
  
  static ProductOrder createOrder(String name, int price, int quantity) {
    ProductOrder order = new ProductOrder();
    
    order.name = name;
    order.price = price;
    order.quantity = quantity;
    
    return order;
  }
  
  static void printOrders(ProductOrder[] prdArr) {
    for (ProductOrder prd : prdArr) {
      System.out.println("상품명: " + prd.name + ", 가격: " + prd.price + ", 수량: " + prd.quantity);
    }
  }
  
  static int getTotalAmount(ProductOrder[] prdArr) {
    int totalAmount = 0;
    
    for (ProductOrder prd : prdArr) {
      totalAmount += prd.price * prd.quantity;
    }
    
    return totalAmount;
  }
}
