package escolapoo;

import escola.Aluno;
import escola.Turma;

import java.util.Date;

public class AssociaoParaUm {
    public static void main(String[] args){
        Turma turma1 = new Turma();
        turma1.setSigla("1A");
        turma1.setAno(1);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Jao");
        aluno1.setMatricula(123);
        aluno1.setDataNascimento(new Date());
        aluno1.setTurma(turma1);
        turma1.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("zé");
        aluno2.setMatricula(999);
        aluno2.setDataNascimento(new Date());
        aluno2.setTurma(turma1);
        turma1.adicionarAluno(aluno2);



        System.out.println("alunos da turma");
        for (int i = 0 ; i < turma1.quatidadeDeAlunos(); i++){
            System.out.println(turma1.pegarAluno(i).getNome());

        }

    }
}
