package animal_related;

public class ChecklistItem {
	private String name;
	private String description;
	private String status;
	private CareChecklist checklist;

	public ChecklistItem(String name, String description, String status) {
		this.name = name;
		this.description = description;
		this.status = status;
	}

	public void changeStatus(String newStatus) {
		this.status = newStatus;
		System.out.println("Status of checklist item '" + name + "' updated to: " + newStatus);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getStatus() {
		return status;
	}
}
