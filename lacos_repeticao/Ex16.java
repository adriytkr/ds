public class Ex16{
  public static int calculateFibonacci(){
    int first = 1;
    int second = 1;

    do{
      int temp = first;
      first = second;
      second = first + temp;
    }while(second <= 500);

    return second;
  }
  public static void main(String[] args){
    int fibonacci = calculateFibonacci();

    System.out.println(fibonacci);
  }
}
