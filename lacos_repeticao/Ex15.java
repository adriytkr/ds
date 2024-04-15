import java.util.Scanner;

public class Ex15{
  public static int calculateFibonacci(int number){
    if(number == 1 || number == 2) return 1;

    int first = 1;
    int second = 1;

    for(int x = 2; x < number; x++){
      int temp = first;
      first = second;
      second = first + temp;
    }

    return second;
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int number = 0;
    boolean isNumberValid = false;

    do{
      System.out.print("Digite um numero: ");
      number = scanner.nextInt();
      
      isNumberValid = number > 0;

      if(!isNumberValid) System.out.println("Digite um valor maior que zero...");
    }while(!isNumberValid);

    int fibonacci = calculateFibonacci(number);

    System.out.println(fibonacci);
  }
}
