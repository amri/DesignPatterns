package Chapter7Facade.Subsystem;

/**
 * Created by amri on 15/8/14.
 */
public class Amplifier {
    Tuner tuner;
    Projector projector;


    public Amplifier(Tuner tuner, Projector projector) {
        this.tuner = tuner;
        this.projector = projector;
    }

    public void on() {
        System.out.println("Amplifier On");
    }

    public void off() {
        System.out.println("Amplifier Off");
    }
}
