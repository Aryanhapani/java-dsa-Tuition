import java.util.LinkedList;
import java.util.Queue;

public class queue_collection_framework {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        queue.offer(1000);
        queue.offer(3000);
        queue.offer(5000);
        queue.poll();
        
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue);
    }
}
