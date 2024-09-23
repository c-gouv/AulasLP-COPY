import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class Usuario {
    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataNascimento;

    // Encapsulamento serve para esconder os detalhes de processamento do código do usuário
    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatador.format(dataNascimento);
    }

    public void setDataNascimento(String dataNascimento) {
        // DateTimeFormatter -> Formata a data para o formato desejado: dia/mês/ano
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Agora com o formatador configurado, passamos ele depois do atributo que será valor da data
        this.dataNascimento = LocalDate.parse(dataNascimento, formatador);
    }

    public Integer getIdade(){
        Long idade = ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
        return idade.intValue();
    }
}
