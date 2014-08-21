package Chapter7Facade.Client;

import Chapter7Facade.Facade.HomeTheaterFacade;
import Chapter7Facade.Subsystem.Amplifier;
import Chapter7Facade.Subsystem.Projector;
import Chapter7Facade.Subsystem.Tuner;

/**
 * Created by amri on 15/8/14.
 */
public class FacadeTest {
    public static void main(String[] args) {
        Tuner tuner = new Tuner();
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier(tuner, projector);

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(tuner, projector, amplifier);
        homeTheaterFacade.watchMovie("Home Alone");

        homeTheaterFacade.endMovie("Home Alone");
    }
}
