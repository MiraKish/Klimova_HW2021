import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest extends Assertions {
    @Test
    public void insert_addsNewValue_value8EqualsTrue() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert( 8);

        assertEquals(true, tree.search(8));
    }

    @Test
    public void min_findsMinOfTree_minEquals1() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert( 8);
        tree.insert( 2);
        tree.insert( 1);
        tree.insert( 4);


        assertEquals(1, tree.minValue(tree.root));
    }

}
