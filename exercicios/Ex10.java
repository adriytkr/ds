import java.util.Scanner;

public class Ex10{
  public static enum Genrer{
    MALE,
    FEMALE,
  };

  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String name=scanner.nextLine();

    System.out.print("Digite sua altura: ");
    double height=scanner.nextDouble();
    scanner.nextLine();

    String b;

    while(true){
      System.out.print("Digite seu genero (M/F): ");
      b=scanner.nextLine().toUpperCase();

      boolean isValid=b.equals("M")||b.equals("F");

      if(isValid)break;

      System.out.println("Digite um valor valido...");
    }

    Genrer genrer=b.equals("M")?Genrer.MALE:Genrer.FEMALE;
    double idealWeight=genrer==Genrer.MALE
      ?(72.7*height-58)
      :(62.1*height-44.7);

    System.out.println(idealWeight);

    scanner.close();
  }
}
