import java.util.Scanner;

class Ex04{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[][] numbers = new int[4][4];

    for(int row = 0; row < 4; row++) {
      for(int col = 0; col < 4; col++) {
        numbers[row][col] = scanner.nextInt();
      }
    }

    int smallestValue = numbers[0][0];
    int largestValue = smallestValue;

    for(int[] row: numbers) {
      for(int number: row) {
        if(number > largestValue) largestValue = number;
        else if(number < smallestValue) smallestValue = number;
      }
    }

    System.out.println("Largest value: " + largestValue);
    System.out.println("Smallest value: " + smallestValue);
  }
}
