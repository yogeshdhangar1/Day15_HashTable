public class HashTableBst {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    int idx = -1;
    public  Node createTree(int nodes[]) {
        idx++;
        if(nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = createTree(nodes);
        newNode.right = createTree(nodes);
        return newNode;
    }
    public void inOrder(Node root) {
        if(root == null) {
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        inOrder(root.left);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int nodes[] ={56, 30,22,11,3,-1,-1,16,-1,-1,-1,40,-1,
                -1,70,60,-1,65,62,-1,-1,67,-1,-1,95,-1,-1};
        HashTableBst tree = new HashTableBst();
        Node root = tree.createTree(nodes);
        tree.inOrder(root);
        System.out.println(" ");
        System.out.println("The Value Of :"+-1+" ---------->value will be Indicates Null");
    }
}