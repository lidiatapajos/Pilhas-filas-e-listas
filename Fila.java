
public class Fila {

    private int[] elementos;
    private int frente;
    private int tras;
    private int tamanho;

    public Fila(int capacidade) {
        elementos = new int[capacidade];
        frente = 0;
        tras = -1;
        tamanho = 0;
    }

    public void enqueue(int valor) {
        if (tamanho == elementos.length) {
            System.out.println("Fila cheia! Não é possível adicionar " + valor);
        } else {
            tras = (tras + 1) % elementos.length;
            elementos[tras] = valor;
            tamanho++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia! Nada para remover.");
            return -1;
        } else {
            int valor = elementos[frente];
            frente = (frente + 1) % elementos.length;
            tamanho--;
            return valor;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Fila vazia! Nada no início.");
            return -1;
        } else {
            return elementos[frente];
        }
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
}
