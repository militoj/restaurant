package org.launchcode.java.demos.java4python.restaurant;

import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 * Created by johnmilito on 3/13/17.
 */

public class Menu {
    private LocalDateTime dateUpdated;
    private static ArrayList<MenuItem> menu = new ArrayList<>();

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated() {
        this.dateUpdated = dateUpdated.now();
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(MenuItem menu) {
        this.menu.add(menu);
        this.setDateUpdated();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "dateUpdated=" + dateUpdated +
                "menu=" + menu.toString() +
                '}';
    }

    public static void main(String[] args) {
        Menu breakfast = new Menu();

        MenuItem orangeJuice = new MenuItem();
        orangeJuice.setPrice(2.65);
        orangeJuice.setDescription("Orange Juice");
        orangeJuice.setCategory("Beverage");
        orangeJuice.setNewItem(Boolean.FALSE);

        MenuItem bacon = new MenuItem();
        bacon.setPrice(5.43);
        bacon.setDescription("Bacon");
        bacon.setCategory("Side");
        bacon.setNewItem(Boolean.TRUE);

        breakfast.setMenu(orangeJuice);
        breakfast.setMenu(bacon);

        System.out.println(breakfast.getMenu().toString());
        //System.out.println(menu.toString());

    }


    }
