package animal_related;

import java.util.Date;
import java.util.List;

public class Adoption {
    private int ID;
    private Date date;
    private String status;
    private double fee;
    private List<String> notes;


    public Adoption(int ID, Date date, String status, double fee, List<String> notes) {
        this.ID = ID; //same as ID of animal being adopted
        this.date = date;
        this.status = status;
        this.fee = fee;
        this.notes = notes;
    }
    

    public void approveAdoption() {
        this.status = "Approved";
        System.out.println("Adoption approved.");
    }

    public void denyAdoption() {
        this.status = "Denied";
        System.out.println("Adoption denied.");
    }

    public void returnAnimal(List<Adoption> adoptions, List<Animal> animals, int adoptionID) {
        for (Adoption adoption : adoptions) {
            if (adoption.getID() == adoptionID) {
                adoption.updateStatus("Customer Blacklisted");
                System.out.println("Adoption status updated to: Customer Blacklisted");
                for (Animal animal : animals) {
                    if (animal.getID() == adoptionID) {
                        animal.editInformation(null,null,null,null,null,null,null,"At Shelter");
                        System.out.println("Animal returned to the shelter.");
                        return;
                    }
                }
            }
        }

    }

    private int getID() {
		return ID;
	}


	public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Adoption status updated to: " + newStatus);
    }

    public void addNote(String note) {
        notes.add(note);
        System.out.println("Note added: " + note);
    }
}
