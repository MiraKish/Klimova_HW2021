import com.sun.source.tree.BreakTree;

public class BinarySearchTree {
    Node root;

    public static class Node {
        String key;
        Node left;
        Node right;

        public Node(String data) {
            key = data;
            left = right = null;
        }

        public String key() {
            return key;
        }
    }

    BinarySearchTree() {
        root = null;
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

    public void insert(String key) {
        root = insertRec(root, key);
    }

    //recursive insert function
    public Node insertRec(Node root, String key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        //traverse the tree
        if (key.compareTo(root.key) > 0)
            root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key) < 0)
            root.right = insertRec(root.right, key);
        return root;
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

    public void delete(String key) {
        root = deleteRec(root, key);
    }

    //recursive delete function
    public Node deleteRec(Node root, String key) {
        if (root == null) {
            return root;
        }

        //traverse the tree
        if (key.compareTo(root.key) < 0) {
            root.left = deleteRec(root.left, key);
        } else if (key.compareTo(root.key) > 0) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
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
}
