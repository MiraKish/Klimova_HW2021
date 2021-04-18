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

    int height(Node node) {
        if (node == null)
            return 0;

        return node.height;
    }

    boolean search(String key) {
        root = searchRec(root, key);
        return root != null;
    }

    //recursive search function
    public Node searchRec(Node root, String key) {
        if (root == null || root.key == key) {
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

    public Node insert()

}
