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

    public String preOrder(Node root) {
        String a;
        if (root != null) {
            a = root.key;
            preOrder(root.left);
            preOrder(root.right);
            return a;
        }
        return null;
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

    public void delete(String key) {
        root = deleteRec(root, key);
    }

    //recursive delete function
    public Node deleteRec(Node root, String key) {
        if (root == null) {
            return root;
        }

        if (key.compareTo(root.key) < 0) {
            root.left = deleteRec(root.left, key);
        } else if (key.compareTo(root.key) > 0) {
            root.right = deleteRec(root.right, key);
        } else {
            // node with only one child or no child
            if ((root.left == null) || (root.right == null)) {
                Node temp = null;
                if (temp == root.left) {
                    temp = root.right;
                } else {
                    temp = root.left;
                }

                // No child case
                if (temp == null) {
                    temp = root;
                    root = null;
                } else {// One child case
                    root = temp;
                }
            } else {
                Node temp = minValue(root.right);

                root.key = temp.key;

                root.right = deleteRec(root.right, temp.key);
            }
        }
        if (root == null) {
            return null;
        }
        root.height = max(height(root.left), height(root.right)) + 1;

        int balance = getBalance(root);

        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0) {
            return rightRotate(root);
        }

        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0) {
            return leftRotate(root);
        }

        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
}

