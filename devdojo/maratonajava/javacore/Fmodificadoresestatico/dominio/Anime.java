package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio;

public class Anime {
    private String nome;
    private static  int[] episodios;
    //0- Bloco de inicializacao estatico e executado quando a JVM carregar a classe
    //1- Alocado espaco em memoria pro projeto
    //2- Cada atributo de classe e criado e inicializado com valores default ou o quer for passado
    //3- Bloco de inicializacao e executado
    //4- construtor e executado
     static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }


    }
    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        for (int episodios: Anime.episodios){
            System.out.println(episodios+ "  ");
        }
        System.out.println();
    }
    public String getNome(){
        return nome;
    }
    public int[] getEpisodios(){
        return episodios;
    }
}

