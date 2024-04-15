import java.util.Scanner;

public class Ex02{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Digite sua primeira nota: ");
    double grade1=scanner.nextDouble();

    System.out.print("Digite sua segunda nota: ");
    double grade2=scanner.nextDouble();

    double average=(grade1+grade2)/2;

    System.out.format("Media: %.2f\n",average);

    if(0<=average && average<=4){
      System.out.println("Reprovado");
    }else if(average<=7){
      System.out.println("Exame");
    }else{
      System.out.println("Aprovado");
    }

    scanner.close();
  }
}
