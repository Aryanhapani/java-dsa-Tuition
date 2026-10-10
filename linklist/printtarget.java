public class printtarget {
   public static void main() {
        Linklist a=new Linklist();
        a.insert(545);
        a.insert(5454);
        a.insert(42343);
//        a.print();
        a.printtargetelement(2);
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

    public void printtargetelement(int k){
        Node temp=head;
        int count=1;
        boolean print=false;
        while (temp != null){

            if (count==k){
                System.out.println(temp.data);
                print=true;
                return;
            }
            count++;
            temp=temp.next;
        }
        if (!print){
            System.out.println("not found");
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