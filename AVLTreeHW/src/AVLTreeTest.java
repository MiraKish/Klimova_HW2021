import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AVLTreeTest extends Assertions {
    @Test
    public void minValue_findsMinOfTree_minEquals1() {
        AVLTree tree = new AVLTree();

        tree.insert( "a");
        tree.insert( "abc");
        tree.insert( "ab");
        tree.insert( "abcd");

        assertEquals("a", tree.minValue(tree.root).key());
    }

    @Test
    public void maxValue_findsMaxOfTree_maxEquals1() {
        AVLTree tree = new AVLTree();

        tree.insert( "a");
        tree.insert( "abc");
        tree.insert( "abcd");
        tree.insert( "ab");

        assertEquals("abcd", tree.maxValue(tree.root).key());
    }

    @Test
    public void successor_findsSucOf1ab_sucEquals2bc() {
        AVLTree tree = new AVLTree();

        tree.insert( "a");
        tree.insert( "ab");
        tree.insert( "abc");
        tree.insert( "abcd");


        assertEquals("abc", tree.successor(tree.root, "ab").key());
    }

    @Test
    public void predecessor_findsPreOfUght_preEqualsTrs() {
        AVLTree tree = new AVLTree();

        tree.insert( "a");
        tree.insert( "ab");
        tree.insert( "abc");
        tree.insert( "abcd");

        assertEquals("ab", tree.predecessor(tree.root, "abc").key());
    }

    @Test
    public void insert_addsNewValue_value8EqualsTrue() {
        AVLTree tree = new AVLTree();

        tree.insert( "8");

        assertEquals(true, tree.search("8"));
    }

    @Test
    public void insert_rightOrder_showsRightRoot() {
        AVLTree tree = new AVLTree();

        tree.insert("60");
        tree.insert("10");
        tree.insert("40");
        tree.insert("50");
        tree.insert("25");

        assertEquals("40", tree.preOrder(tree.root));
    }

    @Test
    public void delete_deletes8_searchFor8EqualsFalse() {
        AVLTree tree = new AVLTree();

        tree.insert( "3");
        tree.insert( "2");
        tree.insert( "1");
        tree.insert( "8");
        tree.insert( "4");
        tree.delete("8");


        assertEquals(false, tree.search("8"));
    }
}
