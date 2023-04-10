package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1,2,3};

        int [][] arraysInt = new int[3][];

        arraysInt[0] = new int[2];
        arraysInt[1] = array;
        arraysInt[2] = new int[]{1,2,3,4,5,6};

        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for (int[] arrayBase: arraysInt){
            System.out.println("\n-------");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
        }


    }
}
