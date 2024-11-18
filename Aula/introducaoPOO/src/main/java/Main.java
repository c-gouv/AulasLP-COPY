import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //Os bilhete1 e bilhete2 são chamados de instâncias
        BilheteUnico bilhete1 = new BilheteUnico();
        bilhete1.saldo = 0.0;
        bilhete1.numero = "12345";
        bilhete1.estudande = false;
        bilhete1.nomeTitular = "Manual";

        bilhete1.recarregar(20.0);
        System.out.println(bilhete1.saldo);

        BilheteUnico bilhete2 = new BilheteUnico();
        bilhete2.saldo = 0.0;
        bilhete2.numero = "54321";
        bilhete2.estudande = true;
        bilhete2.nomeTitular = "Yoshi";

        System.out.println(bilhete2.saldo);
        //Nesse caso há muita repetição de código, por tanto, ele é um comportamento.
/*        System.out.println("""
                Nome: %s
                Saldo: %.2f
                Estudante %b
                Número %s
                """.formatted(bilhete1.nomeTitular, bilhete1.saldo, bilhete1.estudande, bilhete1.numero));

        System.out.println("""
                Nome: %s
                Saldo: %.2f
                Estudante %b
                Número %s
                """.formatted(bilhete2.nomeTitular, bilhete2.saldo, bilhete2.estudande, bilhete2.numero));*/

        bilhete1.exibirInformacoes();
        bilhete2.exibirInformacoes();

        bilhete1.utilizar(false, true);
        bilhete1.utilizar(true, false);
        bilhete2.utilizar(true, true);



        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedNow = now.format(formatter);
        System.out.println("Data e Hora atuais: " + formattedNow);
    }
}