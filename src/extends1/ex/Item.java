package extends1.ex;

public class Item {
  
  private String item = "null";
  private int price = 0;
  
  public Item(String item, int price) {
    this.item = item;
    this.price = price;
  }
  
  public void print() {
    System.out.println("이름: " + item + ", 가격: " + price);
  }
  
  public int getPrice() {
    return price;
  }
}
