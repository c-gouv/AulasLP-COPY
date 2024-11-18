public class AppEnums {
    public static void main(String[] args) {
        // Caso eu tente botar uma zona que não está dentro de ZonaSp, o código nem compila
        // criando um objeto enum com o valor direto
        ZonaSp zona1 = ZonaSp.LESTE;

        // criando um objeto de enum a partir de uma String
        String zonaTeste = "NORTE";
        ZonaSp zonaConvertida = ZonaSp.valueOf(zonaTeste);
        ZonaSp zonaConvertida2 = ZonaSp.valueOf("CENTRO");

        System.out.println(zona1);
        System.out.println(zonaConvertida);
        System.out.println(zonaConvertida2);

        EstacaoAno estacao1 = EstacaoAno.PRIMAVERA;
        System.out.println(estacao1.getDescricao());
        System.out.println("Temperatura Minima: %.2f".formatted(estacao1.getTempMin()));
        System.out.println("Temperatura Máxima: %.2f".formatted(estacao1.getTempMax()));

        // Podemos ITERAR em todos os valores de uma enum usando o .values()
        for(EstacaoAno estacao : EstacaoAno.values()){
            System.out.println(estacao.getDescricao());
        }

        // O usuario informa uma temperatura
        // O sistema diz qual é a estação do ano
        Double tempTeste = 25.5;
        EstacaoAno estacaoTeste = EstacaoAno.fromTemperatura(tempTeste);
        System.out.println("A estação para %.2f graus é %s".formatted(tempTeste, estacaoTeste.getDescricao()));
    }
}
