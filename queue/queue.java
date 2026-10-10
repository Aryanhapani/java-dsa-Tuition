import java.util.Arrays;

public class queue {
    public static void main(String[] args) {
        int[] queue=new int[5];
   int front=-1;
   int rear=-1;
   int[] forntendrear;
//
   rear=enqueue(queue, rear, 10);
   rear=enqueue(queue, rear, 20);

        forntendrear=dequeue(queue, front, rear);
        front=forntendrear[0];
        rear=forntendrear[1];
        forntendrear=dequeue(queue, front, rear);
        front=forntendrear[0];
        rear=forntendrear[1];
        forntendrear=dequeue(queue, front, rear);
        front=forntendrear[0];
        rear=forntendrear[1];
        rear=enqueue(queue, rear, 30);
        rear=enqueue(queue, rear, 10);
        rear=enqueue(queue, rear, 10);


        System.out.println(Arrays.toString(queue));


    }
    public static int[] dequeue(int[] queue,int fornt,int rear){
        int[] fronandrear=new int[2];
        //if stack is empty
        if (fornt==rear){
            System.out.println("stack isempty");
            fronandrear[0]=fornt;
            fronandrear[1]=rear;
            return fronandrear;
        }
        //if stack has element
        fornt++;
        System.out.println(queue[fornt] +":-deleted element");
        //if stack deleted to last element
        if (fornt==rear){
            fornt=-1;
            rear=-1;
        }
        //your delted front and rear index
        fronandrear[0]=fornt;
        fronandrear[1]=rear;
        return fronandrear;

    }
    public static int enqueue(int[] queue,int rear,int value){
     if (queue.length-1==rear){
         System.out.println("queue is full");
         return rear;
     }

        rear++;
        queue[rear]=value;
        return rear;
    }
    }

