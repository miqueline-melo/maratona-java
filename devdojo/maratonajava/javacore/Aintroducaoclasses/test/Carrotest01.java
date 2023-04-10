package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class Carrotest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Gol";
        carro1.modelo = "popular";
        carro1.ano = 2020;

        carro1 = carro2;

        carro2.nome = "Palio";
        carro2.modelo = "Popular";
        carro2.ano = 2022;


        System.out.println("\ncarro 1 " + " Nome " + carro1.nome + " Modelo " + carro1.modelo + " Ano " + carro1.ano);
        System.out.println("\ncarro2 " + " Nome " + carro2.nome + " Modelo " + carro2.modelo + " Ano " + carro2.ano);
    }
}
