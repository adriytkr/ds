import java.util.Scanner;

public class Ex03{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    int number = scanner.nextInt();

    int count = 1;

    while(count <= number){
      System.out.println(count);
      count += 2;
    }

    count = 2;

    while(count <= number){
      System.out.println(count);
      count += 2;
    }
  }
}
