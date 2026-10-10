import java.util.Arrays;

public class circular_queue {
    static int[] circlarqueue=new int[5];
    static int front=-1;
    static int rear=-1;
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        print();
        System.out.println(Arrays.toString(circlarqueue));
     
    }
    public static void print(){
        if (front==-1) {
            System.out.println("queue is empty");
        }else{
            int i=front;
            while (i!=rear) {
                System.out.println(circlarqueue[i]);
                i=(i+1)%circlarqueue.length;
            }
            System.out.println(circlarqueue[i]);
        }
    }
    public static void dequeue(){
        if (front==-1) {
            System.out.println("queue is empty");
        }else if(front==rear){
            front=-1;
            rear=-1;
        }else{
            front=(front+1)%circlarqueue.length;
        }
    }
    public static void enqueue(int value){
        if (front==-1) {
            front=0;
            rear=0;
            circlarqueue[rear]=value;
        }else if((rear+1)%circlarqueue.length==front){
            System.out.println("queue is full");
        }else{
            rear=(rear+1)%circlarqueue.length;
            circlarqueue[rear]=value;
        }
    }
}
