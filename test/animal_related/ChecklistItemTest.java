package animal_related;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ChecklistItemTest {

    private ChecklistItem testItem;

    @Before
    public void setUp() {
        testItem = new ChecklistItem("Feed", "Feed the animal", "Incomplete");
    }

    @Test
    public void testChangeStatus() {
        String newStatus = "Complete";
        testItem.changeStatus(newStatus);
        assertEquals(newStatus, testItem.getStatus());
    }
}
