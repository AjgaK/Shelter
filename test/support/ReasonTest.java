package support;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReasonTest {

    @Test
    public void testReasonDescription() {
        String description = "Inappropriate behavior";
        Reason reason = new Reason(description);
        String actualDescription = reason.getDescription();
        assertEquals(description, actualDescription);
    }

    @Test
    public void testAnotherReasonDescription() {
        String description = "Another reason";
        Reason reason = new Reason(description);
        String actualDescription = reason.getDescription();
        assertEquals(description, actualDescription);
    }

}