public class SelectionSort {

     public static void ordenarSelection(int [] vetor, int tamanho) {
        int numeroTrocas = 0;
        int numeroIteracoes = 0;
        int vetorTemp = 0;

        for(int i = 0; i < tamanho - 1; i++) {
            numeroIteracoes += 1;
            int indiceMenorValor = i;
            for(int j = i + 1; j < tamanho; j++) {
                if(vetor[j] < vetor[indiceMenorValor]) {
                    indiceMenorValor = j;
                }
            }

            if(indiceMenorValor != i){
                vetorTemp = vetor[i];
                vetor[i] = vetor[indiceMenorValor];
                vetor[indiceMenorValor] = vetorTemp;
                numeroTrocas += 1;
            }
        }
         System.out.println("Trocas: " + numeroTrocas);
         System.out.println("Iterações: " + numeroIteracoes);
    }
}
