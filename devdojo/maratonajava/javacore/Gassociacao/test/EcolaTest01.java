package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EcolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Herbert");
        Professor[] professores = {professor};
        Escola escola = new Escola("Estrategia",professores);


        escola.imprime();
    }
}
