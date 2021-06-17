import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OffsetHashTableTest extends Assertions {
    @Test
    public void insert_insertionKey5_getsValue7() {
        OffsetHashTable<Integer, Integer> table = new OffsetHashTable<>();

        table.insert(5, 7);

        assertEquals(7, table.get(5));
    }

    @Test
    public void delete_deleteKey5_getsNull() {
        OffsetHashTable<Integer, Integer> table = new OffsetHashTable<>();

        table.insert(5, 7);
        table.delete(5);

        assertEquals(null, table.get(5));
    }

    @Test
    public void size_inserts3Times_size3() {
        OffsetHashTable<Integer, Integer> table = new OffsetHashTable<>();

        table.insert(2, 3);
        table.insert(5, 7);
        table.insert(1, 8);

        assertEquals(3, table.size());
    }

    @Test
    public void isEmpty_noElements_equalsTrue() {
        OffsetHashTable<Integer, Integer> table = new OffsetHashTable<>();

        assertEquals(true, table.isEmpty());
    }

    @Test
    public void isEmpty_oneElement_equalsFalse() {
        OffsetHashTable<Integer, Integer> table = new OffsetHashTable<>();

        table.insert(4, 8);

        assertEquals(false, table.isEmpty());
    }
}