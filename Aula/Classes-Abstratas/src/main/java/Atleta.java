// Aqui temos uma classe ABSTRATA
public abstract class Atleta {
    protected String nome;
    protected Integer ranking;

    public abstract  void treinar();

    public void hidratarSe(){
        System.out.println("Atleta %s bebendo líquido".formatted(nome));
    }

    public String getNome() {return nome;}
    public Integer getRanking() {return ranking;}
    public void setNome(String nome) {this.nome = nome;}
    public void setRanking(Integer ranking) {this.ranking = ranking;}
}
