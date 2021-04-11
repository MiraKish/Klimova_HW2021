public class BinarySearchTree {
    Node root;

    public class Node {
        int key;
        Node left;
        Node right;

        public Node(int data){
            key = data;
            left = right = null;
        }
    }

    BinarySearchTree(){
        root = null;
    }

    boolean search(int key)  {
        root = searchRec(root, key);
        if (root!= null)
            return true;
        else
            return false;
    }

    //recursive search function
    public Node searchRec(Node root, int key)  {
        if (root == null || root.key == key) {
            return root;
        }
        if (root.key > key) {
            return searchRec(root.left, key);
        }
        return searchRec(root.right, key);
    }

    public void insert(int key)  {
        root = insertRec(root, key);
    }

    //recursive insert function
    public Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        //traverse the tree
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    public int minValue(Node root)  {
        int minVal = root.key;
        while (root.left != null)  {
            minVal = root.left.key;
            root = root.left;
        }
        return minVal;
    }
}
