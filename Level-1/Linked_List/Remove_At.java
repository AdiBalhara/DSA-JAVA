import java.util.Scanner;
public class Remove_At{
    static Node head=null;
    static Node tail=null;
    static int size=0;

    public class Node{
        int data;
        Node next;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int idx=scn.nextInt();
        remove_at(idx);
    }

    public static void remove_at(int idx){
        
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index");
        }
        else if(idx==1){
            removefirst();
        }
        else if(idx==size-1){
            removeLast();
        }
        else{
            Node temp=head;
            for(int i=0; i<idx-1; i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }

}