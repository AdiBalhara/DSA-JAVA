public class Reverse_List_PI{
    static Node head=null;
    static Node tail=null;
    static int size=0;
    public static void main(String[] args){
        Add_last add=new Add_last();
        add.add_last(30);
        add.add_last(40);
        add.add_last(50);
        add.add_last(60);
        add.add_last(70);
        add.display();
        
    }
    public static void Reverse(){
        if(size<=1){
            return;
        }
        Node prev=null;
        Node current=head;

        while (current!=null) { 
            Node fowd=current.next;
            current.next=prev;

            prev=current;
            current=fowd;
        }    
        head=tail;
        tail=prev
    }
}