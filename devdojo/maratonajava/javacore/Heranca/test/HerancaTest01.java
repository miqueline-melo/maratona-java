package academy.devdojo.maratonajava.javacore.Heranca.test;

import academy.devdojo.maratonajava.javacore.Heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Heranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Heranca.dominio.Pessoa;


public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("pitty", "4444444444");
        pessoa.setCpf("1111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("ted");
        funcionario.setCpf("2211455112");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("--------------");
        funcionario.imprime();

    }
}
