import java.util.Scanner;

public class Ex03{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Digite um numero: ");
    int number1=scanner.nextInt();

    System.out.print("Digite outro numero: ");
    int number2=scanner.nextInt();

    System.out.println("[1]Media");
    System.out.println("[2]Diferenca");
    System.out.println("[3]Produto");
    System.out.println("[4]Divisao");

    System.out.print("Digite a operacao: ");
    int operation=scanner.nextInt();
    
    double result;

    switch(operation){
      case 1:
        result=(number1+number2)/2;
        System.out.format("Media: %.2f",result);
        break;
      case 2:
        result=Math.abs(number1-number2);
        System.out.format("Diferenca: %.2f",result);
        break;
      case 3:
        result=number1*number2;
        System.out.format("Produto: %.2f",result);
        break;
      case 4:
        if(number2==0){
          System.out.println("Divisao por zero...");
          break;
        }
        result=number1/number2;
        System.out.format("Divisao: %.2f",result);
        break;
      default:
        System.out.println("Voce digitou uma operacao invalida");
        break;
    }

    scanner.close();
  }
}
