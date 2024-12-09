package school.sptech.alunopos;

import school.sptech.Aluno;

public class AlunoPos extends Aluno {
    private Double notaTcc;

    /*
    Aluno é SUPERCLASSE (ou Classe Base) de AlunoPos
    AlunoPos é SUBCLASSE (ou Classe Derivada) de Aluno

    Uma subclasse herda tudo que é public, protected ou default
    default (ou package) é quando não tem nem private, nem public e nem protected

    Obs.: Classe Base e Classe Derivada geralmente é usada na linguagem C# -> Microsoft <<<<---- Avanade
    */
    public AlunoPos(String nome, Double nota1, Double nota2, Double nota3) {
        // Classe mãe = Superclass[super] (Quem possui o que será herdado)
        // Classe filha = Subclass (Quem herda a classe)
        super(nome, nota1, nota2, nota3);
    }

    public AlunoPos(String nome, Double nota1, Double nota2, Double nota3, Double notaTcc) {
        super(nome, nota1, nota2, nota3);
        this.notaTcc = notaTcc;
    }

    // Polimorfismo - Um mesmo elemento que assume várias formas dependendo de qual objeto chama ela
    // Exemplo: método calcularMedia() está presente em Aluno e AlunoPos, mas são diferentes em ambos
    @Override
    public Double calcularMedia(){
        return (getNota1()+getNota2()+getNota3()+notaTcc)/4;
    };

    @Override
    public String toString() {
        return "AlunoPos{" +
                "nome=" + getNome() +
                ", nota1=" + getNota1() +
                ", nota2=" + getNota2() +
                ", nota3=" + getNota3() +
                ", notaTcc=" + notaTcc +
                ", media=" + calcularMedia() +
                '}';
    }

    public Double getNotaTcc() {return notaTcc;}
}