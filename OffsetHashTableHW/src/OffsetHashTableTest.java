import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OffsetHashTableTest extends Assertions {
    @Test
    public void insert_insertionKey5_getsValue7() {
        OffsetHashTable<Integer, Integer> table = new OffsetHashTable<>();

        table.insert(5, 7);

        assertEquals(7, table.get(5));
    }
}