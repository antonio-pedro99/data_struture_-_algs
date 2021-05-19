public class App {
    public static void main(String[] args) {
        
        int list[] = {15, 20, 6, 1, 1, 11, 8, 16, 18};
        int i, menor, eleito, pos, j;

        for (i = 0; i <= list.length-2; i++){
            
            eleito = list[i];
            menor = list[i + 1];
            pos = i + 1;
            for (j = i+2; j <= list.length-1; j++){

                if(list[j] < menor){
                    menor = list[j];
                    pos = j;
                }
            }

            if (menor < eleito) {
                list[i] = list[pos];
                list[pos] = eleito;
            }
        }

        Helper.mostrar(list, i = 0);
    }
}
