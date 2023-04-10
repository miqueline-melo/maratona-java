package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    //1- Alocado espaco em memoria pro projeto
    //2- Cada atributo de classe e criado e inicializado com valores default ou o quer for passado
    //3- Bloco de inicializacao e executado
    //4- construtor e executado
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    public Anime (String nome){
        this.nome = nome;
    }

    public Anime(){
        for (int episodios: this.episodios){
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
    {
        System.out.println("Dentro do bloco de inicializacao");
    }
}

