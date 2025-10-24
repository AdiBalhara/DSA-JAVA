
import java.util.LinkedList;
import java.util.Scanner;

public class K_Reverse{
    static Node head=null;
    static Node tail=null;
    static int size=0;
    public static void main(String[] args){
        Add_last add=new Add_last();
        Scanner scn=new Scanner(System.in);
        int k=scn.nextInt();
        add.add_last(10);
        add.add_last(20);
        add.add_last(30);
        add.add_last(40);
        add.add_last(50);
        add.add_last(60);
        add.add_last(70);
        add.add_last(80);
        add.display();
        k_reverse(k);
    }
    public static void k_reverse(int k){
        LinkedList ans=new LinkedList();
        LinkedList l1=new LinkedList();
        
        while(size>0){
            if(size>k){
                l1.addLast(l1.getFirst());
                l1.removeFirst();
            }
            else{
                l1.getFirst(l1.addFirst());
            }
        }
        if(ans.size()==0){
            ans=l1;
        }
        else{
            ans.tail.next=l1.head;
            ans.tail=l1.tail;
            ans.size()=ans.size()+l1.size();
        }
        l1=new LinkedList();
    }
    head=ans.head;
    tail=ans.tail;
    size=ans.size;
}