public class Main {

    public static void imprimirVetor(int[] vetor) {
        for(int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] vetor1_1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor1_2= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor1_3= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor1_4= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor1_5= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor1_6= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};

        int[] vetor2_1 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor2_2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor2_3 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor2_4 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor2_5 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor2_6 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};

        int[] vetor3_1 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] vetor3_2 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] vetor3_3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] vetor3_4 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] vetor3_5 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] vetor3_6 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        System.out.println("******** BubbleSort ********");
        System.out.println("Vetor Aleatório: ");
        BubbleSort.ordenarBubble(20, vetor1_1);
        imprimirVetor(vetor1_1);
        System.out.println("Vetor Ordenado Crescente: ");
        BubbleSort.ordenarBubble(20, vetor2_1);
        imprimirVetor(vetor2_1);
        System.out.println("Vetor Ordenado Descrescente: ");
        BubbleSort.ordenarBubble(20, vetor3_1);
        imprimirVetor(vetor3_1);

        System.out.println("******** BucketSort ********");
        System.out.println("Vetor Aleatório: ");
        int maiorVetor1 = BucketSort.getMaior(vetor1_2, 20);
        int menorVetor1 = BucketSort.getMenor(vetor1_2, 20);
        BucketSort.ordenarBucket(vetor1_2, 20, menorVetor1, maiorVetor1);
        imprimirVetor(vetor1_2);
        System.out.println("Vetor Ordenado Crescente: ");
        int maiorVetor2 = BucketSort.getMaior(vetor2_2, 20);
        int menorVetor2 = BucketSort.getMenor(vetor2_2, 20);
        BucketSort.ordenarBucket(vetor2_2, 20, menorVetor2, maiorVetor2);
        imprimirVetor(vetor2_2);
        System.out.println("Vetor Ordenado Descrescente: ");
        int maiorVetor3 = BucketSort.getMaior(vetor3_2, 20);
        int menorVetor3 = BucketSort.getMenor(vetor3_2, 20);
        BucketSort.ordenarBucket(vetor3_2, 20, menorVetor3, maiorVetor3);
        imprimirVetor(vetor3_2);

        System.out.println("******** CocktailSort ********");
        System.out.println("Vetor Aleatório: ");
        CocktailSort.ordenarCocktail(vetor1_3, 20);
        imprimirVetor(vetor1_3);
        System.out.println("Vetor Ordenado Crescente: ");
        CocktailSort.ordenarCocktail(vetor2_3, 20);
        imprimirVetor(vetor2_3);
        System.out.println("Vetor Ordenado Descrescente: ");
        CocktailSort.ordenarCocktail(vetor3_3, 20);
        imprimirVetor(vetor3_3);

        System.out.println("******** CombSort ********");
        System.out.println("Vetor Aleatório: ");
        CombSort.ordenarComb(vetor1_4, 20);
        imprimirVetor(vetor1_4);
        System.out.println("Vetor Ordenado Crescente: ");
        CombSort.ordenarComb(vetor2_4, 20);
        imprimirVetor(vetor2_4);
        System.out.println("Vetor Ordenado Descrescente: ");
        CombSort.ordenarComb(vetor3_4, 20);
        imprimirVetor(vetor3_4);

        System.out.println("******** GnomeSort ********");
        System.out.println("Vetor Aleatório: ");
        GnomeSort.ordenarGnome(vetor1_5, 20);
        imprimirVetor(vetor1_5);
        System.out.println("Vetor Ordenado Crescente: ");
        GnomeSort.ordenarGnome(vetor2_5, 20);
        imprimirVetor(vetor2_5);
        System.out.println("Vetor Ordenado Descrescente: ");
        GnomeSort.ordenarGnome(vetor3_5, 20);
        imprimirVetor(vetor3_5);


        System.out.println("******** SelectionSort ********");
        System.out.println("Vetor Aleatório: ");
        SelectionSort.ordenarSelection(vetor1_6, 20);
        imprimirVetor(vetor1_6);
        System.out.println("Vetor Ordenado Crescente: ");
        SelectionSort.ordenarSelection(vetor2_6, 20);
        imprimirVetor(vetor2_6);
        System.out.println("Vetor Ordenado Descrescente: ");
        SelectionSort.ordenarSelection(vetor3_6, 20);
        imprimirVetor(vetor3_6);

    }
}
