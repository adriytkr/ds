import java.util.Scanner;

public class Ex05{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    char play = 's';
    while(play == 's'){
      double average = 0;

      for(int index = 0; index < 2; index++){
        double grade = 0;
        boolean isGradeValid = false;

        while(!isGradeValid) {
          System.out.format("Digite a nota %d: ", index + 1);
          grade = scanner.nextDouble();

          isGradeValid = grade >= 0 && grade <= 10;

          if(!isGradeValid) System.out.println("Digite uma nota valida... (entre 0 e 10)");
        }

        average += grade;
      }
      
      average /= 2;

      System.out.format("Media aritimetica: %f", average);

      System.out.print("\nCalcular de novo(s/n): ");
      play = scanner.next().charAt(0);
    }
  }
}
