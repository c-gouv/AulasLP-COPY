public class Utilitaria {

    // Assinatura do Método(que leva: o tipo, nome e os parâmetros do método) -> Integer somarInteiros(Integer n1, Integer n2)
    //Corpo do método -> {}
    //Caso você não espere que método retorne alguma coisa, se cria como Void
    Integer somarInteiros(Integer n1, Integer n2) {
        Integer soma = n1+n2;
        return soma;
    }

    /*
    Crie um método chamado analisarAluno
    Ele recebe os seguintes parâmetros:
        - aluno (texto)
        - nota1 (real)
        - nota2 (real)
    Ele retorna um texto que pode ser:
        "Reprovação" - Caso a média entre as notas for < 5
        "Recuperação" - Caso a média for >= 5 & < 6
        "Aprovação" - Caso a média for >= 6

     Teste esse método na classe pricipal com os 3 cenários
    */

    String analisarAluno(String aluno, Double nota1, Double nota2){
        Double media = (nota1+nota2)/2;
        String situacaoAluno = "Aluno %s - Recuperação".formatted(aluno);

        if(media < 5){
            situacaoAluno = "Aluno %s - Reprovação".formatted(aluno);
        } else if(media >=6){
            situacaoAluno = "Aluno %s - Aprovação".formatted(aluno);
        }

        return situacaoAluno;
    }
}
