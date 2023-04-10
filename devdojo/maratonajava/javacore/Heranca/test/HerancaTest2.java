package academy.devdojo.maratonajava.javacore.Heranca.test;

import academy.devdojo.maratonajava.javacore.Heranca.dominio.Funcionario;

public class HerancaTest2 {
    //0- Bloco de inicializacao estatico da super classe e executado quando a JVM carregar a classe pai
    //1- Bloco de inicializacao estatico da subclasse e executado quando a JVM carregar a classe filha
    //2- Alocado espaco em memoria pro objeto da super classe
    //3- Cada atributo de super classe e criado e inicializado com valores default ou o quer for passado
    //4- Bloco de inicializacao da super classe e executado na ordem em que aparece
    //5- construtor e executado da superclasse
    //6- Alocado espaco em memoria pro objeto da subclasse
    //7- Cada atributo de subclasse e criado e inicializado com valores default ou o quer for passado
    //8- Bloco de inicializacao da subclasse e executado na ordem em que aparece
    //9- construtor e executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("ted");
    }
}
