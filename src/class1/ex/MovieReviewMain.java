package class1.ex;

public class MovieReviewMain {
  
  public static void main(String[] args) {
    MovieReview review1 = new MovieReview();
    
    review1.title = "어바웃타임";
    review1.review = "인생 시간영화!";
    
    MovieReview review2 = new MovieReview();
    
    review2.title = "인셉션";
    review2.review = "인생은 무한루프";
    
    
    System.out.println("영화 제목: " + review1.title + ", 리뷰: " + review1.review);
    System.out.println("영화 제목: " + review2.title + ", 리뷰: " + review2.review);
  }
}
