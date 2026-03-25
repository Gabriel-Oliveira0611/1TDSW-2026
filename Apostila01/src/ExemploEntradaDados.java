import java.util.Scanner;

public class ExemploEntradaDados {

    //Criar um programa para calcular a média da FIAP
    public static void main(String[] args) {

        //Criar variáveis
        double porcentagemCheckPoint = 0.2;
        double porcentagemChallenge = 0.2;
        double porcentagemGlobalSolution = 0.6;
        double mediaCheckPoints = 0;
        double notaChallenge1 = 0;
        double notaChallenge2 = 0;
        double mediaChallenge = 0;
        double globalSolution = 0;
        double notaGlobalSolution = 0;
        double finalChallenge = 0;
        double finalCP = 0;
        double finalGS = 0;
        double notaFinal = 0;
        String nomeAluno = "";

        //Criar o objeto para ler o teclado
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        nomeAluno = leitor.next() + leitor.nextLine();

        System.out.println("Digite a nota da CP1");
        double cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da CP2");
        double cp2 = leitor.nextDouble();

        mediaCheckPoints = (cp1 + cp2) / 2;

        System.out.println("Digite a primeira nota do Challenge:");
        notaChallenge1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota do Challenge:");
        notaChallenge2 = leitor.nextDouble();

        mediaChallenge = (notaChallenge1 + notaChallenge2) / 2;

        System.out.println("Insira a nota do Global Solution:");
        notaGlobalSolution = leitor.nextDouble();

        finalCP = mediaCheckPoints * porcentagemCheckPoint;
        finalChallenge = mediaChallenge * porcentagemChallenge;
        finalGS = notaGlobalSolution * porcentagemGlobalSolution;

        notaFinal = finalCP + finalChallenge + finalGS;

        System.out.println(nomeAluno + ", seu resultado é: ");
        System.out.println("A média dos checkpoints é " + mediaCheckPoints);
        System.out.println("A média dos Challenges é " + mediaChallenge);
        System.out.println("A nota do Global Solution é " + notaGlobalSolution);
        System.out.println("Sua média final é " + notaFinal);




    }
}
