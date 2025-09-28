
public class Pilha {

    int[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        elementos = new int[capacidade];
        topo = -1;
    }

    public void push(int valor) {
        if (topo == elementos.length - 1) {
            System.out.println("Pilha cheia! Não é possível adicionar " + valor);
        } else {
            topo++;
            elementos[topo] = valor;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia! Nada para remover.");
            return -1;
        } else {
            int valor = elementos[topo];
            topo--;
            return valor;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia! Nada no topo.");
            return -1;
        } else {
            return elementos[topo];
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }
}
