import java.util.Scanner;

public class Ex02{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Digite um valor: ");
    int valueA=scanner.nextInt();

    System.out.print("Digite outro valor: ");
    int valueB=scanner.nextInt();

    int temp=valueA;
    valueA=valueB;
    valueB=temp;

    System.out.println(valueA);
    System.out.println(valueB);

    scanner.close();
  }
}
