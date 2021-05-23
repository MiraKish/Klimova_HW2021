import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ListHashTableTest extends Assertions {
    @Test
    public void insert_element8_equalsTrue() {
        ListHashTable table = new ListHashTable(10);

        table.insert(4);
        table.insert(11);
        table.insert(8);

        assertEquals(true, table.search(11));
    }


}
