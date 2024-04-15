import java.util.Scanner;

public class Ex03{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Litros por kilometro: ");
    double literPerKm=scanner.nextDouble();

    System.out.print("Digite a distancia em kilometros: ");
    double distance=scanner.nextDouble();

    System.out.print("Custo por litro: ");
    double costPerLiter=scanner.nextDouble();

    double cost=literPerKm*distance*costPerLiter;

    System.out.println(cost);

    scanner.close();
  }
}
