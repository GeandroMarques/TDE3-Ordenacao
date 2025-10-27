public class GnomeSort {

    public static void ordenarGnome(int [] vetor, int tamanho) {
        int i = 0;
        int vetorTemp = 0;
        int numeroTrocas = 0;
        int numeroIteracoes = 0;

        while(i < tamanho) {
            numeroIteracoes += 1;
            if(i == 0 || vetor[i - 1] <= vetor[i]) {
                i += 1;
            } else {
                vetorTemp = vetor[i];
                vetor[i] = vetor[i - 1];
                vetor[i - 1] = vetorTemp;
                numeroTrocas += 1;
                i -= 1;
            }
        }
        System.out.println("Trocas: " + numeroTrocas);
        System.out.println("Iterações: " + numeroIteracoes);
    }
}
