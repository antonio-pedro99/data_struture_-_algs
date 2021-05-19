import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X[] = new int[5];
        int pos, i, j, eleito, menor;

        Helper.inserir(X, i=0);       
        for (i = 0; i <= 3; i++) {

            eleito = X[i];
            menor  = X[i + 1];
            pos    = i + 1;

            for (j = i+2; j <= 4; j++){
                if (X[j] < menor){
                    menor = X[j];
                    pos   = j;
                }
            }

            if (menor < eleito) {
                X[i]   = X[pos];
                X[pos] = eleito;
            }
        }
        Helper.mostrar(X, i = 0);
    }
}