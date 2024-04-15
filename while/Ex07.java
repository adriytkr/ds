import java.util.Scanner;

public class Ex07{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    int length = scanner.nextInt();

    int rowIndex = 0;

    while(rowIndex < length){
      int colIndex = 0;

      while(colIndex < length){
        System.out.print("*");
        colIndex++;
      }
      System.out.println("");
      rowIndex++;
    }
  }
}
