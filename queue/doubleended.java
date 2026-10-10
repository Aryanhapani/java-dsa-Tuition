import java.util.Arrays;

public  class doubleended {
    static int[] dounbleended=new int[5];
    static int front=-1;
    static int rear=-1;
    public static void insertfirst(int value){
        if (front==-1){
            front=0;
            rear=0;
            dounbleended[front]=value;
        } else if (front==0 && rear==dounbleended.length-1) {
            System.out.println("doubleended queue is full");
        }else if (front > 0){
            front--;
            dounbleended[front]=value;
        }else{
            for (int i=rear;i>=0;i--){
                dounbleended[i+1]=dounbleended[i];
            }
            rear++;
            dounbleended[front]=value;
        }
    }
    public static void insertlast(int value){
        if (front==-1){
            front=0;
            rear=0;
            dounbleended[front]=value;
        } else if (front==0 && rear==dounbleended.length-1) {
            System.out.println("doubleended queue is full");
        } else if (rear < dounbleended.length-1) {
            rear++;
            dounbleended[rear]=value;
        }else{
            for (int i=0;i<rear;i++){
                dounbleended[i]=dounbleended[i+1];
            }
            front--;
            dounbleended[rear]=value;
        }
    }
    public static void deltefirst(){
        if (front==-1){
            System.out.println("doubleended queue is empty");
        } else if (front==rear) {
            front=-1;
            rear=-1;
        }else{
            front++;
        }


    }

    public static void deltelast(){
        if (front==-1){
            System.out.println("doubleended queue is empty");
        }else if(front==rear){
            front=-1;
            rear=-1;
        }else {
            rear--;
        }
    }
    static void main() {
       insertfirst(10);
       insertlast(2000);
       insertfirst(3000);
       insertlast(4000);
       insertfirst(5000);
       deltefirst();
       deltelast();
       deltefirst();
       deltelast();
       deltefirst();
       insertfirst(1002403);
        System.out.println(Arrays.toString(dounbleended));
    }

}