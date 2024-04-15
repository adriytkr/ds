import java.util.Scanner;

public class Ex11{
  public static enum Fuel{
    GASOLINA,
    ALCOOL,
  }

  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    final double GASOLINA_COST_PER_LITER=3.3;
    final double ALCOOL_COST_PER_LITER=2.9;

    System.out.print("Quantos litros foram vendidos? ");
    double liters=scanner.nextDouble();

    System.out.print("Digite o tipo de combustivel([A]Alcool [G]Gasolina): ");
    Fuel fuel=scanner.next().charAt(0)=='A'?Fuel.ALCOOL:Fuel.GASOLINA;
    double cost=0;

    if(fuel==Fuel.ALCOOL){
      if(liters<=20)cost=liters*(GASOLINA_COST_PER_LITER-GASOLINA_COST_PER_LITER*3/100);
      else cost=liters*(GASOLINA_COST_PER_LITER-GASOLINA_COST_PER_LITER*5/100);
    }else{
      if(liters<=20)cost=liters*(ALCOOL_COST_PER_LITER-ALCOOL_COST_PER_LITER*4/100);
      else cost=liters*(ALCOOL_COST_PER_LITER-ALCOOL_COST_PER_LITER*6/100);;
    }

    System.out.println(cost);

    scanner.close();
  }
}
