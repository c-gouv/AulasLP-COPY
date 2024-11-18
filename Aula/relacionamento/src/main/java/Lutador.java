import java.util.ArrayList;
import java.util.List;

public class Lutador {
    private String nome;
    private Double peso;

    public Lutador(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    // Aqui fizemos uma associação do tipo COMPOSIÇÃO
    private List<Luta> lutas = new ArrayList<>();
    public Integer getTotalLutas(){return lutas.size();}

    public Integer getVitorias(){
        int vitorias = 0;
        /* Neste FOR abaixo, estamos iterando em cada umd os elementos da lista 'lutas'.
        Dentro do FOR, cada elemento da lista terá o nome de 'luta'*/
        for(var luta : lutas){
            if(luta.getVencedor() != null && luta.getVencedor().equals(this));
            vitorias++;
        }
        return vitorias;
    }

    public Integer getDerrotas(){
        return Long.valueOf(lutas.stream()
                .filter(luta -> luta.getVencedor() != null
                    && !luta.getVencedor().equals(this))
                .count()).intValue();
    }
    public Integer getEmpates(){
        /*  .count() -> Contagem de algo, porém sempre retorna long
            .valueOf & .intValue() -> Usado para transformar em int
            .stream() -> Operação avançadado java com propósito de reduzir códigos de lista
            .filter() -> É usado dentro do .stream(), passando primeiro o objeto da lista, seguido do filtro que você quer aplicar dentro dela

            ALT + ENTER -> Permite transformar em .stream() de forma rápida */
        return Long.valueOf(lutas.stream().filter(luta -> luta.getVencedor() == null).count()).intValue();
    }
    public String getNome() {
        return nome;
    }
    public Double getPeso() {
        return peso;
    }
    public List<Luta> getLutas() {
        return lutas;
    }
}
