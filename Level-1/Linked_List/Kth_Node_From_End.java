import java.util.*;

public class Kth_Node_From_End{
    static Node head=null;
    static Node tail=null;
    static int size=0;
    public static void main(String[] args){
        Add_last add= new Add_last();
        Scanner scn=new Scanner(System.in);
        int k=scn.nextInt();
        add.add_last(20);
        add.add_last(30);
        add.add_last(40);
        add.add_last(50);
        add.add_last(60);
        add.display();
        int result=Kth_element(k);
    }
    public static int Kth_element(int k){
        Node fast=head;
        Node slow=head;

        for(int i=0; i<k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;
    }
}

