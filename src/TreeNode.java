/*
Denise Chen
IS247-01
5/13/2022
Binary Trees
demonstrate all 3 types of traversal using Integer objects and add to the binary tree
 */

//class TreeNode definition
public class TreeNode<T extends Comparable<T> > {
    // package access members
    TreeNode<T> leftNode; // left node
    T data; // node value
    TreeNode<T> rightNode; // right node

    // constructor initializes data and makes this a leaf node
    public TreeNode(T nodeData) {
        data = nodeData;
        leftNode = rightNode = null; // node has no children
    }

    // locate insertion point and insert new node; ignore duplicate values
    public void insert(T insertValue) {     //Tree<T> root,
        // insert in left subtree
        if (insertValue.compareTo(data) > 0) {
            // adds node into subtree on the right side
            if (rightNode == null) {
                rightNode = new TreeNode<T>(insertValue);
            } else {
                rightNode.insert(insertValue);
            }
            // insert in right subtree
        } else if (insertValue.compareTo(data) < 0) {
            // adds node into subtree on the left side
            if (leftNode == null) {
                leftNode = new TreeNode<T>(insertValue);
            } else {
                leftNode.insert(insertValue);
            }
        }
    }
} // class TreeNode <T extends Comparable<T>> END

//class Tree definition
class Tree<T extends Comparable<T>> {
    private TreeNode<T> root;

    // constructor initializes an empty Tree of integers
    public Tree() {
        root = null;
    }

    // insert a new node in the binary search tree
    public void insertNode(T insertValue) {     //creating the tree
        if (root == null) {
            root = new TreeNode<>(insertValue); // create root node
        } else {
            root.insert(insertValue); // call the insert method
        }
    }

    // begin preorder traversal
    public void preorderTraversal() {
        preorderHelper(root);
    }

    // recursive method to perform preorder traversal
    private void preorderHelper(TreeNode<T> node) {
        if (node == null)
            return;

        System.out.printf("%s ", node.data);      // show current node
        preorderHelper(node.leftNode);      // goes to left subtree
        preorderHelper(node.rightNode);     // goes to right subtree
    }

    // begin inorder traversal
    public void inorderTraversal() {
        inorderHelper(root);
    }

    // recursive method to perform inorder traversal
    private void inorderHelper(TreeNode<T> node) {
        if (node == null)
            return;

        inorderHelper(node.leftNode); // traverse left subtree
        System.out.printf("%s ", node.data); // output node data
        inorderHelper(node.rightNode); // traverse right subtree
    }

    // begin postorder traversal
    public void postorderTraversal() {
        postorderHelper(root);
    }

    // recursive method to perform postorder traversal
    private void postorderHelper(TreeNode<T> node) {
        if (node == null)
            return;

        postorderHelper(node.leftNode);     // goes to left subtree
        postorderHelper(node.rightNode);    // goes to right subtree
        System.out.printf("%s ", node.data);    // show current node
    }
}// public class Tree<T extends Comparable<T>> END