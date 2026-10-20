public class insert_value_in_sorted_array {
    public static void main(String[] args) {
          doublylinklist a=new doublylinklist();
        a.insert(3);
        a.insert(5);
        a.insert(8);
        a.insert(10);
        a.insert(12);
        a.insertvalue(9);
        a.print();
    }
}

class doublylinklist{
    Node head;
    Node tail;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head=tail=newNode;
            head.prev=null;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    public void insertvalue(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head=newNode;
            return;
        }
        Node temp=head;
        Node previous=null;

        while (temp != null && temp.data < data) {
            previous=temp;
            temp=temp.next;
        }

        if (previous == null) {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }else{
            previous.next=newNode;
            newNode.prev=previous;
            newNode.next=temp;


            if (temp!= null){
                temp.prev=newNode;
            }
        }



        System.out.println(previous.data);
        System.out.println(temp.data);

    }

    public void print() {
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
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