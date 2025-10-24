

/*class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}*/
public class Reverse_list{
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
        reverse();
        add.display();
    }
    public static Node get_node(int idx){
        Node temp=head;
        for(int i=0; i<idx; i++){
            temp= temp.next;
        }
        return temp;
    }
    public static void reverse(){
        int leftIndex=0;
        int rightIndex=size-1;
        while(leftIndex<rightIndex){
            Node leftnode=get_node(leftIndex);
            Node rightnode=get_node(rightIndex);
            int temp=leftnode.data;
            leftnode.data=rightnode.data;
            rightnode.data=temp;
            leftIndex++;
            rightIndex--;
        }
    }
}