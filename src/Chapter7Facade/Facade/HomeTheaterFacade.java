package Chapter7Facade.Facade;

import Chapter7Facade.Subsystem.*;
/**
 * Created by amri on 15/8/14.
 */
public class HomeTheaterFacade {
    Tuner tuner;
    Projector projector;
    Amplifier amplifier;

    public HomeTheaterFacade(Tuner tuner, Projector projector, Amplifier amplifier) {
        this.tuner = tuner;
        this.projector = projector;
        this.amplifier = amplifier;
    }

    public void watchMovie(String movie) {
        System.out.println("Putting on movie: " + movie);
        tuner.on();

        projector.on();

        amplifier.on();
    }

    public void endMovie(String movie) {
        System.out.println("Turning off movie: " + movie);

        tuner.off();

        projector.off();

        amplifier.off();
    }
}
