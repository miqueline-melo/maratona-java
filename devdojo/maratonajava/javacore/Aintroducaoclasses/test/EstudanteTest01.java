package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.nome = "jade";
        estudante.idade = 20;
        estudante.sexo = 'F';

        System.out.println("nome " + estudante.nome + ", idade " + estudante.idade + ", sexo " + estudante.sexo);
    }
}
