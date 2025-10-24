import java.util.*;

public class Size_Generic_Tree{

        public static void main(String[] args){
            int arr[]={10,25,21,54,65,36,98,11,22,55,-1,-1};
            Node node=construct(arr);
            int sz=size(node);
            System.out.println(sz);
        }
        public static Node construct(int arr[]){
            Stack<Node>st=new Stack<>();
            Node root=new Node(arr[0]);
            st.push(root);

            for(int i=1; i<arr.length; i++){
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
        public static int size(Node node){
            int s=0;
            for(Node child:node.children){
                s=s+size(child);
            }
            return s+1;
        }
}