public class BubbleSort {

    public static void ordenarBubble(int tamanho, int[] vetor) {
        int vetorTemp = 0;
        boolean trocas;
        int numeroTrocas = 0;
        int numeroIteracoes = 0;

        for(int i = 0; i < tamanho; i++) {
            trocas = false;
            numeroIteracoes += 1;
            for(int j = 1; j < (tamanho - i); j++) {
                if(vetor[j-1] > vetor[j]) {
                    vetorTemp = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = vetorTemp;
                    trocas = true;
                    numeroTrocas += 1;
                }
            }
            if(!trocas) break;
        }
        System.out.println("Trocas: " + numeroTrocas);
        System.out.println("Iterações: " + numeroIteracoes);
    }
}
