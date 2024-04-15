import java.util.Scanner;

public class Ex18{
  public static Scanner scanner = new Scanner(System.in);

  public static int askNumber(String message, int min, int max){
    int number = 0;
    boolean isNumberInRange = false;

    while(!isNumberInRange){
      System.out.print(message);
      number = scanner.nextInt();

      isNumberInRange = number >= min && number <= max;

      if(!isNumberInRange){
        System.out.format("Digite um numero valido... (entre %d e %d)\n", min, max);
      }
    }

    return number;
  }

  public static void main(String[] args){
    final int MIN_NUMBER = 0;
    final int MAX_NUMBER = 1000;

    System.out.print("Digite quantos numeros: ");
    int total = scanner.nextInt();

    int highestNumber = 0;
    int lowestNumber = 0;
    int sum = 0;

    System.out.format("Digite apenas numeros entre %d e %d\n", MIN_NUMBER, MAX_NUMBER);

    for(int x = 0; x < total; x++){
      System.out.println("Digite o numero " + (x + 1) + ": ");
      int number = askNumber(">> ", MIN_NUMBER, MAX_NUMBER);

      sum += number;

      if(x == 0) highestNumber = lowestNumber = number;
      else {
        if(number > highestNumber) highestNumber = number;
        if(number < lowestNumber) lowestNumber = number;
      }
    }

    System.out.println(highestNumber);
    System.out.println(lowestNumber);
    System.out.println(sum);
  }
}
