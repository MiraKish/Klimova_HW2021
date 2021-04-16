import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest extends Assertions {
    @Test
    public void insert_addsNewValue_value8EqualsTrue() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert( "8");

        assertEquals(true, tree.search("8"));
    }

    @Test
    public void minValue_findsMinOfTree_minEquals1() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert( "8");
        tree.insert( "2");
        tree.insert( "1");
        tree.insert( "4");


        assertEquals("1", tree.minValue(tree.root));
    }

    @Test
    public void maxValue_findsMaxOfTree_minEquals1() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert( "3");
        tree.insert( "2");
        tree.insert( "1");
        tree.insert( "8");
        tree.insert( "4");


        assertEquals("8", tree.maxValue(tree.root));
    }

    @Test
    public void delete_deletes8_searchFor8EqualsFalse() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert( "3");
        tree.insert( "2");
        tree.insert( "1");
        tree.insert( "8");
        tree.insert( "4");
        tree.delete("8");


        assertEquals(false, tree.search("8"));
    }

//    @Test
//    public void deletety_deletes8_searchFor8EqualsFalse() {
//        BinarySearchTree tree = new BinarySearchTree();
//
//        tree.insert( 3);
//        tree.insert( 2);
//        tree.insert( 1);
//        tree.insert( 8);
//        tree.insert( 4);
//        tree.insert( 9);
//        tree.delete(4);
//
//
//        assertEquals(3, tree.successor(tree.root, 2));
//    }
}
