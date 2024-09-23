package school.sptech.ex3;

public class Funcionario {
    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Integer percentualAjuste){
        Double percentualAjusteFormatado = (percentualAjuste*0.01)+1;
        salario *= percentualAjusteFormatado;
    }

    Double calcularValorHora(){
        return salario/220.0;
    }

    Double calcularHoraExtra(Integer horasExtra, Integer percentualNoturno){
        Double valorHora = calcularValorHora();
        Double percentualNoturnoFormatado = (percentualNoturno * 0.01)+1;

        return (valorHora*horasExtra) * percentualNoturnoFormatado;
    }
}