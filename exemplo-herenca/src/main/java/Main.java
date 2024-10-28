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
    }
}
