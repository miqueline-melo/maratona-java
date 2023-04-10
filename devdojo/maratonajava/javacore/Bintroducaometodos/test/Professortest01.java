package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class Professortest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "thiago";
        professor.idade = 28;
        professor.sexo ='M';

        System.out.println("nome " + professor.nome + ", idade " + professor.idade + ", sexo " + professor.sexo);
    }
}
