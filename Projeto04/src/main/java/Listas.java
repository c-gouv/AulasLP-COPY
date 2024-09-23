import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        //Sempre usar a List do tipo java.util
        //Aqui criamos uma lista que aceita qualquer tipo de classe
        List listaLoka = List.of("uva", 80, false, 9.5, "mato");
        System.out.println(listaLoka);

        //Aqui criamos uma lista que só aceita String
        List<String> frutas = List.of("maçã" , "uva", "pêra");

        //Aqui criamos uma lista que só aceita Numeros Reais
        List<Double> notas = List.of(9.0, 5.5, 8.7);

        //Lista vazia
        //List.of() -> Lista apenas de Leitura
        //new ArrayList<>() -> Lista com Leitura e Edição
        List<Integer> mundiaisPalmeira = new ArrayList<>();
        System.out.println(mundiaisPalmeira);

        mundiaisPalmeira.add(1951);
        mundiaisPalmeira.add(2026);
        System.out.println(mundiaisPalmeira);

        //Caso queira criar uma lista com edição já com elementos, basta criar um List.of num ArrayList

        List<String> paises = new ArrayList<>(List.of("Brasil", "México", "Peru"));
        System.out.println(paises);
        paises.add("Chile");
        System.out.println(paises);

        //Removendo a partir do valor
        paises.remove("México");
        System.out.println(paises);

        //Java 17
        System.out.println(paises.size()-1);

        //Java 21+
        System.out.println(paises.getLast());

        // [.set] -> Troca o valor de uma posição(índice)
        paises.set(1, "Paraguai");
        System.out.println(paises);

        //Aqui estamos removendo um item a partir da posição
        paises.remove(1);
        System.out.println(paises);

        //Removendo por valor, com itens repetidos
        List<String> ufs = new ArrayList<>(List.of("SP", "RJ", "SP"));
        ufs.remove("SP");
        System.out.println(ufs);

        System.out.println("Número de elementos numa lista: "+paises.size());
        paises.add("Colômbia");
        paises.add("Costa Rica");

        //Adicionando uma lista de uma vez
        paises.addAll(List.of("Venezuela", "Guiana Francesa"));

        for (int i = 0; i< paises.size();i++){
            System.out.println("Países na lista: "+paises.get(i));
        }

      //for(String pais : paises){
        for(var pais : paises){
            System.out.println("Países na lista: "+pais);
        }

        paises.forEach(pais -> {
            System.out.println("Países na lista: "+pais);
        });
    }
}
