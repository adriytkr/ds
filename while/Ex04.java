import java.util.Scanner;

public class Ex04{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de alunos: ");
    int totalStudents = scanner.nextInt();

    int index = 0;
    double average = 0;

    while(index < totalStudents){
      System.out.format("Digite a nota do %d aluno: ", index + 1);
      double studentGrade = scanner.nextInt();
      average += studentGrade;
      index++;
    }

    average /= totalStudents;
    System.out.println(average);
  }
}
