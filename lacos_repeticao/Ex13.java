import java.util.Scanner;

public class Ex13{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    boolean isNumberValid = false;
    int number = 0;

    while(!isNumberValid) {
      System.out.print("Digite um numero: ");
      number = scanner.nextInt();

      isNumberValid = number >= 1 && number <= 10;

      if(!isNumberValid) System.out.println("Digite um valor maior que zero");
    }

    for(int x = 1; x < 11; x++) {
      int product = number * x;
      System.out.format("%d X %d = %d\n", number, x, product);
    }
  }
}
