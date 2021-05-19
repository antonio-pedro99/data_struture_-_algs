import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        int i;
        Helper.inserir(arr, i = 0);

        merge(arr, 0, 9);

        Helper.mostrar(arr, i = 0);
    }

    public static void merge(int[] arr, int inicio, int fim) {
        
        int meio;

        if (inicio < fim) {
            meio = (fim + inicio)/2;
            merge(arr, inicio, meio);
            merge(arr, meio + 1, fim);

            intercala(arr, inicio, fim, meio);
        }
    }

    public static void intercala(int[] arr, int inicio, int fim, int meio){

        int inicio_vector1, poslivre, inicio_vecto2, i;
        int aux[] = new int[10];

        inicio_vector1 = inicio;
        inicio_vecto2 = meio + 1;
        poslivre = inicio;

        while ( inicio_vector1 <= meio && inicio_vecto2 <= fim) {

            if (arr[inicio_vector1] <= arr[inicio_vecto2]) {
                aux[poslivre] = arr[inicio_vector1];
                inicio_vector1 = inicio_vector1 + 1;
            } else{
                aux[poslivre] = arr[inicio_vecto2];
                inicio_vecto2 = inicio_vecto2 + 1;
            }
            poslivre = poslivre + 1;
        }
        for (i = inicio_vector1; i <= meio; i++) {

            aux[poslivre] = arr[i];
            poslivre =  poslivre + 1;
        }
        
        for (i = inicio_vecto2; i <= fim; i++ ){
            arr[i] = aux[i];
        }
    }
}
