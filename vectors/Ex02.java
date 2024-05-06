import java.util.Scanner;

class Ex02{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[10];

    for(int x = 0; x < 10; x++) {
      System.out.print(">> ");
      numbers[x] = scanner.nextInt();
    }

    System.out.print("Target: ");
    int target = scanner.nextInt();
    int targetIndex = -1;

    for(int x = 0; x < 10; x++) {
      if(numbers[x] == target) {
        targetIndex = x;
        break;
      }
    }

    System.out.println("Target at index " + targetIndex);
  }
}
