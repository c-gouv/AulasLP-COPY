import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        // valores Litterals, são aqueles que são de característica de suas variaveis, como o [Double = 0.0/Double = 0D].
        //Para valores que não são Litterals, é necessário usar o new antes do valor.

        //Scanner também consegue ler arquivos dentro do JAVA
        //Scanner é um tipo de variável do tipo Wrapper
        Scanner leitor = new Scanner(System.in);

        System.out.print("Põe teu nome aí zé: ");
        String nome = leitor.nextLine();

        System.out.print("Agora põe tua idade: ");
        Integer idade = leitor.nextInt();

        System.out.print("Lança tua altura agora: ");
        Double altura = leitor.nextDouble();

        System.out.println("""
                Salve %s,
                Idade: %d
                Altura: %.1fm
                """.formatted(nome, idade, altura));

    }
}
