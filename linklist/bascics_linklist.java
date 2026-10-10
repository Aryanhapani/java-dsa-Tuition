import java.util.Stack;

public class bascics_linklist {
    static void main() {
      Linklist a=new Linklist();
      a.insert(10);
      a.insert(56545);
      a.insert(67980);
      a.rev();
     


    }
}

class Linklist{
    Node head,tail;

    public void insert(int data){
        Node nn=new Node(data);
        if (head==null){
            head=tail=nn;
        }else{
            tail.next=nn;//last element address
            tail=nn; //last element
        }
    }

    public  void rev(){
        Node temp=head;
        Stack<Integer>  stack=new Stack<>();

        while (temp != null) {
            stack.push(temp.data);

            temp=temp.next;

        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public void print(){
        Node temp=head;
        while (temp != null){
            System.out.println(temp.data);

            temp=temp.next;
        }
    }

    public void update(int oldvalue,int newvalue){
        Node temp=head;
        while (temp != null){
            //if you only change first value you can return it if you dont need
            //you can use without retrun for all value update
            if (temp.data == oldvalue){
                temp.data=newvalue;
                return;
            }
            temp=temp.next;
        }


    }

    public void delete(int k){
        Node temp=head;
        Node previous=null;
        boolean found=false;
        while (temp != null){
            if (temp.data==k){
                found=true;
                if (temp==head){
                    head=head.next;
                    temp=head;
                    if (head==null){
                        tail=null;
                    }
                }else{
                    previous.next=temp.next;
                    if (temp==tail){
                        tail=previous;
                    }
                    temp=previous.next;
                }

            }else{
                previous=temp;
                temp=temp.next;

            }
        }

        if (!found){
            System.out.println("not found");
        }

    }
    public void find(int value){
        Node temp=head;
        while (temp!=null){
            if (temp.data==value){
                System.out.println("value is present");
                return;
            }

            temp=temp.next;
        }
        System.out.println("value not present");



    }
}

//create node class

class Node{
    //it can take data
    int data;
    //it can contain whole node
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;//first of all null node
    }
}

