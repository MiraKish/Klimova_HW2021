public class BinarySearchTree {
    Node root;

    public  class Node {
        private int key;
        private Node left;
        private Node right;
        String name;

        public Node(int key, String name) {
            this.key = key;
            this.name = name;
        }
    }

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.left;

                    if (focusNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.right;

                     if (focusNode == null) {
                         parent.right = newNode;
                         return;
                     }
                }
            }
        }
    }
}
