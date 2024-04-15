import java.util.Scanner;

public class Ex17{
  public static int calculateFactorial(int number){
    if(number == 0 || number == 1) return 1;

    int result = 1;

    for(int x = 2; x <= number; x++){
      result *= x;
    }

    return result;
  }

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    int number = scanner.nextInt();

    int factorial = calculateFactorial(number);

    System.out.println(factorial);
  }
}
