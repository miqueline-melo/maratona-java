package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01=10;
        int numero02=20;
        double resultado = numero01/numero02;
        System.out.println(resultado);

        //%
        int resto = 21%7;

        //<> <= >= == !=
        boolean isDezMaiorQueVinte = 10>=20;
        boolean isDezmenorQueVinte = 10<=20;
        boolean isDezigualVinte = 10==20;
        boolean isDezDiferenteDez = 10!=10.0;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezmenorQueVinte " + isDezmenorQueVinte);
        System.out.println("isDezigualVinte " + isDezigualVinte);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez );


        //&& (AND) ||(OR) !
        int idade=35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade> 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade > 30 && salario >=3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente>valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= /= %=
        double bonus  = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador02 = 0;

        System.out.println(++contador02);



    }
}
