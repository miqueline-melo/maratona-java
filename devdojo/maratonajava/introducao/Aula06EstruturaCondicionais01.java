package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaCondicionais01 {
    public static void main(String[] args) {
        //while, do while, for
        int contador = 0;

        while (contador<10){
            System.out.println(contador);
            contador+=2;
        }
        do {
            System.out.println("dentro do do-while"+ ++contador);

        }while (contador<10);

        for (int i = 5; i < 10; i++) {
            System.out.println(i);

        }
    }
}
