public class AVLTree {
    Node root;

    public static class Node {
        String key;
        int height;
        Node left;
        Node right;

        public Node(String data) {
            key = data;
            left = right = null;
            height = 1;
        }

        public String key() {
            return key;
        }
    }

    AVLTree() {
        root = null;
    }

    public int height(Node node) {
        if (node == null)
            return 0;

        return node.height;
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    //rooted with y
    public Node rightRotate(Node y) {
        Node x = y.left;
        Node t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    //rooted with x
    public Node leftRotate(Node x) {
        Node y = x.right;
        Node t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    //balance factor of node
    public int getBalance(Node node) {
        if (node == null)
            return 0;

        return height(node.left) - height(node.right);
    }


    boolean search(String key) {
        root = searchRec(root, key);
        return root != null;
    }

    //recursive search function
    public Node searchRec(Node root, String key) {
        if (root == null || root.key.equals(key)) {
            return root;
        }
        if (key.compareTo(root.key) < 0) {
            return searchRec(root.left, key);
        }
        return searchRec(root.right, key);
    }

    public Node minValue(Node root) {
        Node minVal = root;
        while (root.left != null) {
            minVal = root.left;
            root = root.left;
        }
        return minVal;
    }

    public Node maxValue(Node root) {
        Node maxVal = root;
        while (root.right != null) {
            maxVal = root.right;
            root = root.right;
        }
        return maxVal;
    }

    public Node successor(Node root, String value) {
        return successorRec(root, value);
    }

    public Node successorRec(Node root, String value) {
        Node current = searchRec(root, value);
        if (current == null) {
            return current;
        }

        if (current.right != null) {
            return minValue(current.right);
        } else {
            Node tmp = root.left;
            while (tmp.right != null)
                tmp = tmp.right;
            current = tmp;
        }
        return current;
    }

    public Node predecessor(Node root, String value) {
        return predecessorRec(root, value);
    }

    public Node predecessorRec(Node root, String value) {
        Node pre = null;
        while (root != null) {
            if (root.key.equals(value)) {
                if (root.left != null) {
                    pre = root.left;
                    while (pre.right != null)
                        pre = pre.right;
                }
                return pre;
            } else if (value.compareTo(root.key) > 0) {
                pre = root;
                root = root.right;
            }
        }
        return pre;
    }

    public void insert(String key) {
        root = insertRec(root, key);
    }

    public Node insertRec(Node root, String key) {
        // 1. normal BST insertion
        if (root == null) {
            return (new Node(key));
        }
        if (key.compareTo(root.key) < 0) {
            root.left = insertRec(root.left, key);
        } else if (key.compareTo(root.key) > 0) {
            root.right = insertRec(root.right, key);
        } else {
            return root;
        }

        root.height = 1 + max(height(root.left),
                height(root.right));

        int balance = getBalance(root);

        // Left Left Case
        if (balance > 1 && key.compareTo(root.key) < 0) {
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && key.compareTo(root.key) > 0) {
            return leftRotate(root);
        }

        // Left Right Case
        if (balance > 1 && key.compareTo(root.key) > 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (balance < -1 && key.compareTo(root.key) < 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }

}
