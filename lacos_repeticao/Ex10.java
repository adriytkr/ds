import java.util.Scanner;

public class Ex10{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int number = -1;

    while(number <= 0) {
      System.out.print("Digite um numero: ");
      number = scanner.nextInt();

      if(number <= 0){
        System.out.println("Digite um valor maior que zero");
      }
    }

    for(int x = 1; x < number + 1; x++) {
      System.out.println(x);
    }
  }
}
