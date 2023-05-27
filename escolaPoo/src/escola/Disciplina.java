package escola;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    private ArrayList<Professor> professores;

    private ArrayList<Turma> turmas;

    public Disciplina(){
        professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void excluirProfessor(Disciplina disciplina) {
        professores.remove(disciplina);
    }

    public int quantidadeProfessor() {
        return professores.size();
    }

    public Professor getProfessor(int posicao){
        return professores.get(posicao);

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        }
    }

}
