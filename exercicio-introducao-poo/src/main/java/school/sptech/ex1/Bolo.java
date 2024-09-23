package school.sptech.ex1;

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida;
    Integer quantidadeEmEstoque;

    void venderBolo(Integer qtdBolosDesejada){
        if(qtdBolosDesejada <= 0){
            return;
        } if(quantidadeEmEstoque < qtdBolosDesejada){
            return;
        }

        quantidadeVendida += qtdBolosDesejada;
        quantidadeEmEstoque -= qtdBolosDesejada;
    }

    void aumentarEstoque(Integer qtdBolosAdicionar){
        if(qtdBolosAdicionar <= 0){
            return;
        }

        quantidadeEmEstoque += qtdBolosAdicionar;
    }

    Integer quantidadeDisponivel(){
        return quantidadeEmEstoque;
    }

    Double totalVendido(){
        return quantidadeVendida*valor;
    }
}
