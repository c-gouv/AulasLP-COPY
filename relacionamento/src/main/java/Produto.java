public class Produto {
    private Integer codigo;
    private String nome;
    private Double precoCompra;

    // Aqui temos um relacionamento, uma associação entre Produto e Categoria (como se fosse um relacionamento entre tabelas de banco de dados)
    /* Não faz sentido uma Categoria sem Produto
    Nesse caso temos uma associação do tipo COMPOSIÇÃO */
    private Categoria categoria;

    /* Faz sentido um Usuário existir mesmo que não esteja em nenhum Produto
    Nesse caso temos um associação do tipo AGREGAÇÃO */
    private Usuario usuarioCadastro;

    public Produto(Integer codigo, String nome, Double precoCompra, Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.categoria = categoria;
    }
    public Produto(Integer codigo, String nome, Double precoCompra, Categoria categoria, Usuario usuarioCadastro) {
        /* A linha de baixo invoca o construtor já existente, o de cima aqui no código, e só adiciono um atributo a mais abaixo dele
        - Usado para reaproveitar os construtores já existentes economizando linhas de código */
        this(codigo, nome, precoCompra, categoria);
        this.usuarioCadastro = usuarioCadastro;
    }

    /* Se a margem de lucro da categoria for de 50
    o preço de venda do produto será preo de compra * 1,5.
    1 + 50 / 100 = 1.5 */
    public Double getPrecoVenda() {return precoCompra * (1+ (categoria.getMargemLucro() / 100));}
    public Integer getCodigo() {return codigo;}
    public String getNome() {return nome;}
    public Double getPrecoCompra() {return precoCompra;}
    public Categoria getCategoria() {return categoria;}
    public Usuario getUsuarioCadastro() {return usuarioCadastro;}
}
