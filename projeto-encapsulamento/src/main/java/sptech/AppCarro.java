package sptech;

public class AppCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca Novo", "Preto", 2024, 10.0);

        System.out.println("Modelo: "+carro1.getModelo());
        System.out.println("Cor: "+carro1.getCor());
        System.out.println("Ano de Fabricação: "+carro1.getAnoFabricacao());
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzz: "+carro1.getCapacidadeTanque());
        System.out.println("Combustível: "+carro1.getCombustivel());

        Carro carro2 = new Carro("Honda Fit", "Zinça");
        System.out.println("Ano de Fabricação: "+carro2.getAnoFabricacao());

        System.out.println(carro1.getMarcha());

        /* O carro3 não tem nenhum atributo inicializado,
        porém, os que tem valor padrão, estão com os seus valores padrão
        ainda: seu modelo, cor, anoFabricacao e capacidadeTanque nascem null */
        Carro carro3 = new Carro();
        Carro carro4 = new Carro("Ferrari", "Vermelho", 2020, 100.0);
        carro4.setCor("Amarelo");
        carro4.setQuilometragem(60);
        System.out.println("IPVA: "+ carro4.getIPVA());
        System.out.println("Cor: "+ carro4.getCor());
        System.out.println("Está na Reserva: "+ carro4.isNaReserva());

        System.out.println(carro4.getCombustivel());
        carro4.abastecer(10);
        System.out.println(carro4.getCombustivel());
        carro4.acelerar(10);
        System.out.println(carro4.getCombustivel());
    }
}