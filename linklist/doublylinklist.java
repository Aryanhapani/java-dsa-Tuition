public class doublylinklist {
    public static void main(String[] args) {
         Linklist a=new Linklist();
      a.insert(55);
      a.insert(879);
      a.insert(234);

      a.reverse();
      a.print();
    }
}

class Linklist{
    Node head;
    Node tail;

    public void insert(int data){
        Node nn=new Node(data);
        if (head==null){
            head=tail=nn;
            head.prev=null;
        }else{
            tail.next=nn;
            nn.prev=tail; // old tail
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


    public void printrev(){
        Node temp=tail;
        while (temp != null){
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }

    public void delete(int k){


        if (head==null){
            System.out.println("list is empty");
            return;
        }

         if (head==tail && head.data==k){
               head=tail=null;
         } else if (head.data==k) {
             Node temp=head;
             head=head.next;

             //when list became empty
             if (head!=null){
                 head.prev=null;
             }else {
                 tail=null;
             }
             temp.next=null;
             delete(k);
         }else{
             Node prevvalue=head;

             while (prevvalue.next!=null && prevvalue.next.data!=k){
                 prevvalue=prevvalue.next;
             }

             if (prevvalue.next==null){
                 System.out.println("value not found");
                 return;
             }

             if (prevvalue.next == tail){
                 prevvalue.next=null;
                 tail=prevvalue;
                 delete(k);
             }else{
                 Node temp=prevvalue.next;
                 prevvalue.next=temp.next;
                 temp.next.prev=prevvalue;
                 temp.next=null;
                 temp.prev=null;
                 delete(k);
             }
         }

         


    }

    public void reverse(){
     Node previous=null;
     Node curr=head;
     while (curr!=null){

         previous=curr.next;
        curr.next=curr.prev;
        curr.prev=previous;

        curr=curr.prev;

     }

//     head=previous.prev;
    }


    public void removeduplicate() {
        Node curr=head;
        Node previous=null;

        while (curr!=null){
            boolean falg=false;

            Node temp=head;
            while (temp != curr){
                if (temp.data == curr.data) {
                    falg=true;
                    break;
                }

                temp=temp.next;
            }
            if (falg){

                  if (curr.next!=null){
                      previous.next=curr.next;
                      curr.next.prev=previous;
                  }else{
                      previous.next=null;
                      tail=previous;
                  }



            }else{
                previous=curr;
            }


            curr=curr.next;
        }
    }
}

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
    }
}
