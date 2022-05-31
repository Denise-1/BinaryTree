public class MakeTree {
    public static void main(String[] args) {

        int tree [] = {35, 62, 17, 38, 7, 89, 14, 26, 3};

        Tree binaryT = new Tree<Integer>();
    // add to tree
        binaryT.insertNode(35);
        binaryT.insertNode(62);
        binaryT.insertNode(17);
        binaryT.insertNode(38);
        binaryT.insertNode(7);
        binaryT.insertNode(39);
        binaryT.insertNode(14);
        binaryT.insertNode(26);
        binaryT.insertNode(3);
    // numbers added to binary tree
        System.out.print("Numbers added to tree: ");
        for (int num : tree){
            System.out.print(" " + num);
        }
    // inorder
        System.out.print("\nInorder: ");
        binaryT.inorderTraversal();
    //preorder
        System.out.print("\nPreOrder: ");
        binaryT.preorderTraversal();
    //postorder
        System.out.print("\nPostOrder: ");
        binaryT.postorderTraversal();
    // insert()
        System.out.println("\nAdded 20");
        binaryT.insertNode(20);
        System.out.print("20 within inorder tree: ");
        binaryT.inorderTraversal();
    }
}