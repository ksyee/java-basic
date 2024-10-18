package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("입력 할 주문의 갯수: ");
    int orderCount = scanner.nextInt();
    scanner.nextLine();
    
    ProductOrder[] prdArr = new ProductOrder[orderCount];
    
    int count = 0;
    
    while (count < orderCount) {
      System.out.println((count + 1) + "번째 주문 정보를 입력하세요");
      
      System.out.print("상품명: ");
      String productName = scanner.nextLine();
      
      System.out.print("가격: ");
      int price = scanner.nextInt();
      scanner.nextLine();
      
      System.out.print("수량: ");
      int quantity = scanner.nextInt();
      scanner.nextLine();
      
      prdArr[count] = createOrder(productName, price, quantity);
      
      count++;
    }
    
    System.out.println();
    printOrders(prdArr);
    
    int totalAmount = getTotalAmount(prdArr);
    
    System.out.println();
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
