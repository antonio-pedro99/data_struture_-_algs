import java.util.Scanner;

public class InsertionSort {
    /**
     *  
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int arr[] = new int[5];
        int i, j, eleito;

        Helper.inserir(arr, i = 0);
        for (i = 1; i <= 4; i++){
            
            eleito = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > eleito){
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = eleito;
        }
        Helper.mostrar(arr, i = 0);
    }
}
