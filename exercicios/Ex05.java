import java.util.Scanner;

public class Ex05{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Anos: ");
    int years=scanner.nextInt();

    System.out.print("Meses: ");
    int months=scanner.nextInt();

    System.out.print("Dias: ");
    int days=scanner.nextInt();

    int ageInDays=years*365+months*30+days;

    System.out.println(ageInDays);

    scanner.close();
  }
}
