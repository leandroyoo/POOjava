package escolapoo;

import escola.Disciplina;
import escola.Professor;

public class AssociacaoMuitosParaMuitos {
    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matematica");
        disciplina1.setCargaHoraria(80);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Portugues");
        disciplina2.setCargaHoraria(80);

        Professor professor1 = new Professor();
        professor1.setNome("Joao");
        professor1.setMatricula(888);
        professor1.setFormaçãoAcademica("Licenciada");
        professor1.setSalario(100);


        Professor professor2 = new Professor();
        professor2.setNome("Maria");
        professor2.setMatricula(999);
        professor2.setFormaçãoAcademica("Licenciada");
        professor2.setSalario(300);

        //relaçao do jao com matematica
        professor1.adicionarDisciplina(disciplina1);
        disciplina1.adicionarProfessor(professor1);

        //relacao do jao com portugues
        professor1.adicionarDisciplina(disciplina2);
        disciplina1.adicionarProfessor(professor1);

        //relacao da maria com portugues
        professor2.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor2);

        //lISTAR AS DISCIPLINAS DO PROFESSOR JAO
     /*   for (int i = 0; i < professor1.quantidadeDisciplinas() ; i++){
            System.out.println(professor1.getDisciplina(i).getNome());
        }
*/
        //lista os professores da disciplina de portugues
        for(int i=0; i < disciplina2.quantidadeProfessor(); i++){
            System.out.println(disciplina2.getProfessor(i).getNome());
        }


    }

}
