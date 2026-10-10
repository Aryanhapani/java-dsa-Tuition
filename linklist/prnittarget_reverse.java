import java.util.Stack;

public class prnittarget_reverse {
    static void main() {
        Linklist a=new Linklist();
        a.insert(545);
        a.insert(5454);
        a.insert(42343);
        a.insert(56);
//        a.print();
        a.printtargetrev(1);
    }
}

class Linklist{
    Node head,tail;

    public void insert(int data){
        Node nn=new Node(data);
        if (head==null){
            head=tail=nn;
        }else{
            tail.next=nn;
            tail=nn;
        }
    }
    public void print(){
        Node temp=head;
        while (temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void printtargetrev(int k){
        Node temp=head;
        Stack<Integer> stack=new Stack<>();

        while (temp != null){
            stack.push(temp.data);
            temp=temp.next;
        }

        int count=1;
        boolean print=false;
        while (!stack.isEmpty()){
            if (count==k){
                print=true;
                System.out.println(stack.pop());
                return;
            }
            count++;
            stack.pop();
        }
        if (!print){
            System.out.println("not");
        }
    }






}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}