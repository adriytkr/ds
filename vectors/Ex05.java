import java.util.Scanner;

class Ex05{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[][] numbers = new int[4][4];

    for(int row = 0; row < 4; row++) {
      for(int col = 0; col < 4; col++) {
        numbers[row][col] = scanner.nextInt();
      }
    }

    System.out.print("Target: ");
    int target = scanner.nextInt();

    boolean targetFound = false;

    for(int[] row: numbers) {
      for(int number: row) {
        if(number == target) {
          targetFound = true;
          break;
        }
      }
    }

    if(targetFound) {
      System.out.println("Target found");
    }else{
      System.out.println("Target not found");
    }
  }
}
