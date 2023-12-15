package animal_related;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdoptionTest {

    private Adoption testAdoption;
    private Animal testAnimal;

    @Before
    public void setUp() {
        testAnimal = new Animal(1, "Rocky", getDate("2021-04-08"), 10.5, "Dog", "Pitbull", getDate("2022-01-10"), new ArrayList<>());
        testAnimal.setStatus("Available");
        testAdoption = new Adoption(1, getDate("2022-02-01"), "Pending", 50.0, new ArrayList<>());
    }

    @Test
    public void testApproveAdoption() {
        testAdoption.approveAdoption();
        assertEquals("Approved", testAdoption.getStatus());
    }

    @Test
    public void testDenyAdoption() {
        testAdoption.denyAdoption();
        assertEquals("Denied", testAdoption.getStatus());
    }

    @Test
    public void testReturnAnimal() {
        List<Adoption> adoptions = new ArrayList<>();
        adoptions.add(testAdoption);
        List<Animal> animals = new ArrayList<>();
        animals.add(testAnimal);
        testAdoption.returnAnimal(adoptions, animals, 1);
        assertEquals("At Shelter", testAnimal.getStatus());
        assertEquals("Customer Blacklisted", testAdoption.getStatus());
    }

    @Test
    public void testUpdateStatus() {
        String newStatus = "Postponed Indefinitely";
        testAdoption.updateStatus(newStatus);
        assertEquals(newStatus, testAdoption.getStatus());
    }

    @Test
    public void testAddNote() {
        String note = "Test note";
        testAdoption.addNote(note);
        assertTrue(testAdoption.getNotes().contains(note));
    }

    private Date getDate(String dateString) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}

