import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cofrinho a = new Cofrinho();
        Scanner sc = new Scanner(System.in);

        a.saldoCofrinho = 200.50;
        a.metaCofriho = "Comprar a lua";
        a.cofrinhoQuebrado = true;

        

        System.out.println("A meta do cofrinho é: " + a.metaCofriho);
        System.out.println("Seu saldo atual é de: R$" + a.saldoCofrinho);
        System.out.println("Eu agitei o cofrinho e caiu: R$" + a.agitarCofrinho());
        System.out.println("Seu saldo atual é de: R$" + a.saldoCofrinho);
        System.out.println("Eu quebrei o cofrinho e peguei: R$"+a.quebrarCofrinho());
    }
}
