public class CocktailSort {

    public static void ordenarCocktail(int [] vetor, int tamanho) {
        boolean trocou = true;
        int vetorTemp = 0;
        int inicio = 0;
        int fim = tamanho - 1;
        int numeroTrocas = 0;
        int numeroIteracoes = 0;

        while(trocou) {
            trocou = false;

            for(int i = inicio; i < (fim); i++) {
                numeroIteracoes += 1;
                if (vetor[i] > vetor[i + 1]) {
                    vetorTemp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = vetorTemp;
                    trocou = true;
                    numeroTrocas += 1;
                }
            }

            if (!trocou) break;

            trocou = false;
            fim -= 1;

            for(int i = fim; i > inicio; i--) {
                if(vetor[i] < vetor[i - 1]) {
                    vetorTemp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = vetorTemp;
                    trocou = true;
                    numeroTrocas += 1;
                }
            }
            inicio += 1;
        }
        System.out.println("Trocas: " + numeroTrocas);
        System.out.println("Iterações: " + numeroIteracoes);
    }
}
