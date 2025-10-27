public class CombSort {

    public static void ordenarComb(int [] vetor, int tamanho) {
        int numeroTrocas = 0;
        int numeroIteracoes = 0;
        boolean trocou = true;
        int vetorTemp = 0;
        int gap = tamanho;

        while(gap > 1 || trocou) {
            gap = (int)(gap / 1.3);
            if(gap < 1) {
                gap = 1;
            }
            trocou = false;

            for(int i = 0; (i + gap) < tamanho; i++) {
                numeroIteracoes += 1;
                if(vetor[i] > vetor[i + gap]) {
                    vetorTemp = vetor[i];
                    vetor[i] = vetor[i + gap];
                    vetor[i + gap] = vetorTemp;
                    numeroTrocas += 1;
                }
            }
        }
        System.out.println("Trocas: " + numeroTrocas);
        System.out.println("Iterações: " + numeroIteracoes);
    }
}
