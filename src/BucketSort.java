public class BucketSort {

    public static void ordenarBucket(int [] vetor, int tamanho, int menor, int maior) {
        int numBaldes = 10;
        int numeroTrocas = 0;
        int numeroIteracoes = 0;
        ListaEncadeada[] baldes = new ListaEncadeada[numBaldes];


        int divisor = (maior - menor) / numBaldes;
        if(divisor == 0) {
            divisor = 1;
        }

        for(int i = 0; i < numBaldes; i++) {
            baldes[i] = new ListaEncadeada();
        }

        for(int i = 0; i < tamanho; i++) {
            numeroIteracoes += 1;

            int indiceBalde = (vetor[i] - menor) / divisor;
            if(indiceBalde < 0) {
                indiceBalde = 0;
            } else if(indiceBalde >= numBaldes) {
                indiceBalde = numBaldes - 1;
            }
            numeroTrocas += baldes[indiceBalde].insereOrdenado(vetor[i]);
        }

        int indice = 0;
        for(int i = 0; i < numBaldes; i++) {
            No atual = baldes[i].getLista();
            while(atual != null) {
                vetor[indice] = atual.getInformacao();
                indice += 1;
                numeroIteracoes += 1;
                atual = atual.getProximo();
            }
        }
        System.out.println("Trocas: " + numeroTrocas);
        System.out.println("Iterações: " + numeroIteracoes);
    }

    public static int getMenor(int[] vetor, int tamanho) {
        int menor = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] < menor){
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static int getMaior(int[] vetor, int tamanho) {
        int maior = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return maior;
    }
}
