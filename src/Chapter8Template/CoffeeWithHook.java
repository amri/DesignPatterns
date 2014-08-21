package Chapter8Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by amri on 15/8/14.
 */
public class CoffeeWithHook extends BeverageTemplate {
    @Override
    boolean customerWantsCondiments() {
        String input = null;

        System.out.println("Would you like anything with your coffee (y/n) ? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = in.readLine();
            System.out.println(input);
        } catch (IOException ioe) {
            System.err.println("IO error");
        }

        if (input == null) {
            input = "n";
        }

        if (input.toLowerCase().equals("y")) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    void brewBeverage() {
        System.out.println("Brewing Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding some milk to the cofee");
    }
}
