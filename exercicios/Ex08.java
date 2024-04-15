import java.util.Scanner;

public class Ex08{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    final double DISTRIBUTOR=28;
    final double TAXES=45;
    
    System.out.print("Digite o custo de fabrica: ");
    double fabricalCost=scanner.nextDouble();
    double cost=fabricalCost+(fabricalCost*DISTRIBUTOR/100)+(fabricalCost*TAXES/100);

    System.out.println(cost);

    scanner.close();
  }
}
