import java.util.Scanner;

public class Ex05{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    int index = 0;
    int highestNumber = 0;

    while(index < 10){
      System.out.print("Digite um numero: ");
      int number = scanner.nextInt();

      if(index == 0) highestNumber = number;
      else if(number > highestNumber)highestNumber = number;

      index++;
    }

    System.out.println(highestNumber);
  }
}
