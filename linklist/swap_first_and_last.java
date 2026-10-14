public class swap_first_and_last {
    public static void main(String[] args) {
      circular a=new circular();

       a.insert(5);
       a.insert(4);
       a.insert(3);
       a.insert(2);
       a.insert(1);
       a.swapnode();

       a.print();
    }
    }

class circular{
    Node head;

    public void insert(int data){
        Node newnode=new Node(data);
        if (head==null) {
            head=newnode;
            newnode.next=head;
        }else{
            Node temp=head;

            while (temp.next != head) {
                temp=temp.next;
            }

            temp.next=newnode;
            newnode.next=head;
        }
    }

    public void print(){
        Node temp=head;

       do {
        System.out.println(temp.data);

        temp=temp.next;
       } while (temp != head);
    }

    public void swapnode(){
        Node temp=head;
        Node prev=null;

        while (temp.next != head) {
            prev=temp;
            temp=temp.next;
        }

        //50 - 20
        temp.next=head.next;
        //40 - 10
        prev.next=head;
        //10 - 50
        head.next=temp;
        //update real value
        head=temp;
    }



}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

