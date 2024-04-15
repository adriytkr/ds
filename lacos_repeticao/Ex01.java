import java.util.Scanner;

public class Ex01{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o numerador: ");
    int numerator = scanner.nextInt();

    int denominator = 0;

    do{
      System.out.print("Digite o denominador: ");
      denominator = scanner.nextInt();

      if(denominator == 0){
        System.out.println("O denominador nao pode ser zero... Tente novamente");
      }
    }while(denominator == 0);

    double quotient = (double)numerator / denominator;

    System.out.println(numerator + " / " + denominator + " = " + quotient);
  }
}
