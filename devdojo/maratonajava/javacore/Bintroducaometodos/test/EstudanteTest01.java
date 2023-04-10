<<<<<<< HEAD
package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.nome = "jade";
        estudante.idade = 20;
        estudante.sexo = 'F';

        System.out.println("nome " + estudante.nome + ", idade " + estudante.idade + ", sexo " + estudante.sexo);
=======
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "jade";
        estudante01.idade = 15;
        estudante01.sexo = 'F';

        estudante02.nome = "ted";
        estudante02.idade = 16;
        estudante02.sexo ='M';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);


        System.out.println("-------");

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);
>>>>>>> 4a080c9 (introducao metodos)
    }
}
