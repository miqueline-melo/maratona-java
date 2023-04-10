package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutirizadoComprarBebida = idade >= 18;
        //!
        if (isAutirizadoComprarBebida!= false){
            System.out.println("Autorizado comprar bebida alcolica");
        }else{
            System.out.println("Nao autorizado a comprar bebida alcolica");
        }
        if (!isAutirizadoComprarBebida){
            System.out.println("Nao autorizado a comprar bebida alcolica");
        }
        boolean c = false;
        if (c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

         System.out.println("Fora do if");
    }
}
