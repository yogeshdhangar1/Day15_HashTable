public class HashTableBst {
    class Node{
      int key ;
      Node left,right;

        public Node(int item) {
            key = item;
            left=right = null;
        }
    }
    Node root;
    // Default Constructor For Bst
    public HashTableBst() {
        root = null;
    }
    void insert(int key){
        root = insertRec(root,key);
    }
    Node  insertRec(Node root, int key) {
        // if tree Is Empty , return a new Node
        if (root == null) {
            root = new Node(key);
            return root;
        }
        // Otherwise tree is Down Tree By Recursion method
        if (key < root.key)
            root.left = insertRec(root.left, key);
        if (key > root.key) ;
        root.right = insertRec(root.right, key);
        return root;


    }
    void inOrder(){
        inOrderRec(root);
    }
     void inOrderRec(Node root) {
        if(root==null){
            return;
        }
        inOrderRec(root.left);
         System.out.println(root.key);
         inOrderRec(root.right);
    }
    static boolean ifNodeExits(Node root,int input){
        if(root==null) {
            return false;
        }
        if(root.key == input) {
            return true;
        }
        // if check Left Subtree
        boolean res1 = ifNodeExits(root.left,input);
        if(res1==true){
            return true;
        }
        boolean res2 = ifNodeExits(root.right,input);
        return res2;
    }

    public static void main(String[] args) {
        HashTableBst tree = new HashTableBst();
        tree.insert(56);
        tree.insert(30);
        tree.insert(70);
        tree.inOrder();
    }
}
