import java.util.Scanner;

public class BubbleSort {
    /**
     * Primeiro e mais simples algoritmo de ordenação.
     * 
     * Compara cada elemento na posição i com o elemento na posição i + 1, e ordena
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] X = new int[5];
        int i, n, aux;
       
        Helper.inserir(X, i = 0);
        for (n = 1; n <= 5; n++){
        
            for(i = 0; i <= 3; i++){

                if (X[i] > X[i+1]){
                    aux = X[i];
                    X[i] = X[i+1];
                    X[i+1] = aux;
                }
            }
        }

        Helper.mostrar(X, i = 0);
    }
}
