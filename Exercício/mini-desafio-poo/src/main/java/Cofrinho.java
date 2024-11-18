import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {
    String metaCofriho;
    Boolean cofrinhoQuebrado;
    Double saldoCofrinho;

    void depositarCofrinho(Double valor){
        if(cofrinhoQuebrado){
            return;
        }

        saldoCofrinho += valor;
        //saldoCofrinho = cofrinhoQuebrado ? 0.0 : (saldoCofrinho+=valor);
    }

    Double agitarCofrinho(){
        if(cofrinhoQuebrado){
            return null;
        }

        Double valorCaiu = ThreadLocalRandom.current().nextDouble(0, saldoCofrinho+1);
        Double valorCaiuFormatado = Math.round(valorCaiu * 100.00) / 100.00;
        saldoCofrinho -= valorCaiuFormatado;

        return valorCaiuFormatado;
    }

    Double quebrarCofrinho(){
        if(cofrinhoQuebrado){
            return null;
        }

        cofrinhoQuebrado = true;
        return saldoCofrinho;
    }

}
