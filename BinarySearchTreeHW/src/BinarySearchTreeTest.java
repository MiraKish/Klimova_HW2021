import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest extends Assertions {
    @Test
    public void insert_addsNewValue_value8EqualsTrue() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert( 8);

        assertEquals(true, tree.search(8));
    }


}
