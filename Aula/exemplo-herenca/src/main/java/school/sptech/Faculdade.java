package school.sptech;

import school.sptech.alunopos.AlunoPos;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private String endereco;
    private List<String> cursos;
    private List<Aluno> alunos;

    public Faculdade(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.cursos = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void exibirAlunos(){
        System.out.println("\nExibir alunos da faculdade "+nome);
        for (Aluno aluno: alunos){
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Nota 1: "+ aluno.calcularMedia());
            if(!(alunos.getLast() == aluno)){
                System.out.println("--------------------------------------");
            }
        }
    }

    public void exibirAlunosPosGraducao(){
        System.out.println("\nExibir todos os Alunos Pos Graduação da faculdade "+nome);
        for(Aluno aluno : alunos){
            if(aluno instanceof AlunoPos){
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Nota 1: "+ aluno.calcularMedia());
                if(!(alunos.getLast().equals(aluno))){
                    System.out.println("--------------------------------------");
                }
            }
        }
    }

    public Double calcularMediaNotasTcc() {
        System.out.println("\nExibindo média da nota do TCC");
        Integer qtdAlunos = 0;
        Double notaTcc = 0.0;
        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoPos alunoPos) {
                notaTcc += alunoPos.getNotaTcc();
                qtdAlunos += 1;
            }
        }
        return notaTcc/qtdAlunos;
    }


    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getEndereco() {
        return endereco;
}

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
