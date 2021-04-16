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

        tree.insert( "asd");
        tree.insert( "asdfhg");
        tree.insert( "r");
        tree.insert( "dfdg");


        assertEquals("r", tree.minValue(tree.root).key());
    }

    @Test
    public void maxValue_findsMaxOfTree_maxEquals1() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert( "t");
        tree.insert( "uy");
        tree.insert( "fes");
        tree.insert( "ega");
        tree.insert( "eakdfndk");


        assertEquals("eakdfndk", tree.maxValue(tree.root).key());
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

    @Test
    public void successor_findsSucOf1ab_sucEquals2bc() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert( "1ab");
        tree.insert( "2bc");
        tree.insert( "ertgf");
        tree.insert( "4gess");


        assertEquals("2bc", tree.successor(tree.root, "1ab").key());
    }

    //пыстояно возвращается NullPointerException
    @Test
    public void predecessor_findsPreOfUght_preEqualsTrs() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert( "ibh");
        tree.insert( "Trs");
        tree.insert( "ught!");
        tree.insert( "fvvee");
        tree.insert( "uge");
        tree.insert( "f");

        assertEquals("Trs", tree.predecessor(tree.root, "ught!").key());
    }
}
