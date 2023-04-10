package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("micke");
        funcionario.setIdade(28);
        funcionario.setSalarios(new double[]{10000, 5000 , 7000});
        funcionario.imprime();

        System.out.println("media" + funcionario.getMedia());

    }
}

