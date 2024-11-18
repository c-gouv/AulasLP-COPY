public class BilheteUnico {
    // Os objetos representam coisas do mundo real em código
    // e são compostas por 2 coisas: Caracteristica & Comportamento
    // As caracteristicas são variáveis e os comportamentos são os métodos

    String nomeTitular;
    Boolean estudande;
    Double saldo;
    String numero;

    void recarregar(Double valorRecarga) {
        if(valorRecarga <= 2.0){
            System.out.println("Valor insuficiente de Recarga");
            return;
        }

        if(saldo + valorRecarga >= 250.0){
            System.out.println("Limite ultrapassado");
            return;
        }

        saldo += valorRecarga;
    }

    Boolean utilizar(Boolean integracao, Boolean estudante){
        if(integracao){
            System.out.println("Saldo debitado R$ 0,00");
            return true;
        }

        Double precoPassagem = estudante ? 2.5 : 5.0;

        if(saldo >= precoPassagem){
            System.out.println("Saldo debitado R$ %.2f".formatted(precoPassagem));
            saldo -= precoPassagem;
            return true;
        }

        System.out.println("Saldo insuficiente");
        return false;
    }

    //Você consegue chamar as características do objeto que você está
    void exibirInformacoes(){
        System.out.println("""
                Nome: %s
                Saldo: %.2f
                Estudante: %b
                Número: %s
                """.formatted(nomeTitular, saldo, estudande, numero));
    }

}
