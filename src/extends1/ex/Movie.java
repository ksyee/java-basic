package extends1.ex;

public class Movie extends Item {
  
  String director = "null";
  String actor = "null";
  
  public Movie(String item, int price, String director, String actor) {
    super(item, price);
    this.director = director;
    this.actor = actor;
  }
  
  public void print() {
    super.print();
    System.out.println("- 감독: " + director + ", 배우: " + actor);
  }
}
