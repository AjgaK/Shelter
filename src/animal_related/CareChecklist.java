package animal_related;

import java.util.List;

import user_related.Manager;

public class CareChecklist {
	private List<ChecklistItem> itemList;
	private Animal animal;
	private Manager createdBy;

	public CareChecklist(List<ChecklistItem> itemList) {
		this.itemList = itemList;
	}

	public void addItem(ChecklistItem item) {
		itemList.add(item);
		System.out.println("Item added to the checklist: " + item.getName());
	}

	public void viewChecklist() {
		System.out.println("Care Checklist:");

		StringBuilder checklistDetails = new StringBuilder();

		for (ChecklistItem item : itemList) {
			checklistDetails.append("Name: ").append(item.getName()).append("\n");
			checklistDetails.append("Description: ").append(item.getDescription()).append("\n");
			checklistDetails.append("Status: ").append(item.getStatus()).append("\n");
			checklistDetails.append("------------------------").append("\n");
		}

		System.out.println(checklistDetails.toString());

	}

	public List<ChecklistItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<ChecklistItem> itemList) {
		this.itemList = itemList;
	}

	public Manager getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Manager createdBy) {
		this.createdBy = createdBy;
		createdBy.addCreatedChecklists(this);
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
		animal.setChecklist(this);
	}

}
