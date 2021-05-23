import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ListHashTableTest extends Assertions {
    @Test
    public void insert_insertionOfElement11_equalsTrue() {
        ListHashTable table = new ListHashTable(10);

        table.insert(4);
        table.insert(11);
        table.insert(8);

        assertEquals(true, table.search(11));
    }

    @Test
    public void delete_searchFor11_equalsFalse() {
        ListHashTable table = new ListHashTable(10);

        table.insert(4);
        table.insert(11);
        table.insert(8);
        table.delete(11);

        assertEquals(false, table.search(11));
    }
}
