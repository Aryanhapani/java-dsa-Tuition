public class create_circular_without_tail {
    public static void main(String[] args) {
       circular a=new circular();
       a.insert(576);
       
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


            //find last element
            while (temp.next != head) {
                temp=temp.next;
            }
            //connect last to newnode

            temp.next=newnode;

            //connect newnode to head
            newnode.next=head;
        }
    }

    public void print(){
        Node temp=head;

        do{
          System.out.println(temp.data);
          temp=temp.next;
        }while(temp != head);
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}
