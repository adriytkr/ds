import java.util.Scanner;

public class Ex08{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    int length = scanner.nextInt();

    int rowIndex = 0;

    while(rowIndex < length){
      int colIndex = 0;

      while(colIndex < length){
        if(rowIndex == 0 || rowIndex == length - 1) System.out.print("*");
        else{
          if(colIndex == 0 || colIndex == length - 1) System.out.print("*");
          else System.out.print(" ");
        }
        colIndex++;
      }
      System.out.println("");
      rowIndex++;
    }
  }
}
