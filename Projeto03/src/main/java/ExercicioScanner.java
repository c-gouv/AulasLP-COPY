import java.util.Scanner;

public class ExercicioScanner {
    public static void main(String[] args) {
        /*
        * Peça para o usuário digitar o nome e a quantidade de provas que ele fez
        * Peça então para ele digitar a nota de cada uma das provas
        * Então exiba para ele a média das provas
        *
        * "Aluno: XXXX"
        * "Média: X.XX" */

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.print("Digite a quantidade de provas para calcular a média: ");
        Integer qtdProvas = sc.nextInt();

        Double somaNotas = 0.0;
        for (Integer contador = 1; contador <= qtdProvas; contador++){
            System.out.print("Insira a nota da prova "+contador+": ");
            somaNotas+= sc.nextDouble();
        }

        Double mediaAluno = somaNotas/qtdProvas;
        System.out.println("""
                
                Aluno: %s
                Média: %.2f
                """.formatted(nomeAluno, mediaAluno));

        System.out.println(nomeAluno + ", voc é paia demais!");
    }
}