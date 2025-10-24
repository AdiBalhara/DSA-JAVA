
import java.util.*;

public class Get_First_Get_Last_Get_At{
    static Node head=null;
    static Node tail=null;
    static int size=0;

    public static void main(String[] args){
        Add_last add=new Add_last();
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the index value:");
        int idx=scn.nextInt();
        add.add_last(20);
        add.add_last(30);
        add.add_last(40);
        add.add_last(50);
        add.add_last(60);
        add.display();
        int First=Get_First();
        int Last=Get_Last();
        int At=Get_At(idx);
    }
    public static int Get_First(){
        if(size==0){
            System.out.println("List is empty");
            return -1;
        }
        else {
            return head.data;
        }
    }
    public static int Get_Last(){
        if(size==0){
            System.out.println("List is empty");
            return -1;
        }
        else{
            return tail.data;
        }
    }
    public static int Get_At(int idx){
        
        if(idx==0){
            return Get_First();
        }
        else if (idx==size-1) {
            return Get_Last();
        }
        else{
            int i=0;
            Node temp=head;
            while(i!=idx-1){
                temp=temp.next;
                i++;
            }
            return temp.data;
        }
    }
}