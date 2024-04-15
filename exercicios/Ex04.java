import java.util.Scanner;

public class Ex04{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    
    System.out.print("Digite um numero: ");
    int number=scanner.nextInt();
    int predecessor=number-1;

    System.out.println(predecessor);

    scanner.close();
  }
}
