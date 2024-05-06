import java.util.Scanner;

class Ex01{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[10];

    for(int x = 0; x < 10; x++) {
      System.out.print(">> ");
      numbers[x] = scanner.nextInt();
    }

    int smallestNumberIndex = 0;

    for(int x = 0; x < 10; x++) {
      if(numbers[x] < numbers[smallestNumberIndex]) smallestNumberIndex = x;
    }

    System.out.println(numbers[smallestNumberIndex]);
  }
}
