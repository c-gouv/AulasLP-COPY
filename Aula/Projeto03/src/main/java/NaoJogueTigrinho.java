import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NaoJogueTigrinho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o valor do prêmio: ");
        Double valorPremio = sc.nextDouble();

        if(!(valorPremio >= 0.5 && valorPremio <= 5000)){
            do {
                System.out.println("Prêmio deve ser entre R$0,50 e $5.000,00");
                valorPremio = sc.nextDouble();
            } while(!(valorPremio >= 0.5 && valorPremio <= 5000));
        }

        Integer numeroSorte = ThreadLocalRandom.current().nextInt(0, 101);
        System.out.println("Seu número da sorte é "+numeroSorte);

        Integer numeroSorteado;
        Integer qtdSorteios = 0;
        do {
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 101);
            qtdSorteios++;
        } while(numeroSorteado != numeroSorte);

        if(qtdSorteios >= 2 && qtdSorteios <= 5){
            valorPremio *= 0.9;
        } else if(qtdSorteios >= 6 && qtdSorteios <= 10) {
            valorPremio *= 0.5;
        } else if (qtdSorteios > 10) {
            valorPremio *= 0;
        }

        System.out.println("""
                Olá, %s. Seu número foi sorteado na %dº tentativa. Seu prêmio será de R$%.2f.
                """.formatted(nome, qtdSorteios, valorPremio));
    }
}
