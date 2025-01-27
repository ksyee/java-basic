package extends1.ex;

public class Book extends Item {
  
  String author = "null";
  String isbn = "null";
  
  public Book(String item, int price, String author, String isbn) {
    super(item, price);
    this.author = author;
    this.isbn = isbn;
  }
  
  @Override
  public void print() {
    super.print();
    System.out.println("- 저자: " + author + ", isbn = " + isbn);
  }
}
