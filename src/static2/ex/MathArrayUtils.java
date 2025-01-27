package static2.ex;

public class MathArrayUtils {
  
  private MathArrayUtils() {
    // 인스턴스의 생성을 막는다
  }
  
  public static int sum(int[] array) {
    int total = 0;
    
    for (int num : array) {
      total += num;
    }
    
    return total;
  }
  
  public static double average(int[] array) {
    return (double) sum(array) / array.length;
  }
  
  public static int min(int[] array) {
    int minValue = array[0];
    
    for (int num : array) {
      if (minValue > num) {
        minValue = num;
      }
    }
    
    return minValue;
  }
  
  public static int max(int[] array) {
    int maxValue = array[0];
    
    for (int num : array) {
      if (maxValue < num) {
        maxValue = num;
      }
    }
    
    return maxValue;
  }
}
