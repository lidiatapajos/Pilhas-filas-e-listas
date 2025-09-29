
public class FilaMain {

    public static void main(String[] args) throws Exception {

        Fila fila = new Fila(5);

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Primeiro da fila: " + fila.peek());

        while (!fila.isEmpty()) {
            System.out.println("Removido: " + fila.dequeue());
        }

        fila.dequeue();

    }
}
