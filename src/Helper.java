import java.util.Scanner;

public class Helper {
    /**
     * Este é uma classe que contém dois métodos para:
     * - inserir elementos num erray
     * - mostrar elementos de um erray
     * 
     * Esta classe usei para servir de ajuda para todos algoritmos que precisarem ler e mostrar elementos.
     */

    public static void inserir(int[] array, int i){
        /**
         * Metodo para inserir elementos num array, recebe um array e um index i(onde pretendes iniciar a inserção)
         */
        Scanner input = new Scanner(System.in);
        
        for (i = 0; i <= array.length - 1; i++){
            System.out.println("Escreva o valor do " + (i + 1) + "º número: ");
            array[i] = input.nextInt();
        }
    }

    public static void mostrar(int[] array , int i){  /**
        * Metodo para inserir elementos num array, recebe um array e um index i(de onde pretendes iniciar a demostração)
        */
        for(i = 0; i <= array.length - 1; i++){
            System.out.println( (i+1) + "º número: " + array[i]);
        } 
    }

    
}
