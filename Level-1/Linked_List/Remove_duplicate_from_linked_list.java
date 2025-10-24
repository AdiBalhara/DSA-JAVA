
import java.util.LinkedList;


class Node{
    
    int data;
    Node next;

}
public class Remove_duplicate_from_linked_list{
    static Node head=null;
    static Node tail=null;
    static int size=0;


    public static int get_last(){
        if(size==0){
            return -1;
        }
        else {
            return tail.data;
        }
    }

    public static int add_last(int data)
    {
        Node nn=new Node();
        nn.data=data;

        if(size==0){
            head=tail=nn;
        }
        else{
            tail.next=nn;
        }
        return tail.data;
    }

    public static int get_first(){

        if (size==0) {
            return -1;
        }
        else {
            return head.data;
        }
    }

    public static int remove_first(){
        if (size==0) {
            return -1;
        }
        else if(size==1) {
            head=tail=null;
            size--;
        }
        else{
            head=head.next;
            size--;
        }
        return 0;
    }
    public static void main(String[] args){
        add_last(10);
        add_last(10);
        add_last(20);
        add_last(20);
        add_last(30);
        add_last(30);
        add_last(40);
        add_last(40);
        display();
        Remove_duplicate();
        
    }

    public static void Remove_duplicate(){
        LinkedList ans=new LinkedList();
        ans.addLast(get_first());
        remove_first();
        while(size>0){
            int value=get_first();
            remove_first();
            if(!ans.getLast().equals(value)){
                ans.addLast(value);
            }
        }
        head=null;
        tail=null;
        size=0;

        for(){
            ans.;
        }
    }

    public static void display(){
        if(size==0){
            System.out.println("List is empty.");
        }
        else{
            Node temp=head;
            for(int i=0; i<size; i++){
                temp=temp.next;
                System.out.println(temp.data);
            }
        }
    }
}