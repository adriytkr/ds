import java.util.Scanner;

public class Ex07{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Digite seu salario: ");
    double wage=scanner.nextDouble();

    System.out.print("Digite o percentual de aumento: ");
    double increase=scanner.nextDouble();
    double newWage=wage+wage*increase/100;

    System.out.println(newWage);

    scanner.close();
  }
}
