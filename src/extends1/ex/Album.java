package extends1.ex;

public class Album extends Item {
  
  String artist = "null";
  
  public Album(String item, int price, String artist) {
    super(item, price);
    this.artist = artist;
  }
  
  public void print() {
    super.print();
    System.out.println("- 아티스트: " + artist);
  }
}
