package animal_related;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class CareChecklistTest {

    private CareChecklist testChecklist;
    private ChecklistItem testItem1;
    private ChecklistItem testItem2;

    @Before
    public void setUp() {
        testChecklist = new CareChecklist(new ArrayList<>());
        testItem1 = new ChecklistItem("Feed Poppy", "1 can chicken", "Incomplete");
        testItem2 = new ChecklistItem("Walk Rocky", "15-30 minutes. Do not go beyond High Street", "Incomplete");
    }

    @Test
    public void testAddItem() {
        testChecklist.addItem(testItem1);
        assertEquals(1, testChecklist.getItemList().size());
        assertTrue(testChecklist.getItemList().contains(testItem1));
    }

    @Test
    public void testViewChecklist() {
        testChecklist.addItem(testItem1);
        testChecklist.addItem(testItem2);
        String actualChecklist = getOutputString(() -> testChecklist.viewChecklist());
        assertTrue(actualChecklist.contains("Name: " + testItem1.getName()));
        assertTrue(actualChecklist.contains("Description: " + testItem1.getDescription()));
        assertTrue(actualChecklist.contains("Status: " + testItem1.getStatus()));
        assertTrue(actualChecklist.contains("Name: " + testItem2.getName()));
        assertTrue(actualChecklist.contains("Description: " + testItem2.getDescription()));
        assertTrue(actualChecklist.contains("Status: " + testItem2.getStatus()));
    }

    private String getOutputString(Runnable runnable) {
        java.io.PrintStream originalOut = System.out;
        java.io.ByteArrayOutputStream testingOut = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(testingOut));
        runnable.run();
        System.setOut(originalOut);
        return testingOut.toString().trim();
    }
}

