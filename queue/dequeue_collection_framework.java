import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue_collection_framework {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();

        deque.addFirst(10);
        deque.addLast(3000);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
    }
}
