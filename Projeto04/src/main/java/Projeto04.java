import java.util.Scanner;

public class Projeto04 {

    public static void main(String[] args) {
        Utilitaria util = new Utilitaria();

        //Há mais de uma forma de utilizar
        System.out.println("Resultado da soma1: "+util.somarInteiros(2,3));


        // TODO TENHO QUE ESTUDAR ISSO
        // FIXME TENHO QUE ESTUDAR ISSO
        //Também pode armazenar o valor da função com retorno
        Integer soma = util.somarInteiros(10, 7);
        Integer soma2 = util.somarInteiros(soma, 3);
        System.out.println("Resultado da soma2: "+soma2);

        //Método média com retorno
        System.out.println("\r\nCOPIEI DA MURAKAMI:");
        System.out.println(util.analisarAluno("Murakami", 6.0, 6.0));
        System.out.println(util.analisarAluno("Murakami", 5.0, 5.0));
        System.out.println(util.analisarAluno("Murakami", 4.0, 4.0));
    }
}
