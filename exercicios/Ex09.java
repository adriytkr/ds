import java.util.Scanner;

public class Ex09{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    
    System.out.print("Digite a quantidade de carros vendidos: ");
    int soldCars=scanner.nextInt();

    System.out.print("Digite o valor total das vendas: ");
    double soldValue=scanner.nextDouble();

    System.out.print("Digite o salario fixo: ");
    double fixedWage=scanner.nextDouble();

    System.out.print("Valor por carro vendido: ");
    double valuePerCar=scanner.nextDouble();

    double wage=fixedWage+(soldValue/100*5)+(soldCars*valuePerCar);

    System.out.println(wage);

    scanner.close();
  }
}
