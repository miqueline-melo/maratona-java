package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaCondicionais03 {
    public static void main(String[] args) {
        int valorMaximo = 50;

        for (int i = 0; i <=valorMaximo; i++) {
            if (i>25) {
                break;
            }
            System.out.println(i);
        }
    }
}
