package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade= 10;
        long numeroGrande= 1000000;
        double salarioDouble= 2000.00;
        float salarioFloat= 250.0F;
        byte idadeShort= 10;
        boolean verdadeiro= true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "É um graaaaande texto";


        System.out.println("A idade é " + idade + "anos");
        System.out.println(falso);
        System.out.println("char" + caractere);
        System.out.println(numeroGrande);
        System.out.println(nome);
    }
}
