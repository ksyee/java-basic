package static1;

public class DataCountMain3 {
  
  public static void main(String[] args) {
    // static 변수를 직접 참조하면 값을 공유할 수 있다
    Data3 data1 = new Data3("A");
    System.out.println("A count = " + Data3.count);
    
    Data3 data2 = new Data3("B");
    System.out.println("A count = " + Data3.count);
    
    Data3 data3 = new Data3("C");
    System.out.println("A count = " + Data3.count);
    
    // 추가
    // 인스턴스를 통한 접근
    
    Data3 data4 = new Data3("D");
    //System.out.println(data4.count); // 이렇게 접근하면 인스턴스 변수인지 정적 변수인지 혼동이 오기 때문에 하지 말자
    System.out.println(Data3.count);
    
    Data3 data5 = new Data3("E");
    System.out.println(Data3.count);
    
    // 클래스를 통한 접근
    System.out.println(Data3.count);
  }
}
