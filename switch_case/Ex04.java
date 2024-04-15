import java.util.Scanner;

public class Ex04{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Digite o codigo do produto: ");
    int code=scanner.nextInt();

    System.out.print("Digite a quantidade do produto: ");
    int quantity=scanner.nextInt();

    double productPrice;

    switch(code){
      case 100:
        productPrice=1.7;
        break;
      case 101:
        productPrice=2.3;
        break;
      case 102:
        productPrice=2.6;
        break;
      case 103:
        productPrice=2.4;
        break;
      case 104:
        productPrice=2.5;
        break;
      case 105:
        productPrice=1;
        break;
      default:
        System.out.println("Voce digitou um codigo de produto invalido");
        scanner.close();
        return;
    }

    double finalPrice=productPrice*quantity;

    System.out.format("Preco final: R$%.2f",finalPrice);

    scanner.close();
  }
}
