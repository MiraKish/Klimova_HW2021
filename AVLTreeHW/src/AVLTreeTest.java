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
}
