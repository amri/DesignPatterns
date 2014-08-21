package Chapter9Composite.Client;

import Chapter9Composite.Aggregate.*;
import Chapter9Composite.Component.MenuComponent;

/**
 * Created by amri on 16/8/14.
 */
public class WaitressTest {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");

        MenuComponent allMenus = new Menu("ALL MENUS", "All Menus Combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);


        dinerMenu.add(new MenuItem("Pasta", "Spagethi", true, 3.89));
        pancakeHouseMenu.add(new MenuItem("Pancake", "Nice pancake", true, 2.33));
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert");

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Ice Cream", "Cold ice cream", false, 1.01));


        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
