package access.ex;

public class MaxCounter {
  
  private final int max;
  private int count;
  
  public MaxCounter(int maxCounter) {
    this.max = maxCounter;
  }
  
  public void increment() {
    if (count >= max) {
      System.out.println("최댓값 " + max + "을 초과할 수 없습니다.");
      return;
    }
    count++;
  }
  
  public int getCount() {
    return count;
  }
}
