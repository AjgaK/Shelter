package support;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import user_related.Customer;

public class BlacklistTest {

    private Blacklist blacklist;
    private Customer customer;
    private Reason reason;

    @Before
    public void setUp() {
        blacklist = new Blacklist();
        customer = new Customer("John", "Doe", "Address", "+48 123456789", "john@example.com", "john_doe", "password");
        reason = new Reason("Inappropriate behavior");
    }

    @Test
    public void testFillBlacklistFile() {
        String expected = "Blacklist:\n" + "Customer ID: 1\n" + "Reason: Inappropriate behavior\n" + "------\n";
        blacklist.fillBlacklistFile(customer, reason);
        String result = Blacklist.showBlacklist();
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveFromBlacklist() {
        blacklist.fillBlacklistFile(customer, reason);
        blacklist.removeFromBlacklist(customer);
        String result = Blacklist.showBlacklist();
        assertEquals("Blacklist is empty.", result);
    }
}