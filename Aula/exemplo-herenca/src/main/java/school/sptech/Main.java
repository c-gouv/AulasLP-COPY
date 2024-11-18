package school.sptech;

import school.sptech.alunocdf.AlunoCdf;
import school.sptech.alunopos.AlunoPos;

import java.util.Scanner;

public class Main {
    // "TEM UM" - Significa que elas possuem um relacionamento de Composição ou Agregação. (Biblioteca tem um livro)
    // "É UM" - Pode ser que haja um relacionamento de herença entre elas. (Biblioteca é um espaço público)

    public static void main(String[] args) {
        // Herença: Características e comportamentos que são herdados de outra classe.
        // No fim todas as classes acabam herdando as características de uma classe pai, a Object

        Aluno aluno1 = new Aluno("Manoel Almeida", 7.0, 5.0, 8.5);
        System.out.println(aluno1);

        AlunoPos aluno2 = new AlunoPos("João Pedro", 7.0, 10.0, 8.0, 10.0);
        System.out.println(aluno2);

        /*
        O código abaixo funciona porque todo AlunoPost é um Aluno
        sempre começamos da esqueda com o superclass
        Aqui nós DECLARAMOS como Aluno e INSTANCIAMOS como AlunoPos
        */
        Aluno aluno3 = new AlunoPos(
                "Maria Bigodenha",
                9.0,
                8.0,
                7.0,
                9.0
        );
        // A partir daqui, o alunoTeste pode invocar métodos de Aluno (e SOMENTE dele),
        // porque só podemos invocar métodos do tipo DECLARADO (Aluno)

        // O código abaixo NÃO compiila, pois a superclasse está na IMPLEMENTAÇÃO e não na DECLARAÇÃI
        // AlunoPos aluno3 = new Aluno(...)

        /*
        Em Tempo de Execução (Runtime), o Java executa a versão do método
        do tipo da INSTÂNCIA e NÃO da declaração
        Nesse caso, o 'alunoEspecial' executará os métodos de AlunoCdf
        */

        Aluno alunoEspecial = new AlunoCdf();
        System.out.println("Média: "+alunoEspecial.calcularMedia());
        // Executará a média do AlunoCdf

        Aluno dinamico;
        System.out.println("""
                Qual o tipo?
                1 - Pós
                2 - Comum
                NDA - CDF
                """);
        String tipo = new Scanner(System.in).nextLine();

        switch (tipo) {
            case "1":
                dinamico = new AlunoPos("Zeca", 10.0, 9.0, 8.0, 6.5);
                break;
            case "2":
                dinamico = new Aluno("Joana", 8.0, 7.0, 6.0);
                break;
            default:
                dinamico = new AlunoCdf();
        }

        System.out.println("Média do cabra lá: "+dinamico.calcularMedia());

        // Operador 'instancof': Verifica se um objeto é de uma determinada classe
        if(dinamico instanceof AlunoPos){
            /*
            Na linha abaixo fizemos a técnica chamada CAST
            fizemos um CAST do objeto 'dinamico' para o tipo AlunoPos
            NÃO É UMA CONVERSÃO, ele faz o objeto se comportador como algo
            */
            AlunoPos dinamicoPos = (AlunoPos) dinamico;
            System.out.println("Nota do TCC do mano paia: "+dinamicoPos.getNotaTcc());

            // é possível fazer um CAST sem criar variável, apenas p/ invocar métodos [só que é meio bizarrro]
            System.out.println( ((AlunoPos)dinamico).getNotaTcc() );
        }

        // Aqui nós numa mesma instrução, verificamos se
        // 'dinamico' é um AlunoCdf. SE FOR, já é criada a variável 'dinamicoCdf'
        // que será do tipo AlunoCdf;

        if(dinamico instanceof AlunoCdf dinamicoCdf){
            System.out.println(dinamicoCdf.getMetodoCdf());
        }

        Faculdade faculdadeBurra = new Faculdade("SPTech", "Haddock não sei o q");
        faculdadeBurra.matricularAluno(aluno1);
        faculdadeBurra.matricularAluno(aluno2);
        faculdadeBurra.matricularAluno(aluno3);
        faculdadeBurra.exibirAlunos();
        faculdadeBurra.exibirAlunosPosGraducao();
        System.out.println(faculdadeBurra.calcularMediaNotasTcc());
    }
}