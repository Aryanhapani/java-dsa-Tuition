import java.util.Arrays;

public class queue_better {
     static int[] queue = new int[5];
    static int front=-1, rear=-1;
    public static void main(String[] args) {
       
    enqueue(20);
    enqueue(40);
    enqueue(50);
    dequeue();
    System.out.println(Arrays.toString(queue));
    enqueue(200);
    System.out.println(Arrays.toString(queue));


    System.out.println();


    }

    public static void dequeue(){
        if (front==rear) {
            System.out.println("queue is empty");
            return ;

        }

        front++;
        System.out.println(queue[front]+"your deleted element:-");
        

        if (front==rear) {
            front=-1;
            rear=-1;
            
        }

    }
    public static void enqueue(int value){
        if (queue.length-1==rear) {
            System.out.println("queue is full");
            return ;
           
        }

        rear++;
        queue[rear]=value;

    }
}
