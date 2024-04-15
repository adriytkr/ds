import java.util.Scanner;

public class Ex01{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Digite o codigo do produto: ");
    int code=scanner.nextInt();

    switch(code){
      case 1:
        System.out.println("Alimento nao-perecivel");
        break;
      case 2:
      case 3:
      case 4:
        System.out.println("Alimento perecivel");
        break;
      case 5:
      case 6:
        System.out.println("Vestuario");
        break;
      case 7:
        System.out.println("Higiene Pessoal");
        break;
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
        System.out.println("Limpeza e Utensilios Domesticos");
        break;
      default:
        System.out.println("Codigo invalido");
    }

    scanner.close();
  }
}
 