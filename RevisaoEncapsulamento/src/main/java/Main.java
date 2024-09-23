import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Manoel", "manoel@gmail.com");


        usuario1.setCpf("123456789");
        /* Para alterar a data podemos usar: usuario1.setDataNascimento(LocalDate.parse("200-11-28"));
        Entretanto esse código fica muito extenso e sucetível a erros, além de não ser seguro pois não abstrai o suficiente para o usuário, por isso passamos o trabalho do LocalDate.parse para o método*/

        usuario1.setDataNascimento("12/12/2000");
        System.out.println("Data de Nascimento: "+usuario1.getDataNascimento());
        System.out.println("Idade: "+usuario1.getIdade());

        if(usuario1.getNome().equals("Manoel")){
            System.out.println("Engual");
        } else{
            System.out.println("Diferente");
        }
    }
}
