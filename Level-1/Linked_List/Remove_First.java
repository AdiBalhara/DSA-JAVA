

class Node{
    Node next;
    int data;
}
public class Remove_First{
    static Node head=null;
    static Node tail=null;
    static int size=0;

    public static void main(String[] args){
        
        remove_first();
        display();
    }

    public static void remove_first(){
            if(size==0){
                System.out.println("List is empty.");
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
    public static void display(){
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                System.out.print(temp.data+ "->");
            }
            System.out.print("null");
    }

}
