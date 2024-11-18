public enum EstacaoAno {
    PRIMAVERA("Primavera, estação das flores", 20.0, 24.5),
    VERAO("Verão, estação quente", 24.51, Double.MAX_VALUE),
    OUTONO("Outono, onde as flores caem", 15.0, 19.99),
    INVERNO("Inverno, aquele friozinho", Double.MIN_VALUE, 14.9);

    // Atributo do tipo final, impossibilita a sua alteração
    // Em uma enum, todos os atributos são final
    private final double tempMax;
    private final String descricao;
    private final double tempMin;

    EstacaoAno(String descricao, double tempMin, double tempMax) {
        this.descricao = descricao;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    // "static" permite invocar o método direto pela classe
    public static EstacaoAno fromTemperatura(Double temperatura){
        for(EstacaoAno estacao : values()){
            if(temperatura >= estacao.tempMin && temperatura <= estacao.tempMax){
                return estacao;
            }
        }

        return null; // Caso a temperatura informada não esteja em nenhum intervalo
    }

    public double getTempMax() {
        return tempMax;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getTempMin() {
        return tempMin;
    }
}
