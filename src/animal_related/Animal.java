package animal_related;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Animal {
	private int ID;
    private String name;
    private Date dateOfBirth;
    private double weight;
    private String species;
    private String breed;
    private Date foundDate;
    private List<String> specialNeedsList;
    private String status;


    public Animal(int ID, String name, Date dateOfBirth, double weight, String species, String breed, Date foundDate, ArrayList<String> specialNeedsList) {
        this.ID = ID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.species = species;
        this.breed = breed;
        this.foundDate = foundDate;
        this.specialNeedsList = new ArrayList<>();
        this.status = "At Shelter";
    }
    
    public void viewAnimalDetails() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        StringBuilder details = new StringBuilder();
        details.append("Animal ID: ").append(ID).append("\n");
        details.append("Name: ").append(name).append("\n");
        details.append("Date of Birth: ").append(dateFormat.format(dateOfBirth)).append("\n");
        details.append("Weight: ").append(weight).append("\n");
        details.append("Species: ").append(species).append("\n");
        details.append("Breed: ").append(breed).append("\n");
        details.append("Found Date: ").append(dateFormat.format(foundDate)).append("\n");
        details.append("Special Needs: ").append(specialNeedsList).append("\n");
        details.append("Status: ").append(status).append("\n");
        details.append("------------------------").append("\n");

        System.out.println(details.toString());
    }

    public static Animal addNewAnimal(int ID, String name, Date dateOfBirth, double weight, String species, String breed, Date foundDate, ArrayList<String> specialNeedsList) {
        return new Animal(ID, name, dateOfBirth, weight, species, breed, foundDate, specialNeedsList);
    }

    public void editInformation(String name, Date dateOfBirth, Double weight, String species, String breed, Date foundDate, List<String> specialNeedsList, String status) {
        if (name != null) {
            this.name = name;
        }
        if (dateOfBirth != null) {
            this.dateOfBirth = dateOfBirth;
        }
        if (weight != null) {
            this.weight = weight;
        }
        if (species != null) {
            this.species = species;
        }
        if (breed != null) {
            this.breed = breed;
        }
        if (foundDate != null) {
            this.foundDate = foundDate;
        }
        if (specialNeedsList != null) {
            this.specialNeedsList = specialNeedsList;
        }
        if (status != null) {
            this.status = status;
        }
    }

    public int getID() {
        return ID;
    }

	public void setStatus(String status) {
		this.status = status;
		
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Date getFoundDate() {
		return foundDate;
	}

	public void setFoundDate(Date foundDate) {
		this.foundDate = foundDate;
	}

	public List<String> getSpecialNeedsList() {
		return specialNeedsList;
	}

	public void setSpecialNeedsList(List<String> specialNeedsList) {
		this.specialNeedsList = specialNeedsList;
	}

	public String getStatus() {
		return status;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getName() {
		return name;
	}
}
