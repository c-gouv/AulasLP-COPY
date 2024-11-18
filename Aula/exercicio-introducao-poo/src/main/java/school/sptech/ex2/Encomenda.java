package school.sptech.ex2;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorProduto;

    Double calcularFrete(){
        Double valorFrete = 3.0;
        Double multiplicadorTamanho = switch (tamanho){
            case "P" -> 0.01;
            case "M" -> 0.03;
            case "G" -> 0.05;
            default -> 0.0;
        };

        if(distancia > 50 && distancia <= 200){
            valorFrete = 5.0;
        }

        if(distancia > 200){
            valorFrete = 7.0;
        }

        return valorFrete+(valorProduto*multiplicadorTamanho);
    }

    void aplicarCupomDeDesconto(Integer percentualDesconto){
        Double percentualDescontoFormatado = percentualDesconto * 0.01;
        valorProduto -= (valorProduto*percentualDescontoFormatado);
    }

    Double valorTotalDaEncomenda(){
        Double valorFrete = calcularFrete();
        return valorFrete + valorProduto;
    }
}
