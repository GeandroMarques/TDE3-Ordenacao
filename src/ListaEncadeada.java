public class ListaEncadeada {
    private No lista;

    public ListaEncadeada() {
        this.lista = null;
    }

    public No getLista() {
        return lista;
    }

    public boolean vazia(){
        if(lista == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserePrimeiro(int info) {
        No no = new No(info);
        if(vazia()) {
            lista = no;
        } else {
            no.setProximo(lista);
            lista = no;
        }
    }

    public void insereDepois(int indice, int info) {
        int saltos = 0;
        No atual = lista;
        No no = new No(info);
        if(vazia()) {
            System.out.println("Lista vazia, inserindo na primeira posição!");
            inserePrimeiro(info);
            return;
        }

        while (atual != null && saltos < indice) {
            atual = atual.getProximo();
            saltos += 1;
        }

        if (atual == null) {
            System.out.println("Índice inexistente!");
        } else {
            no.setProximo(atual.getProximo());
            atual.setProximo(no);
        }
    }


    public void insereUltimo(int info) {
        if(vazia()) {
            inserePrimeiro(info);
        } else {
            No no = new No(info);

            No atual = lista;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(no);
        }
    }

    public int insereOrdenado(int info) {
        No no = new No(info);
        int numTrocas = 0;

        if(vazia()) {
            inserePrimeiro(no.getInformacao());
        } else if(no.getInformacao() < lista.getInformacao()) {
            no.setProximo(lista);
            lista = no;
            numTrocas += 1;
        } else {
            No atual = lista;
            while(atual.getProximo() != null && atual.getProximo().getInformacao() < no.getInformacao()) {
                atual = atual.getProximo();
            }
            no.setProximo(atual.getProximo());
            atual.setProximo(no);
            numTrocas += 1;
        }
        return numTrocas;
    }

    public void imprime() {
        No atual = lista;

        while(atual != null) {
            System.out.print(" [" + atual.getInformacao() + "] --> " );
            atual = atual.getProximo();
        }
        System.out.println("NULL");
    }

    public void removePrimeiro() {
        if(vazia()) {
            System.out.println("A lista está vazia!");
        } else {
            No no_removido = lista;
            lista = lista.getProximo();
            System.out.println("Nó removido: " + no_removido.getInformacao());
        }
    }



    public void removeUltimo() {
        No atual = lista;
        if(vazia()) {
            System.out.println("A lista está vazia");
            return;
        }
        if(lista.getProximo() == null) {
            No no_removido = lista;
            lista = null;
            System.out.println("Nó removido: " + no_removido.getInformacao());
        } else {
            while(atual.getProximo().getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        No no_removido = atual.getProximo();
        atual.setProximo(null);
        System.out.println("Nó removido: " + no_removido.getInformacao());
    }

    public void remove(int indice) {
        if(vazia()) {
            System.out.println("A lista está vazia!");
            return;
        }

        if(indice == 0) {
            No no_removido = lista;
            lista = lista.getProximo();
            System.out.println("Nó removido: " + no_removido.getInformacao());
            return;
        }

        No atual = lista;
        int saltos = 0;
        while(atual != null && saltos < indice - 1) {
            atual = atual.getProximo();
            saltos+= 1;
        }
        if(atual == null || atual.getProximo() == null) {
            System.out.println("Índice inexistente!");
        } else {
            No no_removido = atual.getProximo();
            atual.setProximo(no_removido.getProximo());
            System.out.println("Nó removido com sucesso! Nó removido: " + no_removido.getInformacao());
        }
    }
}

