public class doublylinklistfirst_and_last_node_swap {
    public static void main(String[] args) {
        
        Linklist a=new Linklist();
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.swapnode();
        a.print();
    }
}
class Linklist{
    Node head;
    Node tail;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head=tail=newNode;
            head.prev=head;
            head.next=head;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            head.prev=newNode;
            newNode.next=head;
        }
    }
    public void print(){
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while (temp!=head);
    }

    public void swapnode(){
        if (head == null || head.next == head) {
            return;
        }
        Node previous=null;
        Node second=head.next;
        Node temp=head;
        while (temp.next != head){
            previous=temp;
            temp=temp.next;
        }

       temp.next=second;
        second.prev=temp;
        previous.next=head;
        head.prev=previous;
        head.next=temp;
        temp.prev=head;
        head=temp;

    }
}
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
    }
}
