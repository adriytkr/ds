import java.util.Scanner;

class Ex03{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[6];

    for(int x = 0; x < 6; x++) {
      System.out.print(">> ");
      numbers[x] = scanner.nextInt();
    }

    for(int x = 0; x < 3; x++) {
      int end = 5 - x;

      int temp = numbers[x];
      numbers[x] = numbers[end];
      numbers[end] = temp;
    }

    for(int number: numbers) {
      System.out.println(number);
    }
  }
}
