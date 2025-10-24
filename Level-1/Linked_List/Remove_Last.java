public class Remove_Last{
    
    static Node head=null;
    static Node tail=null;
    static int size=0;
    
    public class Node{
        int data;
        Node next;
    }
    public static void main(String[] args){
        remove_last();
    }

    public static void remove_last(){
        if(size==0){
            System.out.println("");
        }
        else if(size==1){
            head=tail=null;
            size--;
        }
        else{
            Node temp=head;
            for(int i=0; i<size-1; i++){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
        }
    }

}