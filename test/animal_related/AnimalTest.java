package animal_related;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AnimalTest {

    private Animal testAnimal;

    @Before
    public void setUp() {
        testAnimal = new Animal(1, "Rocky", getDate("2021-04-08"), 10.5, "Dog", "Pitbull", getDate("2022-01-10"), new ArrayList<>());
    }

    @Test
    public void testViewAnimalDetails() {
        String expectedDetails = "Animal ID: 1\n" +
                                 "Name: Rocky\n" +
                                 "Date of Birth: 2021-04-08\n" +
                                 "Weight: 10.5\n" +
                                 "Species: Dog\n" +
                                 "Breed: Pitbull\n" +
                                 "Found Date: 2022-01-10\n" +
                                 "Special Needs: []\n" +
                                 "Status: At Shelter\n" +
                                 "------------------------";

        String actualDetails = getOutputString(() -> testAnimal.viewAnimalDetails());

        assertEquals(expectedDetails, actualDetails);
    }

    @Test
    public void testAddNewAnimal() {
        int newAnimalID = 2;
        String newAnimalName = "Poppy";
        Date newAnimalDateOfBirth = getDate("2021-12-25");
        double newAnimalWeight = 15.3;
        String newAnimalSpecies = "Cat";
        String newAnimalBreed = "Ragdoll";
        Date newAnimalFoundDate = getDate("2023-05-17");
        ArrayList<String> newAnimalSpecialNeeds = new ArrayList<>();

        Animal newAnimal = Animal.addNewAnimal(newAnimalID, newAnimalName, newAnimalDateOfBirth, newAnimalWeight, newAnimalSpecies, newAnimalBreed, newAnimalFoundDate, newAnimalSpecialNeeds);

        assertEquals(newAnimalID, newAnimal.getID());
        assertEquals(newAnimalName, newAnimal.getName());
        assertEquals(newAnimalDateOfBirth, newAnimal.getDateOfBirth());
        assertEquals(newAnimalWeight, newAnimal.getWeight(), 0.001);
        assertEquals(newAnimalSpecies, newAnimal.getSpecies());
        assertEquals(newAnimalBreed, newAnimal.getBreed());
        assertEquals(newAnimalFoundDate, newAnimal.getFoundDate());
        assertEquals(newAnimalSpecialNeeds, newAnimal.getSpecialNeedsList());
    }

    @Test
    public void testEditInformation() {
        String newName = "Jiji";
        Date newDateOfBirth = getDate("2020-02-20");
        Double newWeight = 12.8;
        String newSpecies = "Parrot";
        String newBreed = "Cockatiel";
        Date newFoundDate = getDate("2021-02-10");
        ArrayList<String> newSpecialNeeds = new ArrayList<>();
        newSpecialNeeds.add("Needs a companion");
        String newStatus = "Considered for Adoption";

        testAnimal.editInformation(newName, newDateOfBirth, newWeight, newSpecies, newBreed, newFoundDate, newSpecialNeeds, newStatus);

        assertEquals(newName, testAnimal.getName());
        assertEquals(newDateOfBirth, testAnimal.getDateOfBirth());
        assertEquals(newWeight, testAnimal.getWeight(), 0.001);
        assertEquals(newSpecies, testAnimal.getSpecies());
        assertEquals(newBreed, testAnimal.getBreed());
        assertEquals(newFoundDate, testAnimal.getFoundDate());
        assertEquals(newSpecialNeeds, testAnimal.getSpecialNeedsList());
    }


    private Date getDate(String dateString) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
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
