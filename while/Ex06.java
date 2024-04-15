import java.util.Scanner;

public class Ex06{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    int index = 0;
    int[] numbers = new int[10];

    while(index < 10){
      System.out.print("Digite um numero: ");
      int number = scanner.nextInt();
      numbers[index] = number;
      index++;
    }

    int highestNumberIndex = 0;

    for(int x = 0; x < 10; x++){
      highestNumberIndex = x;

      for(int y = x + 1; y < 10; y++) {
        if(numbers[y] > numbers[highestNumberIndex]) highestNumberIndex = y;
      }

      int temp = numbers[x];
      numbers[x] = numbers[highestNumberIndex];
      numbers[highestNumberIndex] = temp;
    }

    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
  }
}
