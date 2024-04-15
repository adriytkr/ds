import java.util.Scanner;

class Ex01{
  public static int calcArea(int sideA, int sideB){
    return sideA*sideB;
  }
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Digite o valor do lado A: ");
    int sideA=scanner.nextInt();

    System.out.print("Digite o valor do lado B: ");
    int sideB=scanner.nextInt();

    int area=calcArea(sideA,sideB);
    System.out.println(area);

    scanner.close();
  }
}
