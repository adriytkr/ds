import java.util.Scanner;

public class Ex06{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Quantos eleitores votaram? ");
    int totalVoters=scanner.nextInt();

    System.out.print("Quantos votos brancos: ");
    int whiteVotes=scanner.nextInt();

    System.out.print("Quantos votos nulos: ");
    int nullVotes=scanner.nextInt();

    System.out.print("Quantos votos validos: ");
    int validVotes=scanner.nextInt();

    System.out.println((double)whiteVotes*100/totalVoters);
    System.out.println((double)nullVotes*100/totalVoters);
    System.out.println((double)validVotes*100/totalVoters);

    scanner.close();
  }
}
