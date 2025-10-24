import java.util.*;

class Node{
        int data;
        ArrayList<Node> children;
        Node(int data){
            this.data=data;
            children=new ArrayList<>();
        }
         public String toString() {
        return String.valueOf(this.data);
    }
}

public class Construction_of_Generic_tree{
    public static void main(String[] args){
        int arr[]={25, 54, 6, 5, 2, -1, 245, -1, -1, 54, -1, -1};
        Node root=Construction(arr);
        display(root);
    }

    public static Node Construction(int arr[]){
            Stack<Node>st=new Stack<>(); 
            Node root=new Node(arr[0]);
            st.push(root);

            for(int i=1; i<arr.length;i++){
                if(arr[i]==-1){
                    st.pop();
                }
                else{
                    Node nn=new Node(arr[i]);
                    st.peek().children.add(nn);
                    st.push(nn);
                }
            }
        return root;
    }

    public static void display(Node node){
        String str;
        str=node.data+"->";

        for(Node child:node.children){
            str=child.data+",";
        }

        str=str+".";
        System.out.print(str);
        for(Node child:node.children){
            display(child);
        }
        
    }
}