import java.util.Scanner;

public class BubbleSortMelhorado02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int X[] = new int[5];
        int n, troca, aux, i;

        Helper.inserir(X, i = 0);
        n = 1;
        troca = 1;

        while (n <= 5 && troca == 1){

            for (i = 0; i < 3; i++){
                troca = 0;
                if(X[i] <= X[i+1]) {
                    troca = 1;
                    aux = X[i];
                    X[i] = X[i+1];
                    X[i+1] = aux;

                }
            }
            n = n + 1;
        }
        Helper.mostrar(X, i = 0); 
    }
}
