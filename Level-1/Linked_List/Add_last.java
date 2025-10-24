
class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

public class Add_last {

    static Node head=null;
    static Node tail=null;
    static int size=0;

    public static void main(String[] args){
            add_last(20);
            add_last(30);
            add_last(40);
            add_last(50);
            add_last(60);
            display();
    }

    public static void add_last(int value){
        
        Node nn=new Node();
        nn.data=value;

        if(size==0){
            head=tail=nn;
        }
        else{
            tail.next=nn;
            tail=nn;
        }
        size++;
    }

    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

}









