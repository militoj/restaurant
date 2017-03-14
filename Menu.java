package org.launchcode.java.demos.java4python.restaurant;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by johnmilito on 3/13/17.
 */

public class Menu {
    private Date dateUpdated;
    private ArrayList<MenuItem> menu;

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated() {
        this.dateUpdated = new Date();
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
        setDateUpdated();
    }

    public static void main(String[] args) {
        Menu breakfast = new Menu();

        breakfast.setMenu();
    }


    }
