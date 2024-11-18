package sptech;

public class Carro {
    /*
    Um atributo private só pode ser acessado dentro da classe.
    Em outras classes não pode ser alterado nem lido.

    Atributos privados só podem ser alterados por outra classe:
        - Nos construtores
        - Em métodos públicos (Exemplo: Método Setter)

    Atributos privados só podem ser lidos por outra classe:
        - Por métodos público (Exemplo: Método Getter)

    Quando temos atributos privados que podem ser alterados ou lidos
    por meio de construtores e/ou métodos públicos,
    estamos implementando o conceito de ENCAPSULAMENTO */

    //É uma boa prática declarar os atributos como private
    private String modelo;
    private String cor;
    private Integer anoFabricacao;

    // É possível declarar atributos com valores padrão
    // Aqui estamos a dizer com quais valores os atributos devem ser inicializados
    private Integer quilometragem = 0;
    private Double combustivel = 0.0;
    private Integer marcha = 0;

    private Double capacidadeTanque;

    /* Aqui temos um constructor,
    que é um tipo de método especial que é chamado quando um objeto é instanciado.
    Alt + Insert -> Constructor

    O construtor NÃO influencia nos atributos com valor padrão
    A não ser que isso esteja EXPLICITAMENTE definido no construtor

    Os construtores são uma forma de implementar o conceito de Encapsulamento. */
    public Carro(String modelo, String cor, Integer anoFabricacao, Double capacidadeTanque) {
        // Os que começam com "this", são atributos do objeto
        // Os demais são parâmetros do método
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.capacidadeTanque = capacidadeTanque;

        /* Um método construtor é um método normal,
        Tudo que está codificado dentro dele é executado,
        quando o objeto é instanciado */
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    //Podemos ter mais de um construtor
    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    /* Quando criamos construtores que recebem valores,
    caso desejamos que o objeto seja instanciado sem valores,
    temos que criar um construtor sem parametros explicitamentea */
    public Carro(){
    }

    /* Aqui usamos um padrão de nome de método chamado getter,
    que faz parte do padrão JavaBeans.
    Quando um método público tem como objetivo retornar um dado ou informação
    de um objeto, ele começa com 'get' ou 'is' (nesse caso só para booleanos) */
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getAnoFabricacao() {
        return anoFabricacao==null ? "<Ainda não definido>" : anoFabricacao.toString();
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public Double getCombustivel() {
        return combustivel;
    }

    //Altere o getMarcha para retornar a marcha do carro atual:
    //Caso a marcha seja entre 1 e 5, retornar seu valor normalmente.
    //Caso a marcha seja 0, retornar "Neutro".
    //Caso a marcha seja -1, retornar "Ré".
    //Caso a marcha seja -2, retornar "P".
    public String getMarcha() {
        switch (marcha){
            case 0:case null: return "Neutro";
            case -1: return "Ré";
            case -2: return "P";
            default: return marcha.toString();
        }
    }

    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /* Aqui como não existe um atributo chamado "IPVA",
    dissemos que esse getter pode ser chamado de:
    - CAMPO CALCULADO
    - CAMPO VIRTUAL
    - ATRIBUTO VIRTUAL
    - ATRIBUTO CALCULADOR

    Regra de IPVA:
    1000 se a quilometragem for entre 0 e 2000
    700 se a quilometragem for mais que 2000 até 10000
    500 se a quilometragem for mais de 10000 */
    public Double getIPVA(){
        if(quilometragem >= 0 && quilometragem <= 2_000){
            return 1_000.0;
        } else if(quilometragem > 2_000 && quilometragem <= 10_000){
            return 700.0;
        }

        return 500.0;
    }

    /* Campo virtual: isNaReserva()
    Retorna boolean
    Um carro está na reserva se o combustível for menor que 10% da capacidade do tanque*/
    public boolean isNaReserva(){
        return combustivel <= (capacidadeTanque*0.1);
    }


    /* Aqui temos um setter.
    Também faz parte do padrão JavaBeans,
    e Também é uma forma de implementar o ENCAPSULAMENTO */
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCapacidadeTanque(Double capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    /* A ordem dos métodos não importa.
    A ordem dos getters e setters não importa */

    // Considerando que a maior é 6
    public void aumentarMarcha(){
        if(marcha < 5){
            marcha++;
        }
    }

    // Considerando que a menor marcha é -2(P)
    public void reduzirMarcha(){
        if(marcha >= -2){
            marcha--;
        }
    }

    public void neutro(){
        marcha = 0;
    }

    public void re(){
        marcha = -1;
    }

    public void estacionamento(){
        marcha = -2;
    }

    /* Crie métodos que ajudem no encapsulamento do "combustivel"
        - void abastaecer(double quantidadeNova)
        Ao ser invocado ele aumenta a quantidade do combustivel conforme o valor do parâmetro 'quantidadeNova'

        - void acelerar (int segundos)
        Ao ser invocado, ele reduz a quantidade do cobustível
        Para cada segundo, o carro consome 0.2 litros do combustível */

    void abastecer(double quantidadeNova){
        if(combustivel+quantidadeNova <= capacidadeTanque) {
            combustivel += quantidadeNova;
        } else{
            combustivel = capacidadeTanque;
        }
    }

    void acelerar(int segundos){
        if(combustivel >= 0.2){
            combustivel-=segundos*0.2;
        } else{
            combustivel = capacidadeTanque;
        }
    }

}