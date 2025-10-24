class Height_of_Genric_Tree{
    public static void main(String[] args)
    {
        int arr[]={25, 54, 6, 5, 2, -1, 245, -1, -1, 54, -1, -1};

        Construction_of_Generic_tree construct= new Construction_of_Generic_tree();
        
        Node tree=construct.Construction(arr);
        //construct.display(tree);
        Size_Generic_Tree se= new Size_Generic_Tree();
        int k=se.size(tree);
        System.out.println(k);
    }
    public static int height(Node tree){
        int ht=-1;
        for(Node node:tree.children){
            ht=Math.max(ht,height(node));
        }
        return ht+1;
    }
}