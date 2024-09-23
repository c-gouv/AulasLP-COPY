public class Cachorro {
    //Aqui criamos a função latir()
    //Como está dentro de uma Classe, chamamos de MÉTODO
    //Método 'latir'
    void latir(){
        System.out.println("Cachorro latindo... auauau");
    }

    //Aqui criamos a função farejar()
    void farejar(){
        System.out.println("Cachorro farejando... snif snif");
    }

    //O "()" indica se o método/função precisa de alguma coisa para funcionar
    //Caso não precise de nenhum PARÂMETRO para rodar, o "()" é passado vazio
    //Caso precise de algum PARÂMETRO para rodar, é preciso passar o tipo e o nome do PARÂMETRO (String alimento)
    //Voa mlk
    void comer(String alimento){
        //Dentro do método, o parâmetro é usado como variável
        System.out.println("Cachorro comendo %s".formatted(alimento));
    }

    //Método com 2 PARÂMETROS
    void passear(String local, Integer minutos){
        System.out.println("Cachorro passeando em %s, por %d minutos".formatted(local, minutos));
    }

    /*
    Método 'receberVacina'
    Parâmetros: vacina(texto), preco(real), veterinário(a) (texto)
    "Cachorro recebendo a vacina X, que custou R$Y, pelo doutor(a) Z"
    */
    void receberVacina(String vacina, Double preco, String veterinario){
        System.out.println("Cachorro recebendo a vacina %s, que custou R$%.2f pelo doutor(a) %s".formatted(vacina, preco, veterinario));
    }

    /*
    Método 'calcularPreco'
    Parâmetros: Raça(texto), Se é nobre(boolean), Se é fêmea(boolean)
    "Um exemplar da raça X, por ser nobre e fêmea, custa R$Y"
    Regra:
    - A frase do meio pode ser "por ser nobre" ou "por NÃO ser nobre"
    - Na frase pode constar "fêmea" ou "macho"
    - O valor de Y é no mínimo 500. Se for de raça nobre, multiplica 10x,
      se for fêmea multiplica por 3x
    */

    // Quando eu precisar retornar um valor dentro de um função, eu troco o void pelo tipo de valor que estou retornando
    Double calcularPreco(String raca, Boolean mestico, Boolean macho){
        Double precoCachorro = 500.00;
        String fraseNobre = mestico ? "por NÃO ser nobre" : "por ser nobre";
        String sexo = macho ? "macho" : "fêmea";

        if(!mestico){
            precoCachorro *= 10;
        }
        if(!macho){
            precoCachorro *= 3;
        }

        System.out.println("Um exemplar da raça %s, %s e %s, custa R$%.2f".formatted(raca, fraseNobre, sexo, precoCachorro));
        return precoCachorro;
    }

    public static void main(String[] args) {
        System.out.println("Iniciado app de cachorros");

        Cachorro cao = new Cachorro();

        cao.farejar();
        cao.latir();
        cao.latir();

        cao.comer("bananae");
        cao.passear("Ibirapuera", 10);

        cao.receberVacina("Dorflex", 10.99, "Juliana");

        //Caso a função retorne alguma coisa, eu posso usar ela para atribuir valores
        Double preco1 = cao.calcularPreco("Pug", false, false);
        System.out.println(preco1);

        cao.calcularPreco("Pug", false, false);
    }
}