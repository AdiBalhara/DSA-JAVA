class Node 
{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

public class LinkedList
{
    static Node head=null;
    static Node tail=null;
    static int size=0;


    public static void addFirst(int data){
        
        Node nn=new Node(data);
        if(size==0){
            
        }
    }
    public static int get_First(){
        if(size==0){
            return -1;
        }
        else{
            return head.data;
        }
    }
    public static void addLast(int value){
        Node nn=new Node(value);
        if(size==0){
            System.out.println("List is empty.");
        }
        else{
            tail.next=nn;
            size++;
        }
    }
    public static void removeFirst(){
        if(size==0){
            System.out.println("List is empty");
        }
        else if(size==1){
            head=tail=null;
            size--;
        }
        else{
            head=head.next;
            size--;
        }
    }
}