
import java.util.*;

class Level_Generic_Tree_Traversal{
    public static void main(String[] args){
        Construction_of_Generic_tree tree=new Construction_of_Generic_tree();
        int arr[]={25, 54, 6, 5, 2, -1, 245, -1, -1, 54, -1, -1};
        Node node=tree.Construction(arr);
        traversal(node);
    }
    public static void traversal(Node node){
        Queue<Node> que=new ArrayDeque<>();
        que.add(node);
        while(que.size()>0){
            Node nn=que.remove();
            System.out.println(nn);
            for(Node child:nn.children){
                que.add(child);
            }
        }
        System.out.println(".");
    }
}