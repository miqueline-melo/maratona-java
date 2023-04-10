package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new  Local ("Rua das laranjeiras");
        Aluno aluno = new Aluno("Ted",20);
        Professor professor = new Professor("Thailus","Direito Adm");
        Aluno [] alunosParaSeminario= {aluno};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario [] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
