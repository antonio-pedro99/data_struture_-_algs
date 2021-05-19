import java.util.Scanner;

public class BubbleSort01 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int[] X = new int[5];
        int i, aux, n;

        Helper.inserir(X, i = 0);
        for (n = 1; n <= 4; n++){
            for(i = 4; i >= n; i--){

                if(X[i] < X[i - 1]){
                    aux    = X[i];
                    X[i]   = X[i - 1];
                    X[i-1] = aux;
                }
            }
        }
        Helper.mostrar(X, i = 0);
    }
}
