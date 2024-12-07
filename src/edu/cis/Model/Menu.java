package edu.cis.Model;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> eatriumItems;
    private String adminID;
    public Menu(ArrayList<MenuItem> item) {
        this.eatriumItems=item;
    }
    public ArrayList<MenuItem> getEatriumItems() {
        return eatriumItems;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setEatriumItems(ArrayList<MenuItem> eatriumItems) {
        this.eatriumItems = eatriumItems;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public void addEatriumItem(MenuItem item) {
        this.eatriumItems.add(item);
    }


    public String toString() {
        return "Menu{" +
                "eatriumItems=" + eatriumItems +
                ", adminID='" + adminID + '\'' +
                '}';
    }
}