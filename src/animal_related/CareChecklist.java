package animal_related;

import java.util.List;

public class CareChecklist {
    private List<ChecklistItem> itemList;


    public CareChecklist(List<ChecklistItem> itemList) {
        this.itemList = itemList;
    }
    
    public void addItem(ChecklistItem item) {
        itemList.add(item);
        System.out.println("Item added to the checklist: " + item.getName());
    }

    public void viewChecklist() {
        System.out.println("Care Checklist:");
        for (ChecklistItem item : itemList) {
            System.out.println("Name: " + item.getName());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Status: " + item.getStatus());
            System.out.println("------------------------");
        }
    }
}
