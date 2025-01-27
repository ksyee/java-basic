package access.ex;

import java.util.ArrayList;

public class ShoppingCart {
  
  ArrayList<Item> items = new ArrayList<>();
  private int totalPrice;
  
  public void addItem(Item item) {
    if (items.size() >= 10) {
      System.out.println("장바구니가 가득 찼습니다.");
      return;
    }
    items.add(item);
  }
  
  public void displayItems() {
    System.out.println("장바구니 상품 출력");
    
    for (int i = 0; i < items.size(); i++) {
      System.out.println(
        (i + 1) + ". 상품명: " + items.get(i).getProductName() + ", 합계: " + items.get(i)
          .getTotalPrice());
      totalPrice += (items.get(i).getTotalPrice());
    }
    
    System.out.println("전체 가격 합: " + calculateTotalPrice());
  }
  
  private int calculateTotalPrice() {
    int totalPriceAllItem = 0;
    
    for (Item item : items) {
      totalPriceAllItem += item.getTotalPrice();
    }
    
    return totalPriceAllItem;
  }
}
