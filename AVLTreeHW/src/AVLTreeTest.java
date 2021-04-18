import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AVLTreeTest extends Assertions {
    @Test
    public void minValue_findsMinOfTree_minEquals1() {
        AVLTree tree = new AVLTree();

        tree.insert( "asd");
        tree.insert( "asdfhg");
        tree.insert( "r");
        tree.insert( "dfdg");


        assertEquals("r", tree.minValue(tree.root).key());
    }

    @Test
    public void maxValue_findsMaxOfTree_maxEquals1() {
        AVLTree tree = new AVLTree();

        tree.insert( "t");
        tree.insert( "uy");
        tree.insert( "fes");
        tree.insert( "ega");
        tree.insert( "eakdfndk");


        assertEquals("eakdfndk", tree.maxValue(tree.root).key());
    }

    @Test
    public void successor_findsSucOf1ab_sucEquals2bc() {
        AVLTree tree = new AVLTree();

        tree.insert( "1ab");
        tree.insert( "2bc");
        tree.insert( "ertgf");
        tree.insert( "4gess");


        assertEquals("2bc", tree.successor(tree.root, "1ab").key());
    }

    @Test
    public void predecessor_findsPreOfUght_preEqualsTrs() {
        AVLTree tree = new AVLTree();

        tree.insert( "ibh");
        tree.insert( "Trs");
        tree.insert( "ught!");
        tree.insert( "fvvee");

        assertEquals("Trs", tree.predecessor(tree.root, "ught!").key());
    }
}
